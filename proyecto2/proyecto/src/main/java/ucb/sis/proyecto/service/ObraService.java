package ucb.sis.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ucb.sis.proyecto.entity.Obra;
import ucb.sis.proyecto.repository.ObraRepository;

@Service

public class ObraService {
	@Autowired
	private ObraRepository ObraRepository;
	
	/*Mostrar*/
	public List<Obra> BuscarTodos () {
		return (List<Obra>) ObraRepository.findAll();
	}
	
	 /*Buscar*/
		public Optional<Obra> BuscarUno (int id) {
			return ObraRepository.findById(id);
		}

		/*Registrar*/
		public Obra Guardar (Obra Obra) {
			return ObraRepository.save(Obra);
		}

		/*Eliminar*/
		public void EliminarUno (int id) {
			ObraRepository.deleteById(id);
		}

		/*Editar*/
		public Obra ActualizarUno (int id, Obra ObraActualizar) {
			Obra ObraRetorna = new Obra();
			Optional<Obra> p = ObraRepository.findById(id);
			if (p.isPresent()) {
				ObraRetorna = p.get();
				ObraRetorna = ObraActualizar;
				ObraRepository.save(ObraRetorna);
			}
			return ObraRetorna;
		}
	
}
