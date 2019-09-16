package io.github.ctlove0523.starter.obs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;

/**
 * 功能描述
 *
 * @since 2019-09-11
 */
@Configuration
@EnableConfigurationProperties(ObsInfoProperties.class)
@ConditionalOnProperty(value = "obs.enabled", havingValue = "true")
public class ObsAutoConfiguration {

    @Autowired
    private ObsInfoProperties obsProperties;

    @Bean
    public ObsWriter obsWriter() {
        String ak = obsProperties.getAk();
        Assert.notNull(ak, "ak must not be null");
        String sk = obsProperties.getSk();
        Assert.notNull(sk, "sk must not be null");
        String endPoint = obsProperties.getEndPoint();
        Assert.notNull(endPoint, "endPoint must not be null");
        return new ObsWriter(ak, sk, endPoint);
    }

    @Bean
    public ObsReader obsReader() {
        String ak = obsProperties.getAk();
        Assert.notNull(ak, "ak must not be null");
        String sk = obsProperties.getSk();
        Assert.notNull(sk, "sk must not be null");
        String endPoint = obsProperties.getEndPoint();
        Assert.notNull(endPoint, "endPoint must not be null");
        return new ObsReader(ak, sk, endPoint);
    }
}
