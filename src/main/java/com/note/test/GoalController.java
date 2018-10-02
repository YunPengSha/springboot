package com.note.test;

import com.google.common.collect.ImmutableMap;
import com.note.exception.ServiceException;
import com.note.po.Goal;
import com.note.service.GoalService;
import com.note.util.DateUtil;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GoalController {

  @Autowired
  private GoalService goalService;

  @RequestMapping("/goal/{one}/{two}")
  public ModelAndView getGoal(@PathVariable(value = "one") String one,
      @PathVariable(value = "two") String two) {
    if (!"sha".equals(one) || !"yunpeng".equals(two)) {
      throw new ServiceException("认证失败");
    }
    List<Goal> list = goalService.getGoalsByUserId(1);
    ModelAndView modelAndView = new ModelAndView("/goal");
    modelAndView.addObject("goals", list.stream().map(goal -> {
      return ImmutableMap.builder()
          .put("id", goal.getId())
          .put("goal", goal.getGoal())
          .put("expireTime", StringUtils.isEmpty(goal.getExpireTime()) ? "---"
              : DateUtil.getDateString(goal.getExpireTime()))
          .build();
    }).collect(Collectors.toList()));
    return modelAndView;
  }

}
