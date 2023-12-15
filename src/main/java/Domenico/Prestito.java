package Domenico;

import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class Prestito extends CatalogoBibliotecario{

    private Utente utente;
    @ManyToOne
    private ElementoPrestato elementoPrestato;

    private LocalDate dataInizioPrestito;
    private LocalDate dataRestituzionePrevista;
    private LocalDate dataRestituzioneEffettiva;

    public Prestito(String titolo, LocalDate annoDiPubblicazione, int numeroPagine, LocalDate dataInizioPrestito,LocalDate dataRestituzioneEffettiva) {
        super(titolo, annoDiPubblicazione, numeroPagine);
        this.dataInizioPrestito = dataInizioPrestito;
        this.dataRestituzioneEffettiva=dataRestituzioneEffettiva;
    }

    public Prestito(){

    }

    public LocalDate getDataInizioPrestito() {
        return dataInizioPrestito;
    }

    public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
        this.dataInizioPrestito = dataInizioPrestito;
    }

    public LocalDate getDataRestituzioneEffettiva() {
        return dataRestituzioneEffettiva;
    }

    public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }

    public ElementoPrestato getElementoPrestato() {
        return elementoPrestato;
    }

    public void setElementoPrestato(ElementoPrestato elementoPrestato) {
        this.elementoPrestato = elementoPrestato;
    }

    public LocalDate getDataRestituzionePrevista() {
        return dataRestituzionePrevista;
    }

    public Utente getUtente() {
        return utente;
    }
}
