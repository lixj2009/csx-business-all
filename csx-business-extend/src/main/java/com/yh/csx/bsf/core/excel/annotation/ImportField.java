package com.yh.csx.bsf.core.excel.annotation;

import java.lang.annotation.*;

/**
 * Created by yanglikai on 2019/5/28.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface ImportField {
  /**
   * 索引(从0开始).
   *
   * @return
   */
  int index();

  /**
   * 描述.
   *
   * @return
   */
  String desc() default "";

  /**
   * 字段名称.
   *
   * @return
   */
  String name();

  /**
   * 字段类型.
   *
   * @return
   */
  Class type();
}
