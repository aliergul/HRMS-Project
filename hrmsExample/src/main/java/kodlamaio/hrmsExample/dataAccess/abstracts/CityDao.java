package kodlamaio.hrmsExample.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrmsExample.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {
	
	City findByName(String name);
}
