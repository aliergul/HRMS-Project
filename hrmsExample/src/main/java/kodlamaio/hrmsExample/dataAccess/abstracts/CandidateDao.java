package kodlamaio.hrmsExample.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsExample.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {
	
	Candidate findByEmailOrIdentityNumber(String email, String identityNumber);
}
