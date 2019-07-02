package com.yh.csx.bsf.core.collector;

import com.yh.csx.bsf.core.misc.DateUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * Created by yanglikai on 2019/5/28.
 */
@Slf4j
public final class SapLogCollector {

  private SapLogCollector() {
  }

  public static void collect(String interfaceName, String params) {
    StringBuffer sb = new StringBuffer();

    sb.append("[请求时间]");
    sb.append("->>");
    sb.append(DateUtil.formatTime(new Date()));

    sb.append("^_^");

    sb.append("[请求接口]");
    sb.append("->>");
    sb.append(interfaceName);

    sb.append("^_^");

    sb.append("[请求参数]");
    sb.append("->>");
    sb.append(params);

    log.info(sb.toString());
  }
}
