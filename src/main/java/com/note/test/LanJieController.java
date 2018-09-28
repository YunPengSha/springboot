package com.note.test;

import com.google.common.collect.ImmutableMap;
import com.note.exception.ServiceException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanJieController {

  @RequestMapping("/lan")
  public Object lan() {
//        if (1 == 1) {
//      throw new ServiceException("我没权限");
//    }
    return ImmutableMap
        .builder()
        .put("code", 200)
        .build();
  }

}
