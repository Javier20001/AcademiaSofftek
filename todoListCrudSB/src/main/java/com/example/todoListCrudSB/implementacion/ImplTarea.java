package com.example.todoListCrudSB.implementacion;

import com.example.todoListCrudSB.dao.TareaDao;
import com.example.todoListCrudSB.interfaces.InterTarea;
import com.example.todoListCrudSB.modelo.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//aca esta la implementacion del service de la tarea donde le agregamos logica a los metodos
//esta clase si es marca como service
@Service
public class ImplTarea implements InterTarea {
    @Autowired
    private TareaDao tdao;//hago una inyeccion de dependecia del TareaDao
    @Override
    public void guardarTarea(Tarea t) {
        tdao.save(t);//utilizo el metodo save del dao
    }

    @Override
    public List<Tarea> listarTareas() {
        return (List<Tarea>) tdao.findAll();//utilizo el metodo findAll del dao
    }

    @Override
    public Tarea traerTarea(int idTarea) {
        //este funcion es imposible de que falle ya que siempre va pasar un id correcto por parametro
        return tdao.findById(idTarea).get();//utilizo el metodo findById del dao y retorno lo que encuentre
    }

    @Override
    public void eliminarTarea(int idTarea) {
        tdao.delete(traerTarea(idTarea));//utilizo el traer de esta misma clase y el delete del dao
    }
}
