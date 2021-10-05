package com.people.todolist.infrastructure.repository;

import com.people.todolist.infrastructure.entity.Profession;
import com.people.todolist.utils.enumeration.ProfessionEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionRepository extends JpaRepository<Profession, Integer> {
    Profession findProfessionById(Integer id);
    Profession findByProfession(ProfessionEnum professionEnum);
}