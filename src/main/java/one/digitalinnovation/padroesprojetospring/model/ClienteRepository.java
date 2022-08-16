package one.digitalinnovation.padroesprojetospring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository<E, S> extends CrudRepository<Cliente,Long> {
}
