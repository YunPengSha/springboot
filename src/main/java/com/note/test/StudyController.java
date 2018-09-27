package com.note.test;

import com.note.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudyController {

  @RequestMapping(value = "/a", method = RequestMethod.GET)
  public String a(User user) {
    return "/study/a";
  }

  @RequestMapping(value = "/b", method = RequestMethod.GET)
  public String b(User user) {
    return "/study/b";
  }

  @RequestMapping(value = "/c", method = RequestMethod.GET)
  public String c(User user) {
    return "/study/c";
  }

  @RequestMapping(value = "/video", method = RequestMethod.GET)
  public String video(User user) {
    return "/study/video";
  }
}
