package com.yh.csx.bsf.core.config.base;

/**
 * @author: chejiangyi 默认环境枚举
 * @version: 2019-05-27 13:38
 **/
public enum BsfEnvironment {
  JOB_DEV(Environment.dev, "dev.job.yhcsx.cn"),
  //JOB_TEST(Environment.test,"test.job.yhcsx.cn"),
  JOB_PRD(Environment.prd, "prd.job.yhcsx.cn"),

  APOLLO_DEV(Environment.dev, "10.252.193.16"),
  //APOLLO_TEST(Environment.test,"test.apollo.yhcsx.cn"),
  APOLLO_PRD(Environment.prd, "prd.apollo.yhcsx.cn"),

  CAT_DEV(Environment.dev, "dev.cat.yhcsx.cn"),
  //CAT_TEST(Environment.test,"test.cat.yhcsx.cn"),
  CAT_PRD(Environment.prd, "prd.cat.yhcsx.cn"),

  ELK_DEV(Environment.dev, "dev.elk.yhcsx.cn"),
  //ELK_TEST(Environment.test,"test.elk.yhcsx.cn"),
  ELK_PRD(Environment.prd, "prd.elk.yhcsx.cn"),

  ;
  private Environment env;
  private String ip;

  BsfEnvironment(Environment env, String ip) {
    this.env = env;
    this.ip = ip;
  }

  public Environment getEnv() {
    return env;
  }

  public String getIp() {
    return ip;
  }
}
