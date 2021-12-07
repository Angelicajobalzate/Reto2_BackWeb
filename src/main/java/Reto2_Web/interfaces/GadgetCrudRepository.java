package Reto2_Web.interfaces;


import Reto2_Web.modelo.Gadget;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Angélica Alzate
 */
public interface GadgetCrudRepository extends MongoRepository<Gadget, String> {

    public Optional<Gadget> findById(int id);
    
}
