package org.hibernate.bugs;

import cern.entity.Point;
import jakarta.persistence.Query;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * This template demonstrates how to develop a test case for Hibernate ORM, using the Java Persistence API.
 */
class JPAUnitTestCase {

	private EntityManagerFactory entityManagerFactory;

	@BeforeEach
	void init() {
		entityManagerFactory = Persistence.createEntityManagerFactory( "templatePU" );
	}

	@AfterEach
	void destroy() {
		entityManagerFactory.close();
	}

	@Test
	void nativeQueryOnParentClassShouldNotFail() throws Exception {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
        Query nativeQuery = entityManager.createNativeQuery("SELECT points_0.*, 0 as clazz_ FROM POINTS points_0", Point.class);
        nativeQuery.getResultList();
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
