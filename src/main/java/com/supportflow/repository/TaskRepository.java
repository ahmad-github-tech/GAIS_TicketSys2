package com.supportflow.repository;

import com.supportflow.model.SupportTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<SupportTask, Long> {
}
