package ucb.sis.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ucb.sis.proyecto.entity.Obra_Exposicion;
import ucb.sis.proyecto.repository.Obra_ExposicionRepository;

@Service

public class Obra_ExposicionService {
	@Autowired
	private Obra_ExposicionRepository Obra_ExposicionRepository;
	
	/*Mostrar*/
	public List<Obra_Exposicion> BuscarTodos () {
		return (List<Obra_Exposicion>) Obra_ExposicionRepository.findAll();
	}
	
	 /*Buscar*/
		public Optional<Obra_Exposicion> BuscarUno (int id) {
			return Obra_ExposicionRepository.findById(id);
		}

		/*Registrar*/
		public Obra_Exposicion Guardar (Obra_Exposicion Exposicion) {
			return Obra_ExposicionRepository.save(Exposicion);
		}

		/*Eliminar*/
		public void EliminarUno (int id) {
			Obra_ExposicionRepository.deleteById(id);
		}

		/*Editar*/
		public Obra_Exposicion ActualizarUno (int id, Obra_Exposicion ExposicionActualizar) {
			Obra_Exposicion ExposicionRetorna = new Obra_Exposicion();
			Optional<Obra_Exposicion> p = Obra_ExposicionRepository.findById(id);
			if (p.isPresent()) {
				ExposicionRetorna = p.get();
				ExposicionRetorna = ExposicionActualizar;
				Obra_ExposicionRepository.save(ExposicionRetorna);
			}
			return ExposicionRetorna;
		}
	
}
