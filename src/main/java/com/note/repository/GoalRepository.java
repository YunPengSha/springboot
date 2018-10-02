package com.note.repository;

import com.note.po.Goal;
import java.util.List;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalRepository extends JpaRepository<Goal, Integer> {

  List<Goal> findAll(Specification<Goal> spec);

}
