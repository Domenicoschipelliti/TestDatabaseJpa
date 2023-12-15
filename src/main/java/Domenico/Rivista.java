package Domenico;

import javax.persistence.Entity;
import java.time.LocalDate;
@Entity
public class Rivista extends CatalogoBibliotecario{


    private Periodicita periodicita;

    public Rivista(String titolo, LocalDate annoDiPubblicazione, int numeroPagine, Periodicita periodicita) {
        super(titolo, annoDiPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }
}
