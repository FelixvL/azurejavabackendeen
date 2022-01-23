package nl.cf.azurepogingeen.rest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.cf.azurepogingeen.domein.Kamer;

@Component
public interface KamerRepository extends CrudRepository<Kamer,Long>{

}
