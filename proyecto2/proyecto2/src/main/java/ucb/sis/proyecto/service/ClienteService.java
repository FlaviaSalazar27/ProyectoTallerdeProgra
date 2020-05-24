package ucb.sis.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ucb.sis.proyecto.entity.Cliente;
import ucb.sis.proyecto.repository.ClienteRepository;

@Service

public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	/*Listado de todos los clientes*/
	public List<Cliente> BuscarTodos () {
		return (List<Cliente>) clienteRepository.findAll();
	}
	
	 /*Busqueda de un registro*/
		public Optional<Cliente> BuscarUno (int id) {
			return clienteRepository.findById(id);
		}

		/*Grabado de un registro*/
		public Cliente Guardar (Cliente cliente) {
			return clienteRepository.save(cliente);
		}

		/*Borrado de un resgistro*/
		public void EliminarUno (int id) {
			clienteRepository.deleteById(id);
		}

		/*Cambio*/
		public Cliente ActualizarUno (int id, Cliente clienteActualizar) {
			Cliente clienteRetorna = new Cliente();
			Optional<Cliente> p = clienteRepository.findById(id);
			if (p.isPresent()) {
				clienteRetorna = p.get();
				clienteRetorna = clienteActualizar;
				clienteRepository.save(clienteRetorna);
			}
			return clienteRetorna;
		}
	
}
