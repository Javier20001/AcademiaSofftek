/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import javax.swing.JOptionPane;

/**
 *
 * @author kuzni
 */
public class Tarea {
    private int idTarea;
    private String nombreTarea;
    private String descripcion;

    public Tarea(int idTarea, String nombreTarea, String Descripcion) throws Exception {
        this.idTarea = idTarea;
        setNombreTarea(nombreTarea);
        this.descripcion = Descripcion;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) throws Exception {
        if(nombreTarea.isBlank()) throw new Exception("La Tarea debe tener un nombre");
        this.nombreTarea = nombreTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tarea{" + "idTarea=" + idTarea + ", nombreTarea=" + nombreTarea + ", Descripcion=" + descripcion + '}';
    }
    
    
}
