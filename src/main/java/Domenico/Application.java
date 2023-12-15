package Domenico;

import dao.LibroDAO;
import dao.PrestitoDAO;
import dao.RivistaDAO;
import dao.UtenteDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Application {

  private static final EntityManagerFactory em= Persistence.createEntityManagerFactory("JpaPercistence3");
    public static void main(String[] args) {
        EntityManager en=em.createEntityManager();



        Utente utente=new Utente("Domenico","Schipelliti",LocalDate.of(2002,7,23),"Acciao");
        Utente utent=new Utente("Marco","Togni",LocalDate.of(1999,3,20),"Quarantine");
        UtenteDAO ute=new UtenteDAO(en);



        Prestito prestito=new Prestito("Acciaio",LocalDate.of(2000,9,20),34, LocalDate.now(),LocalDate.of(2023,12,17),LocalDate.now(),ElementoPrestato.LIBRO);
        Prestito prestito1=new Prestito("Diablo",LocalDate.of(1990,1,9),200,LocalDate.now(),LocalDate.of(2023,12,23),LocalDate.of(2023,12,24),ElementoPrestato.RIVISTA);
        PrestitoDAO prestitoDAO=new PrestitoDAO(en);

        Libro libro=new Libro("Focalor",LocalDate.of(2023,3,23),23,"Andrea Magnus",Genere.AVVENTURA);
        Libro libro1=new Libro("Raider",LocalDate.of(2000,1,27),300,"Raven Daveport",Genere.FANTASY);
        LibroDAO libroDAO=new LibroDAO(en);

        Rivista rivista=new Rivista("Per Te",LocalDate.of(2000,4,19),10,Periodicita.MENSILE);
        Rivista rivista1=new Rivista("Donne",LocalDate.of(2022,12,2),9,Periodicita.SETTIMANALE);
        RivistaDAO rivistaDAO=new RivistaDAO(en);

        //utente
        ute.save(utente);
        ute.save(utent);
        //prestito
        prestitoDAO.save(prestito);
        prestitoDAO.save(prestito1);
        //libro
        libroDAO.save(libro);
        libroDAO.save(libro1);
        //rivista
        rivistaDAO.save(rivista);
        rivistaDAO.save(rivista1);

    }

}



