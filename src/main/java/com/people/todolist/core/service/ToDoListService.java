package com.people.todolist.core.service;

import com.people.todolist.core.model.ToDoListModel;
import com.people.todolist.core.service.exception.ToDoListNotFoundException;
import com.people.todolist.core.service.exception.UserNotFoundException;
import com.people.todolist.core.service.exception.ValidationException;
import com.people.todolist.infrastructure.entity.ToDoList;
import com.people.todolist.utils.enumeration.StatusEnum;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ToDoListService {

    ToDoList saveToDoList(ToDoListModel toDoListModel) throws ValidationException, UserNotFoundException;
    ToDoList updateToDoListByID(int id, ToDoListModel toDoListModel) throws UserNotFoundException, ToDoListNotFoundException, ValidationException;
    void deleteToDoListByID(int id) throws  ToDoListNotFoundException;
    void deleteAllToDoList() ;
    ToDoListModel getToDoListByID(int id) throws  ToDoListNotFoundException;
    List<ToDoListModel> getOrderedToDoListItems() ;
    List<ToDoListModel> getToDoListItemsBasedOnStatus(StatusEnum status);
    List<ToDoListModel> getActiveToDoListItems();
    List<ToDoListModel> getActiveAndOrderedToDoListItems();

}
