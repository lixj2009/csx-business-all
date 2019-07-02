package com.yh.csx.bsf.core.model;


import com.yh.csx.bsf.core.mapper.MapperUtil;

/**
 * Created by yanglikai on 2019/5/28.
 */
public abstract class GeneralObject extends PageObject {

  protected <T> T map(Class<? extends GeneralObject> target) {
    return MapperUtil.map(this, target);
  }
}
