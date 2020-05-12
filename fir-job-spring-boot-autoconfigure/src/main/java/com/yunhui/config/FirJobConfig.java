package com.yunhui.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Date : 2020/5/12 3:43 下午
 * @Author : dushaoyun
 */
@ConfigurationProperties(
        prefix = "fir.job"
)
@Data
public class FirJobConfig {
    /**
     * 客户端 appName
     */
    private String appName;
    /**
     * 客户端ip
     */
    private String ip;
    /**
     * 服务端ip
     */
    private String serverIp;
    /**
     * 服务端端口
     */
    private Integer serverPort;
}
