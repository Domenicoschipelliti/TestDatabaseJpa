package Domenico;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class CatalogoBibliotecario {
    @Id
    @GeneratedValue
    private long codiceISBN;
    private String titolo;
    private LocalDate annoDiPubblicazione;
    private int numeroPagine;

    public CatalogoBibliotecario(String titolo,LocalDate annoDiPubblicazione,int numeroPagine) {
        this.numeroPagine = numeroPagine;
        this.titolo=titolo;
        this.annoDiPubblicazione=annoDiPubblicazione;
    }

    public CatalogoBibliotecario(){

    }

    public String getTitolo() {
        return titolo;
    }

    public LocalDate getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public long getCodiceISBN() {
        return codiceISBN;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }
}
