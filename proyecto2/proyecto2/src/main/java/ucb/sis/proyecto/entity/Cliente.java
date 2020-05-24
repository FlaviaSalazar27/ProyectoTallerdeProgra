package ucb.sis.proyecto.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="proyecto")
public class Cliente {
	@Id
	private int id_cliente;
	private String nombre;
	private int telefono;
	private String email;
	private String direccion;
	private Timestamp fecha_creacion;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Cliente(int id_cliente, String nombre, int telefono, String email, String direccion,
			Timestamp fecha_creacion) {
		super();
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
		this.fecha_creacion = fecha_creacion;
	}



	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Timestamp getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Timestamp fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	
	
}

	
