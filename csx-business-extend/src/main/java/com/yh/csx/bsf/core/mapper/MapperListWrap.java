package com.yh.csx.bsf.core.mapper;

import com.yh.csx.bsf.core.model.GeneralObject;

import java.util.List;

/**
 * Created by yanglikai on 2019/5/28.
 */
public final class MapperListWrap {
  private List source;

  private MapperListWrap(List source) {
    this.source = source;
  }

  public static MapperListWrap wrap(List source) {
    return new MapperListWrap(source);
  }

  public <E> List<E> tDTO(Class<? extends GeneralObject> target) {
    return tMap(target);
  }

  public <E> List<E> tVO(Class<? extends GeneralObject> target) {
    return tMap(target);
  }

  public <E> List<E> tRequest(Class<? extends GeneralObject> target) {
    return tMap(target);
  }

  public <E> List<E> tResponse(Class<? extends GeneralObject> target) {
    return tMap(target);
  }

  public <E> List<E> tDO(Class<? extends GeneralObject> target) {
    return tMap(target);
  }

  private <E> List<E> tMap(Class<? extends GeneralObject> target) {
    return MapperUtil.map(source, target);
  }
}
