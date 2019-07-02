package com.yh.csx.bsf.core.xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.yh.csx.bsf.core.exception.BizException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.IOException;

/**
 * Created by yanglikai on 2019/5/28.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class XMLUtil {
  private static final XmlMapper OBJECT_MAPPER = new XmlMapper();

  public static String tXML(Object object) {
    try {
      return OBJECT_MAPPER.writeValueAsString(object);
    } catch (JsonProcessingException e) {
      throw new BizException(e);
    }
  }

  public static <T> T tBean(String xml, Class<T> clazz) {
    try {
      return OBJECT_MAPPER.readValue(xml, clazz);
    } catch (IOException e) {
      throw new BizException(e);
    }
  }


  static {
    OBJECT_MAPPER.enable(SerializationFeature.INDENT_OUTPUT);
  }
}
