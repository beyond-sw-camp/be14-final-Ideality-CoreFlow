package com.ideality.coreflow.calendar.command.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ideality.coreflow.calendar.command.domain.aggregate.RepeatRule;

@Repository
public interface RepeatRuleRepository extends JpaRepository<RepeatRule, Long> {
    RepeatRule findByScheduleId(Long updatedScheduleId);
}
