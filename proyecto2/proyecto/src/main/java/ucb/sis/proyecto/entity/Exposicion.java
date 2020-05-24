package ucb.sis.proyecto.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="proyecto")
public class Exposicion {
	@Id
	private int id_exposicion;
	private String titulo;
	private String descripcion;
	private Timestamp fecha_creacion;
	
	public Exposicion() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Exposicion(int id_exposicion, String titulo, String direccion, Timestamp fecha_creacion) {
	}



	public int getId_exposicion() {
		return id_exposicion;
	}



	public void setId_exposicion(int id_exposicion) {
		this.id_exposicion = id_exposicion;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public Timestamp getFecha_creacion() {
		return fecha_creacion;
	}



	public void setFecha_creacion(Timestamp fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}




	
	
}

	
