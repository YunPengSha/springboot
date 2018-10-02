package com.note.service;

import com.note.po.Goal;
import java.util.List;

public interface GoalService {

  List<Goal> getGoalsByUserId(Integer userId);

}
