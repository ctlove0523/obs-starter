package io.github.ctlove0523.starter.obs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述
 *
 * @since 2019-09-11
 */
@ConfigurationProperties(prefix = "obs.info")
@Configuration
public class ObsInfoProperties {

    @Value(value = "${ak:default ak}")
    private String ak;

    @Value(value = "${sk:default sk}")
    private String sk;

    @Value(value = "${endPoint:https://obs.cn-north-5.myhuaweicloud.com}")
    private String endPoint;

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }
}
