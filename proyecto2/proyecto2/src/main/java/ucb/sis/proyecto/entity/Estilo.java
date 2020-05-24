package ucb.sis.proyecto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="proyecto")
public class Estilo {
	@Id
	private int id_estilo;
	private String nombre;
	private String descripcion;
	public Estilo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Estilo(int id_estilo, String nombre, String descripcion) {
		super();
		this.id_estilo = id_estilo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public int getId_estilo() {
		return id_estilo;
	}
	public void setId_estilo(int id_estilo) {
		this.id_estilo = id_estilo;
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
