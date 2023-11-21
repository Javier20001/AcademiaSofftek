package com.example.todoListCrudSB.modelo;

import jakarta.persistence.*;


//tenemos la entidad Tarea que va hacer referencia a la tabla dentro de la base de datos
@Entity
@Table(name="Tarea")
public class Tarea {
    //aca estan sus atributos y declaramos cual sera el id y de forma incremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;

    //su constructor vacio requerido
    public Tarea() {}

    //y uno lleno para cuando tenga que traer la informacion
    public Tarea(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //todos sus metodos getter y setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    //y un toString para mostrar adecuadamente la informcion por consola en caso de ser necesario (siempre)
    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
