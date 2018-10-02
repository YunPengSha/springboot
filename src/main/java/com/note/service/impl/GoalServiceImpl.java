package com.note.service.impl;

import com.note.po.Goal;
import com.note.repository.GoalRepository;
import com.note.service.GoalService;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoalServiceImpl implements GoalService {

  @Autowired
  private GoalRepository goalRepository;

  @Override
  public List<Goal> getGoalsByUserId(Integer userId) {
    return goalRepository.findAll((Root<Goal> root, CriteriaQuery<?> criteriaQuery,
        CriteriaBuilder criteriaBuilder) -> {
      criteriaQuery.where(criteriaBuilder.equal(root.get("valid"), 1));
      criteriaQuery.where(criteriaBuilder.equal(root.get("userId"), userId));
      criteriaQuery.orderBy(criteriaBuilder.desc(root.get("id").as(Integer.class)));
      return null;
    });
  }
}
