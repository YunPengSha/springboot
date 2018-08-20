package com.note.test;

import com.note.po.Student;
import com.note.repository.StudentRepository;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

  @Resource
  private StudentRepository studentRepository;

  @RequestMapping("/test")
  @ResponseBody
  public Object test() {
    return "success";
  }

  @RequestMapping("/show/{id}")
  public String show(ModelMap map, @PathVariable(value = "id") Integer id) {
    Student one = studentRepository.findOne(id);
    map.put("name", one == null ? "无" : one.getName());
    return "success";
  }

  @RequestMapping("/")
  @ResponseBody
  public Object a() {
    return "Hello,科大学子";
  }

}
