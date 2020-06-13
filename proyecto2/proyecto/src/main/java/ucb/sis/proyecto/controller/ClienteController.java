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

import ucb.sis.proyecto.entity.Cliente;
import ucb.sis.proyecto.service.ClienteService;



@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/cliente") 
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> ListarTodos () {
		return clienteService.BuscarTodos();
	}
	/*Busqueda de un registro*/
	@GetMapping("/{id}")
	public Optional<Cliente> ListarUno (@PathVariable int id) {
		return clienteService.BuscarUno(id);
	}
	/*Grabado de un registro*/
	@PostMapping
	public ResponseEntity<Cliente> Guardar (@RequestBody Cliente entidadCliente) {
		return new ResponseEntity<Cliente>(clienteService.Guardar(entidadCliente), HttpStatus.CREATED);
	}
	
	/*Borrado de Registro*/
	
	@DeleteMapping("/{id}")
	public void EliminarUno (@PathVariable int id) {
		clienteService.EliminarUno(id);
	}
	
/*Cambio*/
	
	@PutMapping("/{id}")
	public Cliente  ActualizarUno (@RequestBody Cliente entidadCliente ,
									  @PathVariable int id) {
		return clienteService.ActualizarUno(id, entidadCliente );
	}
}