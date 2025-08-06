package com.kingdee.fpy.config.dbconfig;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 数据源配置
 * 
 * @author xufeng_liu
 *
 */
@Configuration
public class DataSourceConfiguration {

	@Value("${mysql.datasource.type}")
	private Class<? extends DataSource> dataSourceType;

	/**
	 * 写库 数据源配置
	 * 
	 * @return
	 */
	@Bean(name = "writeDataSource")
	@Primary
	@ConfigurationProperties(prefix = "mysql.datasource.write")
	public DataSource writeDataSource() {
		return DataSourceBuilder.create().type(dataSourceType).build();
	}

	/**
	 * @return
	 */
	@Bean(name = "readDataSource")
	@ConfigurationProperties(prefix = "mysql.datasource.read01")
	public DataSource readDataSourceOne() {
		return DataSourceBuilder.create().type(dataSourceType).build();
	}

}
