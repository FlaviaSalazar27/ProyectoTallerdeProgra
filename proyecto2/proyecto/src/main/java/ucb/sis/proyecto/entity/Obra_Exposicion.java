package ucb.sis.proyecto.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="proyecto")
public class Obra_Exposicion {
	@Id
	private int id_obra_exposicion;
	private int id_obra;
	private int id_exposicion;
	
	public Obra_Exposicion() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Obra_Exposicion(int id_obra_exposicion, int id_obra, int id_exposicion) {
	}



	public int getId_obra_exposicion() {
		return id_obra_exposicion;
	}



	public void setId_obra_exposicion(int id_obra_exposicion) {
		this.id_obra_exposicion = id_obra_exposicion;
	}



	public int getId_obra() {
		return id_obra;
	}



	public void setId_obra(int id_obra) {
		this.id_obra = id_obra;
	}



	public int getId_exposicion() {
		return id_exposicion;
	}



	public void setId_exposicion(int id_exposicion) {
		this.id_exposicion = id_exposicion;
	}




	
	
}

	
