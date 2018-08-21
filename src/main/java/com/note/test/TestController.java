package com.note.test;

import com.note.po.Student;
import com.note.repository.StudentRepository;
import com.note.vo.User;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

  @Resource
  private StudentRepository studentRepository;

  @RequestMapping("/login")
  public String test() {
    return "login";
  }

  @RequestMapping(value = "/login/confirm", method = RequestMethod.POST)
  public String confirmLogin(User user) {
    return "login";
  }

  @RequestMapping("/show/{id}")
  public String show(ModelMap map, @PathVariable(value = "id") Integer id) {
    Student one = studentRepository.findOne(id);
    map.put("name", one == null ? "无" : one.getName());
    return "success";
  }

  @RequestMapping("/")
  public String a(ModelMap map) {
    map.put("name", "Hello,科大学子");
    return "success";
  }

}
