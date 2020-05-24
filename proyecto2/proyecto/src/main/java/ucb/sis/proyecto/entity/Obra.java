package ucb.sis.proyecto.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="proyecto")
public class Obra {
	@Id
	private int id_obra;
	private String titulo;
	private String descripcion;
	private double precio;
	private Timestamp fecha_creacion;
	private int id_cliente;
	private int id_estilo;
	
	public Obra() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Obra(int id_obra, String titulo, String direccion, double precio, Timestamp fecha_creacion, int id_cliente, int id_estilo) {
	}



	public int getId_obra() {
		return id_obra;
	}



	public void setId_obra(int id_obra) {
		this.id_obra = id_obra;
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



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public Timestamp getFecha_creacion() {
		return fecha_creacion;
	}



	public void setFecha_creacion(Timestamp fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}



	public int getId_cliente() {
		return id_cliente;
	}



	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}



	public int getId_estilo() {
		return id_estilo;
	}



	public void setId_estilo(int id_estilo) {
		this.id_estilo = id_estilo;
	}



	
	
}

	
