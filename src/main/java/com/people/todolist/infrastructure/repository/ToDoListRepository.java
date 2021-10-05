package com.people.todolist.infrastructure.repository;

import com.people.todolist.infrastructure.entity.ToDoList;
import com.people.todolist.utils.enumeration.StatusEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoListRepository extends JpaRepository<ToDoList, Integer> {
    List<ToDoList> findAllByStatusId(Integer status);
    List<ToDoList> findAllByStatus_Status(StatusEnum statusEnum);
}
