package ucb.sis.proyecto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ucb.sis.proyecto.entity.Obra;
import ucb.sis.proyecto.service.ObraService;



@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/obra") 
public class ObraController {

	@Autowired
	private ObraService ObraService;
	
	@GetMapping
	public List<Obra> ListarTodos () {
		return ObraService.BuscarTodos();
	}
	/*Buscar*/
	@GetMapping("/{id}")
	public Optional<Obra> ListarUno (@PathVariable int id) {
		return ObraService.BuscarUno(id);
	}
	/*Registrar*/
	@PostMapping
	public ResponseEntity<Obra> Guardar (@RequestBody Obra entidadObra) {
		return new ResponseEntity<Obra>(ObraService.Guardar(entidadObra), HttpStatus.CREATED);
	}
	
	/*Eliminar*/
	
	@DeleteMapping("/{id}")
	public void EliminarUno (@PathVariable int id) {
		ObraService.EliminarUno(id);
	}
	
	/*Editar*/
	
	@PutMapping("/{id}")
	public Obra  ActualizarUno (@RequestBody Obra entidadObra ,
									  @PathVariable int id) {
		return ObraService.ActualizarUno(id, entidadObra );
	}
}