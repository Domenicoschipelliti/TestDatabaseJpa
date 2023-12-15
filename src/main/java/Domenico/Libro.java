package Domenico;

import java.time.LocalDate;

public class Libro extends CatalogoBibliotecario{
    private String autore;
    private Genere genere;

    public Libro(String titolo, LocalDate annoDiPubblicazione, int numeroPagine, String autore,Genere genere) {
        super(titolo, annoDiPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere=genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }
}
