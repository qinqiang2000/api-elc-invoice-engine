package com.kingdee.fpy.config.dbconfig;

import com.github.pagehelper.PageInterceptor;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.sql.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@AutoConfigureAfter({DataSourceConfiguration.class})
@MapperScan(
        basePackages = {"com.kingdee.fpy.mapper.*"}
)
@Slf4j
public class MybatisConfiguration {
    @Value("${mysql.datasource.readSize}")
    private String readDataSourceSize;
    @Value("${mysql.datasource.mapperLocations}")
    private String mapperLocations;
    @Value("${mysql.datasource.configLocation}")
    private String configLocation;
    @Autowired
    @Qualifier("writeDataSource")
    private DataSource writeDataSource;
    @Autowired
    @Qualifier("readDataSource")
    private DataSource readDataSource;

   // @Autowired
   // private PartitionKeyDbInterceptor partitionKeyDbInterceptor;
    public MybatisConfiguration() {
    }

    @Bean(
            name = {"sqlSessionFactory"}
    )
    public SqlSessionFactory sqlSessionFactorys() throws Exception {
        log.info("--------------------  sqlsession工程初始化 ---------------------");

        try {
            SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
            sessionFactoryBean.setDataSource(this.roundRobinDataSouceProxy());
            sessionFactoryBean.setTypeAliasesPackage("com.kingdee.**.model.*");
            Resource[] resources = (new PathMatchingResourcePatternResolver()).getResources(this.mapperLocations);
            sessionFactoryBean.setMapperLocations(resources);
            sessionFactoryBean.setConfigLocation((new DefaultResourceLoader()).getResource(this.configLocation));
            PageInterceptor pageInterceptor = this.initPageInterceptor();
           // Interceptor[] plugins1 = new Interceptor[]{pageInterceptor,partitionKeyDbInterceptor};
            //sessionFactoryBean.setPlugins(plugins1);
            return sessionFactoryBean.getObject();
        } catch (IOException var5) {
            log.error("mybatis 配置文件解析出错", var5);
            return null;
        } catch (Exception var6) {
            log.error("mybatis sqlsession工程创建失败", var6);
            return null;
        }
    }

    @Bean(
            name = {"roundRobinDataSouceProxy"}
    )
    public AbstractRoutingDataSource roundRobinDataSouceProxy() {
        Map<Object, Object> targetDataSources = new HashMap();
        targetDataSources.put(DataSourceType.write.getType(), this.writeDataSource);
        targetDataSources.put(DataSourceType.read.getType(), this.readDataSource);

        AbstractRoutingDataSource proxy = new AbstractRoutingDataSource() {
            protected Object determineCurrentLookupKey() {
                String typeKey = DataSourceContextHolder.getReadOrWrite();
                return typeKey == null ? DataSourceType.write.getType() : typeKey;
            }
        };
        proxy.setDefaultTargetDataSource(this.writeDataSource);
        proxy.setTargetDataSources(targetDataSources);
        return proxy;
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    public PlatformTransactionManager annotationDrivenTransactionManager(AbstractRoutingDataSource roundRobinDataSouceProxy) {
//        return new DataSourceTransactionManager((DataSource)SpringContextUtil.getBean("roundRobinDataSouceProxy"));
        return new DataSourceTransactionManager((DataSource)roundRobinDataSouceProxy);
    }

    public PageInterceptor initPageInterceptor() {
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("helperDialect", "mysql");
        properties.setProperty("offsetAsPageNum", "true");
        properties.setProperty("rowBoundsWithCount", "true");
        pageInterceptor.setProperties(properties);
        return pageInterceptor;
    }
}
