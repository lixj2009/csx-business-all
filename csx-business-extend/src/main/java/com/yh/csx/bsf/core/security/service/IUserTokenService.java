package com.yh.csx.bsf.core.security.service;

import com.yh.csx.bsf.core.security.user.SecurityUser;

/**
 * Created by yanglikai on 2019/4/16.
 */
public interface IUserTokenService {

  /**
   * Token效验
   */
  SecurityUser checkToken(String token);
}
