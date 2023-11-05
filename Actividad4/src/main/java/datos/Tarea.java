package datos;

import javax.persistence.*;

@Entity
@Table(name = "tarea")
public class Tarea {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="nombreTarea")
	private String nombre;
	
	@Column(name = "descripcionTarea")
	private String descripcion;
	
	public Tarea(){
		
	}
	
	public Tarea(int id, String nombre, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

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
	
	
}
