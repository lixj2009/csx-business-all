package com.yh.csx.bsf.core.config;


import com.yh.csx.bsf.core.collector.ExceptionLogCollector;
import com.yh.csx.bsf.core.enums.ErrorCodeEnum;
import com.yh.csx.bsf.core.exception.BizException;
import com.yh.csx.bsf.core.wrapper.WrapMapper;
import com.yh.csx.bsf.core.wrapper.Wrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.nio.file.AccessDeniedException;


/**
 * Created by yanglikai on 2019/5/28.
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionConfig {

  /**
   * 参数非法异常.
   *
   * @param e the e
   * @return the wrapper
   */
  @ExceptionHandler({IllegalArgumentException.class, MethodArgumentNotValidException.class})
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ResponseBody
  public Wrapper illegalArgumentException(IllegalArgumentException e) {
    ExceptionLogCollector.collect("参数非法异常[400] => {}", e.getMessage(), e);

    return WrapMapper.wrap(ErrorCodeEnum.GL99990400.code(), ErrorCodeEnum.GL99990400.msg());
  }

  /**
   * 无访问权限异常.
   *
   * @param e the e
   * @return the wrapper
   */
  @ExceptionHandler({AccessDeniedException.class})
  @ResponseStatus(HttpStatus.UNAUTHORIZED)
  @ResponseBody
  public Wrapper unAuthorizedException(AccessDeniedException e) {
    ExceptionLogCollector.collect("无访问权限异常[401] => {}", e.getMessage(), e);

    return WrapMapper.wrap(ErrorCodeEnum.GL99990401.code(), ErrorCodeEnum.GL99990401.msg());
  }

  /**
   * 找不到指定资源异常.
   *
   * @param e
   * @return
   */
  @ExceptionHandler(NoHandlerFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  @ResponseBody
  public Wrapper noHandlerFoundException(NoHandlerFoundException e) {
    ExceptionLogCollector.collect("找不到指定资源异常[404] => {}", e.getMessage(), e);

    return WrapMapper.wrap(ErrorCodeEnum.GL99990404.code(), ErrorCodeEnum.GL99990404.msg());
  }

  /**
   * 业务异常.
   *
   * @param e the e
   * @return the wrapper
   */
  @ExceptionHandler(BizException.class)
  @ResponseStatus(HttpStatus.OK)
  @ResponseBody
  public Wrapper businessException(BizException e) {
    ExceptionLogCollector.collect("业务异常[200] => {}", e.getMessage(), e);

    return WrapMapper.wrap(e.getCode(), e.getMessage());
  }


  /**
   * 未知异常.
   *
   * @param e the e
   * @return the wrapper
   */
  @ExceptionHandler(Exception.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ResponseBody
  public Wrapper exception(Exception e) {
    ExceptionLogCollector.collect("未知异常[500] => ", e.getMessage(), e);

    return WrapMapper.wrap(ErrorCodeEnum.GL99990500.code(), ErrorCodeEnum.GL99990500.msg());
  }
}
