package com.example.todoListCrudSB.interfaces;

import com.example.todoListCrudSB.modelo.Tarea;

import java.util.List;


//acá tenemos la interface con los con los metodos crud básicos a excepciona
//de uno que se utiliza para los mismo que es el agregar y modificar
public interface InterTarea {
    public void guardarTarea(Tarea t);//guarda una tarea pasada por parametro
    public List<Tarea> listarTareas();//devuelve todas las tareas
    public Tarea traerTarea(int idTarea);//devuelve una tarea por id especificado
    public void eliminarTarea(int idTarea);//elimina una tarea en base a un 1 especificado
}
