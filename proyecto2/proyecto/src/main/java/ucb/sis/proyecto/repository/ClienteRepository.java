package ucb.sis.proyecto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import ucb.sis.proyecto.entity.Cliente;

public interface ClienteRepository extends CrudRepository <Cliente, Integer>{

}
