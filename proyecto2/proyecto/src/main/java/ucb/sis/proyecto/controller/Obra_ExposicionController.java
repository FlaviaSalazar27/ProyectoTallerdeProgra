package ucb.sis.proyecto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ucb.sis.proyecto.entity.Obra_Exposicion;
import ucb.sis.proyecto.service.Obra_ExposicionService;



@RestController
@RequestMapping("/obra/exposicion") 
public class Obra_ExposicionController {

	@Autowired
	private Obra_ExposicionService Obra_ExposicionService;
	
	@GetMapping
	public List<Obra_Exposicion> ListarTodos () {
		return Obra_ExposicionService.BuscarTodos();
	}
	/*Buscar*/
	@GetMapping("/{id}")
	public Optional<Obra_Exposicion> ListarUno (@PathVariable int id) {
		return Obra_ExposicionService.BuscarUno(id);
	}
	/*Registrar*/
	@PostMapping
	public ResponseEntity<Obra_Exposicion> Guardar (@RequestBody Obra_Exposicion entidadObra_Exposicion) {
		return new ResponseEntity<Obra_Exposicion>(Obra_ExposicionService.Guardar(entidadObra_Exposicion), HttpStatus.CREATED);
	}
	
	/*Eliminar*/
	
	@DeleteMapping("/{id}")
	public void EliminarUno (@PathVariable int id) {
		Obra_ExposicionService.EliminarUno(id);
	}
	
	/*Editar*/
	
	@PutMapping("/{id}")
	public Obra_Exposicion  ActualizarUno (@RequestBody Obra_Exposicion entidadObra_Exposicion ,
									  @PathVariable int id) {
		return Obra_ExposicionService.ActualizarUno(id, entidadObra_Exposicion );
	}
}