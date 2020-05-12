package com.yunhui.config;

import com.yunhui.job.client.FirClient;
import com.yunhui.job.handler.JobHandler;
import com.yunhui.job.properties.FirJobProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Date : 2020/5/12 2:05 下午
 * @Author : dushaoyun
 */
@Configuration
@ConditionalOnClass(value = {JobHandler.class})
@ConditionalOnProperty(value = "fir.job.enable", havingValue = "true")
@EnableConfigurationProperties({FirJobConfig.class})
public class FirJobAutoConfiguration {

    @Bean(initMethod = "start")
    public FirClient firClient(FirJobConfig firJobConfig) {
        return new FirClient(new FirJobProperties(firJobConfig.getAppName(), firJobConfig.getIp(), firJobConfig.getServerIp(), firJobConfig.getServerPort()));
    }
}
