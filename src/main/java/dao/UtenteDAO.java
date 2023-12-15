package dao;

import Domenico.CatalogoBibliotecario;
import Domenico.Utente;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UtenteDAO {
    private EntityManager entityManager;

    public UtenteDAO(EntityManager entityManager){
        this.entityManager=entityManager;
    }


    public void save(Utente utente){

        EntityTransaction entityTransaction= entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(utente);
        entityTransaction.commit();
        System.out.println("IL libro è stato dato a " + utente.getNome()+" "+utente.getCognome());

    }
}
