package thinh.repository;

import org.springframework.data.repository.CrudRepository;
import thinh.model.Smartphone;

public interface SmartphoneRepository extends CrudRepository<Smartphone, Integer> {
}
