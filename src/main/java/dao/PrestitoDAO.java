package dao;

import Domenico.Prestito;
import Domenico.Utente;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PrestitoDAO {
    private EntityManager entityManager;

    public PrestitoDAO(EntityManager entityManager){
        this.entityManager=entityManager;
    }


    public void save(Prestito prestito){

        EntityTransaction entityTransaction= entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(prestito);
        entityTransaction.commit();
        System.out.println("Il prestito scadrà il "+prestito.getDataRestituzionePrevista());

    }
}
