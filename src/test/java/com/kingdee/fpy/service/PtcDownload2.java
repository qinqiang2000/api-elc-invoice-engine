package com.kingdee.fpy.service;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/***
 * 私包处理步骤 1、代码合并到ptc_6.0.1_piaos_20240628分支 2、构建代码，专项补丁(PTC)流水线选择对应的应用和代码分支构建
 * 3、构建包，专属补丁(PTC),选择PTC-2024062800002，重新制作补丁
 * 4、修改下面代码中的版本号，执行下面代码，控制台查看包构建时间，有时候重新制作的补丁还是老的制品，务必确认构建时间是否正确
 * 5、构建目录下会出现私包:imc_版本号_时间.zip
 * 
 * @author kingdee
 *
 */

public class PtcDownload2 {
	/****
	 * 出私包步骤
	 */

//	static String zipName = "PTC.IMC.V6.0.1.FMQAT.1_0710.zip";
//	static String zipName = "PTC.IMC.V6.0.1.ZHOUA.1_0416.zip";

	// 包名，制品包名称
//	public static String zipName = "PTC.IMC.V6.0.1.HISZE.3_0712.zip";
//	public static String zipName = "IMC.V6.0.10.XNYOS.4_0718.zip"; 
//	public static String zipName = "IMC.V6.0.1.SHZQA.1_1011.zip"; 
//	public static String zipName = "IMC.V6.0.1.HISZE.27_0715.zip" ;
	public static String zipName = "IMC.V6.0.8.FPYOV.2_0623.zip"; 
//	public static String zipName = "IMC.V6.0.1.BAIAL.2_0605.zip"; 
//	IMC.V6.0.1.BAIAL.2_0605.zip
	
	// 私包版本号
	public static String version = "5.0.026";
	//public static String version = "7.0.11";
//	PTC.IMC.V7.0.3.MSDYM.5

//	public static String zipName =  
//			"IMC.V6.0.10.XNYOS.8_1121.zip";

	// 制品下载路径
	public static String ptcUrl = "https://cosmicpatch.kingdee.com/download/constellation/cp/" + zipName + "?v="
			+ System.currentTimeMillis();
	// 本地压缩包下载目录
	public static String localDir = "C:\\Users\\kingdee\\Desktop\\tmp\\";
	// 本地解压目录
	public static String unzipDir = "C:\\Users\\kingdee\\Desktop\\tmp\\unzip\\";


	public static boolean createZip = true;

	public static void main(String[] args) {
		// 清空临时目录
		deleteDir(new File(unzipDir));
//
////		download("http://kingdee:Devops@2023@172.18.5.65:8899/artifact/constellation/latest/patch/ptc/"+zipName, localDir + zipName); 
////		http://kingdee:Devops@2023@172.18.5.65:8899/artifact/constellation/latest/patch/ptc/PTC.IMC.V6.0.1.PIAOS.1_0628.zip；
//		// 下载制品
		download(ptcUrl, localDir + zipName);
		// 解压制品
		unzip(localDir + zipName, unzipDir);
		// 提取包构建信息
		showPageInfo();
		if (createZip) {
			// 生成kdpkgs.xml
			createPkgsFile();
			// 压缩打私包
			zip();
			// 清空解压临时目录
			deleteDir(new File(unzipDir));
			// 删除下载的制品
			deleteDir(new File(localDir + zipName));
		}
	}

	public static String download(String url, String filepath) { 
		String remoteFile = null;
		if (zipName.startsWith("PTC")) {
			remoteFile = "\\\\172.18.5.65\\artifact\\constellation\\latest\\patch\\ptc\\temp\\" + zipName;
		} else {
			remoteFile = "\\\\172.18.5.65\\artifact\\constellation\\latest\\patch\\cp\\" + zipName;
		}
		System.out.println(remoteFile);
		try (FileInputStream input = new FileInputStream(new File(remoteFile))) {
			try (FileOutputStream output = new FileOutputStream(filepath)) {
				byte[] data = new byte[1024];
				int bytesRead;
				while ((bytesRead = input.read(data)) != -1) {
					output.write(data, 0, bytesRead);
				}

				output.close();
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(filepath);
		return null;
	}

	public static void showPageInfo() {
		File jardir = new File(unzipDir + "jar\\biz\\");
		File dmdir = new File(unzipDir + "dm\\");
		File resourcedir = new File(unzipDir + "resource\\webapp-imc.zip");
		StringBuilder pageInfo = new StringBuilder();
		if (dmdir.exists()) {
			File subFiles[] = dmdir.listFiles();
			for (File subFile : subFiles) {
				pageInfo.append(showPageInfo(subFile, "datamodel/package.properties"));
			}
		}
		if (jardir.exists()) {
			File subFiles[] = jardir.listFiles();
			for (File subFile : subFiles) {
				pageInfo.append(showPageInfo(subFile, subFile.getName().replace(".zip", "") + "/package.properties"));
			}
		}
		if (resourcedir.exists()) {
			pageInfo.append(showPageInfo(resourcedir, "package.properties"));
		}
		writeStringToFile(localDir + "version.txt", pageInfo.toString());
		System.out.print(pageInfo.toString());

	}

	public static String showPageInfo(File file, String entryPath) {
		try {
			byte[] buf = getPackageInfo(file, entryPath);
			try (InputStream in = new ByteArrayInputStream(buf)) {
				Properties p = new Properties();
				p.load(in);
				StringBuilder pageInfo = new StringBuilder();

				pageInfo.append("分支名称:").append(p.getProperty("BranchName")).append("\t构建时间:")
						.append(p.getProperty("GenerateTime")).append("\t");
				pageInfo.append(file.getName()).append("\r\n");
				return pageInfo.toString();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";

	}

	public static byte[] getPackageInfo(File file, String entryPath) {
		FileInputStream bis = null;
		ZipInputStream zip = null;

		try {
			bis = new FileInputStream(file);
			zip = new ZipInputStream(bis);
			ZipEntry entry = null;

			while ((entry = zip.getNextEntry()) != null) {
				if (entryPath.equals(entry.getName())) {
					byte[] buf = new byte[1024];
					int num = -1;
					ByteArrayOutputStream bos = new ByteArrayOutputStream();
					while ((num = zip.read(buf, 0, buf.length)) != -1) {
						bos.write(buf, 0, num);
					}
					byte[] bb = bos.toByteArray();
					bos.close();

					return bb;
				}
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (zip != null) {
				try {
					zip.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (bis != null) {
				try {
					bis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void unzip(String zipFilePath, String destDir) {
		try {
			File dir = new File(destDir);
			// 创建目标文件夹
			if (!dir.exists()) {
				dir.mkdirs();
			}
			FileInputStream fis = new FileInputStream(zipFilePath);

			ZipInputStream zis = new ZipInputStream(fis);
			ZipEntry entry = zis.getNextEntry();
			// 遍历压缩文件中的所有条目
			while (entry != null) {
				String filePath = destDir + File.separator + entry.getName();
				if (!entry.isDirectory()) {
					// 创建目标文件
					File subDir = new File(filePath);
					subDir.getParentFile().mkdirs();
					FileOutputStream fos = new FileOutputStream(filePath);
					byte[] buffer = new byte[1024];
					int len;
					// 将压缩文件写入目标文件
					while ((len = zis.read(buffer)) > 0) {
						fos.write(buffer, 0, len);
					}
					fos.close();
				} else {
					// 创建目标文件夹
					File subDir = new File(filePath);
					subDir.mkdir();
				}
				// 获取下一个条目
				entry = zis.getNextEntry();
			}
			// 关闭流
			zis.closeEntry();
			zis.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void createPkgsFile() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		StringBuffer sb = new StringBuffer();
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		sb.append("<kdpkgs isv=\"kingdee\" ver=\"").append(version).append("\">\n");
		sb.append("  <format ver=\"1.0\" />\n");
		sb.append("  <description>\n");
		sb.append("    <time>").append(sdf.format(new Date())).append("</time>\n");
		sb.append("    <content></content>\n");
		sb.append("  </description>\n");
		sb.append("  <product name=\"cosmic_imc\" nameCN=\"发票云\" ver=\"").append(version).append("\">\n");
		sb.append("    <force>true</force> \n");
		int i = 0;
		List<String> appids = getAppIds();
		for (String appid : appids) {
			sb.append("	<app>\n");
			sb.append("      <name>").append(appid).append("</name>\n");
			sb.append("      <ver>").append(version).append("</ver>\n");
			sb.append("      <appids>").append(appid).append("</appids>\n");
			sb.append("      <force>true</force>\n");
			sb.append("      <resource>").append(++i).append(",").append(++i).append("</resource>\n");
			sb.append("    </app> \n");
		}
//		sb.append("	<app>\n");
//		sb.append("      <name>imc</name>\n");
//		sb.append("      <ver>").append(version).append("</ver>\n");
//		sb.append("      <appids>imc</appids>\n");
//		sb.append("      <force>true</force>\n");
//		sb.append("      <resource>124653249</resource>\n");
//		sb.append(" </app> \n");

		sb.append("  </product> \n ");
		i = 0;
		for (String appid : appids) {
			sb.append("  <kdpkg>\n");
			sb.append("    <ID>").append(++i).append("</ID>\n");
			sb.append("    <sourcePath>dm</sourcePath>\n");
			sb.append("    <outputPath />\n");
			sb.append("    <name>").append(appid).append("-dm-1.x.zip</name>\n");
			sb.append("    <md5>").append(getMd5("imc-" + appid + System.currentTimeMillis() + "-dm-1.x.zip"))
					.append("</md5>\n");
			sb.append("    <type>dm</type>\n");
			sb.append("  </kdpkg>\n");
			sb.append("  <kdpkg>\n");
			sb.append("    <ID>").append(++i).append("</ID>\n");
			sb.append("    <sourcePath>jar/biz</sourcePath>\n");
			sb.append("    <outputPath>biz</outputPath>\n");
			sb.append("    <name>").append(appid).append(".zip</name>\n");
			sb.append("    <md5>").append(getMd5("imc-" + appid + System.currentTimeMillis() + ".zip"))
					.append("</md5>\n");
			sb.append("    <type>jar</type>\n");
			sb.append("  </kdpkg>\n");
		}
		sb.append("<staticResource ver=\"").append(version).append("\">");
		sb.append("<resource>849179212</resource>");
		sb.append("</staticResource>\n");
		sb.append("<kdpkg>\n");
		sb.append("	<ID>849179212</ID>\n");
		sb.append("	<name>webapp.zip</name>\n");
		sb.append("	<type>staticResource</type>\n");
		sb.append("	<sourcepath>resource</sourcepath>\n");
		sb.append("	<outputpath/>\n");
		sb.append("	<md5>" + getMd5("imc-webapp" + System.currentTimeMillis() + ".zip") + "</md5>\n");
		sb.append("</kdpkg>\n");
//		sb.append("<kdpkg>\n");
//		sb.append("  <ID>124653249</ID>\n");
//		sb.append("  <sourcePath>jar/biz</sourcePath>\n");
//		sb.append("  <outputPath>biz</outputPath>\n");
//		sb.append("  <name>imc.xml</name>\n");
//		sb.append("  <md5>206599bb74da443f8dace4429f5eae26</md5>\n");
//		sb.append("  <type>jar</type>\n");
//		sb.append("</kdpkg>\n");
		sb.append("</kdpkgs>\n");
//		System.out.println(sb.toString()); 
		writeStringToFile(unzipDir + "kdpkgs.xml", sb.toString());

	}

	private static void writeStringToFile(String fileName, String content) {
		try {
			// 指定文件路径
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(content);
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static List<String> getAppIds() {
		File jardir = new File(unzipDir + "jar\\biz\\");
		File[] subFiles = jardir.listFiles();
		List<String> list = new ArrayList<String>(8);
		for (File subFile : subFiles) {
			if (subFile.getName().endsWith(".zip")) {
				list.add(subFile.getName().replace(".zip", ""));
			}
		}
		return list;
	}

	public static String getMd5(String appId) {
		String md5 = md5crypt(appId + System.currentTimeMillis());
		return md5.substring(0, md5.length() - 2) + "01";
	}

	private static void zip() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHH");
		String zipFilePath = localDir + "imc_" + version + "_" + sdf.format(new Date()) + "3.zip";
		try {
			FileOutputStream fos = new FileOutputStream(zipFilePath);
			ZipOutputStream zos = new ZipOutputStream(fos);
			File sourceFolder = new File(unzipDir);
			addFolderToZip(sourceFolder, "", zos);
			zos.flush();
			zos.close();
			fos.flush();
			fos.close();
			System.out.println("私包:" + zipFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void addFolderToZip(File folder, String parentFolderName, ZipOutputStream zos) throws IOException {
		File[] files = folder.listFiles();
		byte[] buffer = new byte[1024];
		int bytesRead;

		for (File file : files) {
			if ("check_sum.json".equals(file.getName())) {
				continue;
			}
			String entry = parentFolderName + "/" + file.getName();
			if (parentFolderName == null || "".equals(parentFolderName)) {
				entry = file.getName();
			}
			if ("webapp-imc.zip".equals(file.getName())) {
				entry = parentFolderName + "/webapp.zip";
			}

			if (file.isDirectory()) {
				addFolderToZip(file, entry, zos);
				continue;
			}

			FileInputStream fis = new FileInputStream(file);
			zos.putNextEntry(new ZipEntry(entry));

			while ((bytesRead = fis.read(buffer)) > 0) {
				zos.write(buffer, 0, bytesRead);
			}

			zos.closeEntry();
			fis.close();
		}
	}

	static char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

	private static String md5crypt(String string) {
		try {
			byte[] btInput = string.getBytes();
			// 获得MD5摘要算法的 MessageDigest 对象
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			// 使用指定的字节更新摘要
			mdInst.update(btInput);
			// 获得密文
			byte[] md = mdInst.digest();
			// 把密文转换成十六进制的字符串形式
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str).toLowerCase();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static boolean deleteDir(File dir) {
		if (dir == null) {
			return false;
		}
		if (dir.isFile()) {
			return dir.delete();
		} else {
			File[] files = dir.listFiles();
			if (files != null) {
				for (File subFile : files) {
					deleteDir(subFile);
				}
			}
			return dir.delete();
		}
	}

}
