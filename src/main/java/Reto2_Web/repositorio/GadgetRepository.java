package Reto2_Web.repositorio;

import Reto2_Web.modelo.Gadget;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto2_Web.interfaces.GadgetCrudRepository;

/**
 *
 * @author Angélica Alzate
 */
@Repository
public class GadgetRepository {
    
    @Autowired
    private GadgetCrudRepository gadgetCrudRepository;
    
    public List<Gadget> getAll(){
        return gadgetCrudRepository.findAll();
    }
    
    public Optional<Gadget> getGadget(int id){
        return gadgetCrudRepository.findById(id);
    }
    
    public Gadget save(Gadget gadget){
        return gadgetCrudRepository.save(gadget);
    }
    
   /* public void update (Gadget gadget){
        gadgetCrudRepository.save(gadget);
    }*/
    
    public void delete(Gadget gadget){
        gadgetCrudRepository.delete(gadget);
    }
}

