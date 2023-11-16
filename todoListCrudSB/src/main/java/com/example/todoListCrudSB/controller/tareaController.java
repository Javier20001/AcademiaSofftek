package com.example.todoListCrudSB.controller;

import com.example.todoListCrudSB.interfaces.InterTarea;
import com.example.todoListCrudSB.modelo.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//este es un controlador que permite conectar nuestra vista con la logica del backend
@Controller
@RequestMapping
public class tareaController {
    @Autowired
    private InterTarea interTarea; //hacemos la inyeccion del la interface donde estan las funciones

    @GetMapping("/")//con esta clausula indicamos la url para accionar esta fucnion del controlador
    public String inicio(Model model){
        List<Tarea> lstTarea = interTarea.listarTareas();//nos traemos todas las tareas
        model.addAttribute("tareas",lstTarea);//y las enviamos al front
        return "index";//y hacemos que muestre la siguiente vista
    }

    @GetMapping("/Agregar")//inidcamos cual sera la url del end point
    public String agregar(Model model){
        model.addAttribute("accion","Agregar");//le paso un mensaje de que accion se va arealizar
        model.addAttribute("tarea", new Tarea());//le paso una tarea vacia
        return "agregar";//y muestra la vista
    }

    //en este caso sera un postMapping ya que vamos hacer un cambio en la bd
    @PostMapping("/Guardar")//end point
    public String guardar(@ModelAttribute Tarea tarea){//obtenemos la tarea que se nos envie
        interTarea.guardarTarea(tarea);//y la guardamos
        return "redirect:/";//y hacemos que la vista se redireccione al endpoint del index
    }

    @GetMapping("/Eliminar/{idTarea}")
    public String eliminarPersona(@PathVariable int idTarea) {//obtenemos el valor pasado por el endpoint
        interTarea.eliminarTarea(idTarea);//y eliminamos en base a ese valor
        return "redirect:/";
    }

    @GetMapping("/Modificar/{idTarea}")
    public String modificar(@PathVariable int idTarea, Model model) {//obtenemos el valor pasado por el endpoint
        Tarea tarea = interTarea.traerTarea(idTarea);//obtenemos la tarea en base a ese valor
        model.addAttribute("tarea",tarea);//y la enviamos a la vista
        return "agregar";//y vamos a la vista
    }
}
