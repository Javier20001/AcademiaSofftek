/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.todolist;

import modelo.ListadoTareas;

/**
 *
 * @author kuzni
 */
public class TodoList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListadoTareas lista = new ListadoTareas();
        lista.AgregarTarea("prueba","Agregar primera tarea");
        lista.AgregarTarea("practicar","practicar java");
        lista.AgregarTarea("","tarea con falla");
        lista.EliminarTarea();
        lista.mostrarTareas();
        
    }
}
