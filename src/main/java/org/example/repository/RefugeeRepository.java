package org.example.repository;

import org.example.dto.Refugee;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class RefugeeRepository {

    private static final EntityManager entityManager = Persistence.createEntityManagerFactory("unit").createEntityManager();

    public void saveRefugee(Refugee toSave){
        entityManager.getTransaction().begin();
        entityManager.persist(toSave);
        entityManager.getTransaction().commit();
    }

    public List<Refugee> getRefugees(){
        entityManager.getTransaction().begin();
        List<Refugee> refugees = entityManager.createQuery("select r from Refugee r").getResultList();
        entityManager.getTransaction().commit();
        return refugees;
    }

}
