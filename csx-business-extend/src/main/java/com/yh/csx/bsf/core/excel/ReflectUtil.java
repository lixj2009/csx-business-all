package com.yh.csx.bsf.core.excel;

import com.yh.csx.bsf.core.collector.ExceptionLogCollector;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by yanglikai on 2019/5/28.
 */
public final class ReflectUtil {

  private ReflectUtil() {
  }

  public static void setFieldValue(final Object obj, final String fieldName, final Object value) {
    try {
      Field field = getAccessibleField(obj, fieldName);

      if (field == null) {
        throw new IllegalArgumentException("Could not find field [" + fieldName + "] on target [" + obj + "]");
      }

      field.set(obj, value);
    } catch (IllegalAccessException e) {
      ExceptionLogCollector.collect(e);
    }
  }

  public static Field getAccessibleField(final Object obj, final String fieldName) {
    for (Class<?> superClass = obj.getClass(); superClass != Object.class; superClass = superClass.getSuperclass()) {
      try {
        Field field = superClass.getDeclaredField(fieldName);
        makeAccessible(field);
        return field;
      } catch (NoSuchFieldException e) {
        ExceptionLogCollector.collect(e);
      }
    }

    return null;
  }

  private static void makeAccessible(Field field) {
    if ((!Modifier.isPublic(field.getModifiers())
        || !Modifier.isPublic(field.getDeclaringClass().getModifiers())
        || Modifier.isFinal(field.getModifiers())) && !field.isAccessible()) {
      field.setAccessible(true);
    }
  }
}
