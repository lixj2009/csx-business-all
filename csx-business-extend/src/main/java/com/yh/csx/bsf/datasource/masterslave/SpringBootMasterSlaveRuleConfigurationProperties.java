package com.yh.csx.bsf.datasource.masterslave;

import org.apache.shardingsphere.core.yaml.config.masterslave.YamlMasterSlaveRuleConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by yanglikai on 2019/5/27.
 */
@ConfigurationProperties(prefix = "sharding.jdbc.config.masterslave")
public class SpringBootMasterSlaveRuleConfigurationProperties extends YamlMasterSlaveRuleConfiguration {
}
