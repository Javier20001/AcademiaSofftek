/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import datos.Tarea;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author kuzni
 */
public class Conexion {
     private Connection conectar = null;
    private final String usuario = "root";
    private final String contrasena = "root";
    private final String db = "practica3";
    private final String ip = "localhost";
    private final String puerto = "3306";
    private final String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + db;
 
    public Connection establecerConeccion() {
        try {
            //establezco la conexion con la bd 
            conectar = DriverManager.getConnection(cadena, usuario, contrasena);
            //si sale bien sale un cartel
            JOptionPane.showMessageDialog(null, "Se conectó correctamente");
        } catch (Exception e) {
            //sino, salta otro cartel con el error
           JOptionPane.showMessageDialog(null, "No se pudo conectar" + e.toString());
        }
        return conectar;
    }
    
    public void insert(){
        Connection con = establecerConeccion();//pido que se establezca la conexion 
        try{
            Statement st = con.createStatement();
            //pido que se ingresen los valores que son el nombre y la descipcion 
            String nombre = JOptionPane.showInputDialog(null,"ingrese el nombre de la tarea: ");
             //lanzo una excepcion por si el nombre esta vacio
            if(nombre.isEmpty()) throw new Exception("El nombre no puede estar vacio");
            //luego pido la descripcion
            String descripcion = JOptionPane.showInputDialog(null,"ingrese la descripcion de la tarea: ");
            // declaro la peticion 
            String sql = "insert into tarea(id,nombreTarea,descripcionTarea) values(null,'"+nombre+"','"+descripcion+"')";
            //y ejecuto la peticion
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Se agrego correctamente");
            st.close();
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Hubo un problema: " + e.toString());
        }
    }
    
    public void updateNombre(){
        Connection con = establecerConeccion();
        try {
            Statement st = con.createStatement();
            //pido el id a de la tarea a editar y el nuevo nombre para esa tarea
            String id =  JOptionPane.showInputDialog(null,"ingrese el id de la tarea: ");
            //coloco una excepcion por si no proporcionan un id
            if(id.isEmpty()) throw new Exception("tiene que ingresar un ID");
            String nombre = JOptionPane.showInputDialog(null,"ingrese el nuevo nombre de la tarea: ");
            //hacemos una excepcion en caso de que se le ocurra un poner un nombre vacio
            if(nombre.isEmpty()) throw new Exception("El nombre no puede estar vacio");
            //la peticion
            String sql = "UPDATE tarea SET nombreTarea='"+nombre+"' WHERE id="+Integer.parseInt(id);
            //y la ejecuto
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Se agrego correctamente");
            st.cancel();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un problema: " + e.toString());
        }
    }
    
    public void updateDescripcion(){
        Connection con = establecerConeccion();
        try {
            Statement st = con.createStatement();
            //pido el id a de la tarea a editar y la nueva descripcion para esa tarea
            String id =  JOptionPane.showInputDialog(null,"ingrese el id de la tarea: ");
            //coloco una excepcion por si no proporcionan un id
            if(id.isEmpty()) throw new Exception("tiene que ingresar un ID");
            String descripcion = JOptionPane.showInputDialog(null,"ingrese el nuevo nombre de la tarea: ");
            //escribo la peticion
            String sql = "UPDATE tarea SET descripcionTarea='"+descripcion+"' WHERE id="+Integer.parseInt(id);
            //la ejecuto
            st.executeUpdate(sql);
            //y si sale bien manda un mensaje positivo 
            JOptionPane.showMessageDialog(null, "Se agrego correctamente");
            st.cancel();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un problema: " + e.toString());
        }
    }
    
    public void mostrar(){
        Connection con = establecerConeccion();
        
        try {
            Statement st = con.createStatement();
            //creo la peticion
            String sql = "SELECT * FROM tarea";
            //pido los resultados 
            ResultSet rs = st.executeQuery(sql);
            //y los recorro
            while(rs.next()){
                //por cada fila creo un objeto tarea y lo muestro
                Tarea t = new Tarea(rs.getInt("id"), rs.getString("nombreTarea"), rs.getString("descripcionTarea"));
                System.out.println(t.toString());
            }
            rs.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un problema: " + e.toString());
        }
    }
    
    public void eliminar(){
        Connection con = establecerConeccion();
        try {
            Statement st = con.createStatement();
            //pido el id de la tarea a eliminar
            String id =  JOptionPane.showInputDialog(null,"ingrese el id de la tarea a eliminar: ");
            //coloco una excepcion por si no proporcionan un id
            if(id.isEmpty()) throw new Exception("tiene que ingresar un ID");
            //escribo la peticion
            String sql = "DELETE from tarea where id="+id;
            //y la ejecuto 
            st.executeUpdate(sql);
            //muesto un mensaje positivo
            JOptionPane.showInputDialog(null,"Se elimino correctamente");
            //y cerramos el statement y la conexion
            st.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un problema: " + e.toString());
        }
    }
}
