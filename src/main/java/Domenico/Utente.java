package Domenico;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class Utente extends  CatalogoBibliotecario{
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;

    @JoinColumn
    @GeneratedValue
    private long numeroTessera;

    public Utente(String nome,String cognome,LocalDate dataDiNascita,String titolo) {
        this.nome = nome;
        this.cognome=cognome;
        this.dataDiNascita=dataDiNascita;
    }

    public Utente(){

    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getNumeroTessera() {
        return numeroTessera;
    }
}
