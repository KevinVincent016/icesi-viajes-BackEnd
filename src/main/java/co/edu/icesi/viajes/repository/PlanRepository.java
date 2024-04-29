package co.edu.icesi.viajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.icesi.viajes.domain.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer>{
	
	

}
