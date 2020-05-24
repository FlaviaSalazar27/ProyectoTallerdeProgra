package ucb.sis.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ucb.sis.proyecto.entity.Exposicion;
import ucb.sis.proyecto.repository.ExposicionRepository;

@Service

public class ExposicionService {
	@Autowired
	private ExposicionRepository ExposicionRepository;
	
	/*Mostrar*/
	public List<Exposicion> BuscarTodos () {
		return (List<Exposicion>) ExposicionRepository.findAll();
	}
	
	 /*Buscar*/
		public Optional<Exposicion> BuscarUno (int id) {
			return ExposicionRepository.findById(id);
		}

		/*Registrar*/
		public Exposicion Guardar (Exposicion Exposicion) {
			return ExposicionRepository.save(Exposicion);
		}

		/*Eliminar*/
		public void EliminarUno (int id) {
			ExposicionRepository.deleteById(id);
		}

		/*Editar*/
		public Exposicion ActualizarUno (int id, Exposicion ExposicionActualizar) {
			Exposicion ExposicionRetorna = new Exposicion();
			Optional<Exposicion> p = ExposicionRepository.findById(id);
			if (p.isPresent()) {
				ExposicionRetorna = p.get();
				ExposicionRetorna = ExposicionActualizar;
				ExposicionRepository.save(ExposicionRetorna);
			}
			return ExposicionRetorna;
		}
	
}
