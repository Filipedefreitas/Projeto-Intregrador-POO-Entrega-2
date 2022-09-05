package model;
public class Candidato {
    //Atributos
    private String Nome,Partido;
    private int idCandidato;
    private boolean FichaLimpa;
    //Construtores
    public Candidato(String Candidato, String Partido, boolean FichaLimpa) {
        this.Nome = null;
        this.Partido = Partido;
        this.FichaLimpa = true;
    }

    public Candidato(int id) {
        this.idCandidato = id;
    }

    public Candidato() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //SETs e GETs

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getPartido() {
        return Partido;
    }

    public void setPartido(String Partido) {
        this.Partido = Partido;
    }

    public boolean getFichaLimpa() {
        return FichaLimpa;
    }

    public void setFichaLimpa(boolean FichaLimpa) {
        this.FichaLimpa = FichaLimpa;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }
    
    }
    
    
    

