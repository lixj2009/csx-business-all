package com.yh.csx.bsf.core.model;

import lombok.Data;

/**
 * Created by yanglikai on 2019/5/28.
 */
@Data
public class CRUResponse extends GeneralResponse {

  private boolean success;

  public CRUResponse() {
    this.success = true;
  }

  public CRUResponse(boolean success) {
    this.success = success;
  }
}
