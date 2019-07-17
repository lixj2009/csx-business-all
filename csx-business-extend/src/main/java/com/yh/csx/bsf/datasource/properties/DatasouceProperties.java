package com.yh.csx.bsf.datasource.properties;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanglikai on 2019/5/27.
 */
@Data
public class DatasouceProperties {
  private String type;

  private String driverClassName;

  private String url;

  private String username;

  private String password;

  private String filters;

  private Integer  maxActive;

  private Integer initialSize;

  private Long maxWait;

  private Integer minIdle;

  private Long timeBetweenEvictionRunsMillis;

  private Long minEvictableIdleTimeMillis;

  private String validationQuery;

  private Boolean testWhileIdle;

  private Boolean testOnBorrow;

  private Boolean testOnReturn;

  private Boolean poolPreparedStatements;

  private Integer maxOpenPreparedStatements;

  public Map<String, Object> tMap() {
    Map<String, Object> result = new HashMap<>(18);

    result.put("type", type);
    result.put("driverClassName", driverClassName);
    result.put("url", url);
    result.put("username", username);
    result.put("password", password);
    result.put("filters", filters);
    result.put("maxActive", maxActive);
    result.put("initialSize", initialSize);
    result.put("maxWait", maxWait);
    result.put("minIdle", minIdle);
    result.put("timeBetweenEvictionRunsMillis", timeBetweenEvictionRunsMillis);
    result.put("minEvictableIdleTimeMillis", minEvictableIdleTimeMillis);
    result.put("validationQuery", validationQuery);
    result.put("testWhileIdle", testWhileIdle);
    result.put("testOnBorrow", testOnBorrow);
    result.put("testOnReturn", testOnReturn);
    result.put("poolPreparedStatements", poolPreparedStatements);
    result.put("maxOpenPreparedStatements", maxOpenPreparedStatements);

    return result;
  }
}
