package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Plan;

import java.util.List;

public interface PlanService extends GenericService<Plan, Integer>{
	public List<Plan> findTop3ByOrderByFechaCreacionDesc();
	Plan crearPlan(Plan nuevoPlan);

}
