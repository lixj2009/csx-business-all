package com.yh.csx.bsf.core.task;

/**
 * Created by yanglikai on 2019/5/28.
 */
public interface Task<T> {

  void async(T target);

  void sync(T target);
}
