package com.study.kurs.domain.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.study.kurs.domain.PlayerInformation;

@Repository
public class PlayerInformationRepository {

	@PersistenceContext
	EntityManager em;

	@Transactional
	public void createPlayerInfromation(PlayerInformation playerInformation) {

		PlayerInformation pi = new PlayerInformation();

		em.persist(pi);

	}

	public PlayerInformation getFirst() {
		return em.createQuery("from PlayerInformation", PlayerInformation.class).getResultList().get(0);
	}
}
