package dao;

import Domenico.Prestito;
import Domenico.Rivista;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class RivistaDAO {
    private EntityManager entityManager;

    public RivistaDAO(EntityManager entityManager){
        this.entityManager=entityManager;
    }


    public void save(Rivista rivista){

        EntityTransaction entityTransaction= entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(rivista);
        entityTransaction.commit();
        System.out.println("La rivista "+ rivista.getPeriodicita() + " è stata venduta");

    }
}
