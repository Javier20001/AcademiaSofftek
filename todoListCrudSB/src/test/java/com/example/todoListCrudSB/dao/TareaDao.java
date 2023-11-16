/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.todoListCrudSB.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.todoListCrudSB.modelo.Tarea;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kuzni
 */
@Repository
public interface TareaDao extends CrudRepository<Tarea, Integer> {
    
}
