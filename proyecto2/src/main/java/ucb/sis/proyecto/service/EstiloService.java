package ucb.sis.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ucb.sis.proyecto.entity.Estilo;
import ucb.sis.proyecto.repository.EstiloRepository;




@Service

public class EstiloService {
	@Autowired
	private EstiloRepository estiloRepository;
	/*Listado de estilo*/
	public List<Estilo> BuscarTodos () {
		return (List<Estilo>) estiloRepository.findAll();
	}
	/*Busqueda de un registro*/
	public Optional<Estilo> BuscarUno (int id) {
		return estiloRepository.findById(id);
	}
	
	/*Grabado de un registro*/
	public Estilo Guardar (Estilo estilo) {
		return estiloRepository.save(estilo);
	}

	/*Borrado de un resgistro*/
	public void EliminarUno (int id) {
		estiloRepository.deleteById(id);
	}

	/*Cambio*/
	public Estilo ActualizarUno (int id, Estilo estiloActualizar) {
		Estilo estiloRetorna = new Estilo();
		Optional<Estilo> e = estiloRepository.findById(id);
		if (e.isPresent()) {
			estiloRetorna = e.get();
			estiloRetorna = estiloActualizar;
			estiloRepository.save(estiloRetorna);
		}
		return estiloRetorna;
	}



}
