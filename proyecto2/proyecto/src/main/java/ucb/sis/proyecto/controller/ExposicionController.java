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

import ucb.sis.proyecto.entity.Exposicion;
import ucb.sis.proyecto.service.ExposicionService;



@RestController
@RequestMapping("/exposicion") 
public class ExposicionController {

	@Autowired
	private ExposicionService ExposicionService;
	
	@GetMapping
	public List<Exposicion> ListarTodos () {
		return ExposicionService.BuscarTodos();
	}
	/*Buscar*/
	@GetMapping("/{id}")
	public Optional<Exposicion> ListarUno (@PathVariable int id) {
		return ExposicionService.BuscarUno(id);
	}
	/*Registrar*/
	@PostMapping
	public ResponseEntity<Exposicion> Guardar (@RequestBody Exposicion entidadExposicion) {
		return new ResponseEntity<Exposicion>(ExposicionService.Guardar(entidadExposicion), HttpStatus.CREATED);
	}
	
	/*Eliminar*/
	
	@DeleteMapping("/{id}")
	public void EliminarUno (@PathVariable int id) {
		ExposicionService.EliminarUno(id);
	}
	
	/*Editar*/
	
	@PutMapping("/{id}")
	public Exposicion  ActualizarUno (@RequestBody Exposicion entidadExposicion ,
									  @PathVariable int id) {
		return ExposicionService.ActualizarUno(id, entidadExposicion );
	}
}