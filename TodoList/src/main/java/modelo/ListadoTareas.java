/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kuzni
 */
public class ListadoTareas {
    private List<Tarea> listadoTareas;

    public ListadoTareas() {
        listadoTareas = new ArrayList<Tarea>();
    }

    public List<Tarea> getListadoTareas() {
        return listadoTareas;
    }

    public void setListadoTareas(List<Tarea> listadoTareas) {
        this.listadoTareas = listadoTareas;
    }

    @Override
    public String toString() {
        return "ListadoTareas{" + "listadoTareas=" + listadoTareas + '}';
    }
    
    public void AgregarTarea(String nombre , String descripcion){
        try {
            //uso un operado ternario para saber si la lista esta vacia y agregar un priemra tarea con id 0 o una nueva tarea con el ultimo id que se agrego
            Tarea t = (this.listadoTareas.size()>0) ? new Tarea(this.listadoTareas.get(this.listadoTareas.size()-1).getIdTarea()+1 , nombre, descripcion) : new Tarea(0, nombre, descripcion); 
            this.listadoTareas.add(t); // se agrega
            JOptionPane.showMessageDialog(null, "Se Agrego Correctamente");//y un mensaje
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
    
    public void EliminarTarea(){
        mostrarTareas();
        Scanner input = new Scanner(System.in);
        System.out.print("mediante el id elija la tarea a eliminar: ");
        int id = input.nextInt();
        Optional<Tarea> tarea = listadoTareas.stream()
            .filter(t -> t.getIdTarea() == id)
            .findFirst();// uso un stream para recorrer la lista y encontrar la tarea con id "n"
        if(tarea.isPresent()){ //me indica si el valor es distinto de null
            listadoTareas.remove(tarea.get());//y si es asi lo guardo
            JOptionPane.showMessageDialog(null, "Se elimino la tarea");
        }else{
            System.out.println("No hay una tarea con ese id");
        }
    }
    
    public void mostrarTareas(){
        for(Tarea t : this.listadoTareas){
            System.out.println(t.toString());
        }
    }
}
