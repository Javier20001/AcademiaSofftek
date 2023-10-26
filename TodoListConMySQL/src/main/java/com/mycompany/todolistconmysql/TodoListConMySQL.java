/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.todolistconmysql;

import dao.Conexion;

/**
 *
 * @author kuzni
 */
public class TodoListConMySQL {

    public static void main(String[] args) {
        Conexion con = new Conexion();
        //con.insert();
        con.updateNombre();
        //con.updateDescripcion();
        //con.eliminar();
        con.mostrar();
    }
}
