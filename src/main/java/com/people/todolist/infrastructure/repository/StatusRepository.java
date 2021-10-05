package com.people.todolist.infrastructure.repository;

import com.people.todolist.infrastructure.entity.Status;
import com.people.todolist.utils.enumeration.StatusEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {
    Status findByStatus(StatusEnum statusEnum);
    Status findStatusById(Integer id);
}
