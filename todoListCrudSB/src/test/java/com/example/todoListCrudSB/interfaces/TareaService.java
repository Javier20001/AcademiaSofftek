/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.todoListCrudSB.interfaces;
import com.example.todoListCrudSB.modelo.Tarea;
import java.util.List;
/**
 *
 * @author kuzni
 */

public interface TareaService {
    public void AgregarTarea(Tarea t);
    public Tarea TraerTarea(int idTarea);
    public void DeleteTarea(int idTarea);
    public List<Tarea> ListarTarea();
    
}
