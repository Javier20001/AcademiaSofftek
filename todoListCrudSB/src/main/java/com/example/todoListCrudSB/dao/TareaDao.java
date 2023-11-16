package com.example.todoListCrudSB.dao;

import com.example.todoListCrudSB.modelo.Tarea;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


//este seria la capa repositorio donde se hacen las peticiones a la base de datos
//como es una interface ya tiene todas los metodos pre escritas y solo hay que llamarlos
@Repository
public interface TareaDao extends CrudRepository<Tarea,Integer> {
}
