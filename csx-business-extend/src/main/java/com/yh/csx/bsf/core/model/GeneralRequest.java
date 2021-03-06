package com.yh.csx.bsf.core.model;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.yh.csx.bsf.core.exception.BizException;

/**
 * Created by yanglikai on 2019/5/28.
 */
public abstract class GeneralRequest extends GeneralObject {

  public <T> T tDO(Class<? extends GeneralObject> target) {
    return map(target);
  }

  public EntityWrapper tEntityWrapper() {
    throw new BizException("tEntityWrapper未实现");
  }
}
