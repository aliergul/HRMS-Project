package kodlamaio.hrmsExample.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrmsExample.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	
	List<JobAdvertisement> getByStatusTrue();
	List<JobAdvertisement> getByStatusTrueOrderByStartDateDesc();
	List<JobAdvertisement> getByStatusTrueAndEmployer_CompanyName(String companyName);
	
	@Modifying
	@Query("Update JobAdvertisement jat set status = false where jat.id = :id")
	void updateJobAdvertisementStatus(int id);
}
