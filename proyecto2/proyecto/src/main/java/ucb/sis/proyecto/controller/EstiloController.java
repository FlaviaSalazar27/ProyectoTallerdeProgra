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

import ucb.sis.proyecto.entity.Estilo;
import ucb.sis.proyecto.service.EstiloService;

@RestController
@RequestMapping("/estilo") 
public class EstiloController {

	@Autowired
	private EstiloService estiloService;
	
	@GetMapping
	public List<Estilo> ListarTodos () {
		return estiloService.BuscarTodos();
	}
	/*Busqueda de un registro*/
	@GetMapping("/{id}")
	public Optional<Estilo> ListarUno (@PathVariable int id) {
		return estiloService.BuscarUno(id);
	}
	/*Grabado de un registro*/
	@PostMapping
	public ResponseEntity<Estilo> Guardar (@RequestBody Estilo entidadEstilo) {
		return new ResponseEntity<Estilo>(estiloService.Guardar(entidadEstilo), HttpStatus.CREATED);
	}
	
	/*Borrado de Registro*/
	
	@DeleteMapping("/{id}")
	public void EliminarUno (@PathVariable int id) {
		estiloService.EliminarUno(id);
	}
	
/*Cambio*/
	
	@PutMapping("/{id}")
	public Estilo  ActualizarUno (@RequestBody Estilo entidadEstilo ,
									  @PathVariable int id) {
		return estiloService.ActualizarUno(id, entidadEstilo );
	}
}
