package Domenico;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;
@Entity
public class Rivista extends CatalogoBibliotecario{

    @Enumerated(EnumType.STRING)
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
