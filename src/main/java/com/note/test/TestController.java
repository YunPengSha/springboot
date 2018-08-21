package com.note.test;

import com.note.po.Student;
import com.note.repository.StudentRepository;
import com.note.vo.User;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
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
  public String confirmLogin(User user, ModelMap map) {
    List<Student> students = studentRepository.findAll();
    map.put("students", students);
    return "redirect:/show";
  }

  @RequestMapping("/show")
  public String show(ModelMap map) {
    List<Student> students = studentRepository.findAll();
    map.put("students", students);
    return "show";
  }

  @RequestMapping("/")
  public String a(ModelMap map) {
    return "login";
  }

  @RequestMapping(value = "/add", method = RequestMethod.POST)
  public String add(User user) {
    Student s = new Student();
    s.setName(user.getUsername());
    studentRepository.save(s);
    return "redirect:/show";
  }

}
