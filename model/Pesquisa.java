package model;

import java.time.LocalDate;

public class Pesquisa {
    private String Instituto,Local,Tipo,Formato;
    private LocalDate Data;
    private float Media_idade;
    private int idPesquisa;

    public Pesquisa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getIdPesquisa() {
        return idPesquisa;
    }

    public void setIdPesquisa(int idPesquisa) {
        this.idPesquisa = idPesquisa;
    }

    public Pesquisa(int idPesquisa) {
        this.idPesquisa = idPesquisa;
    }

    public Pesquisa(String instituto, String Local, String Tipo, String Formato, LocalDate Data, float Media_idade) {
        this.Instituto = instituto;
        this.Local = Local;
        this.Tipo = Tipo;
        this.Formato = Formato;
        this.Data = Data;
        this.Media_idade = Media_idade;
    }

    public String getInstituto() {
        return Instituto;
    }

    public void setInstituto(String instituto) {
        this.Instituto = instituto;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String Local) {
        this.Local = Local;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }

    public LocalDate getData() {
        return Data;
    }

    public void setData(LocalDate Data) {
        this.Data = Data;
    }

    public float getMedia_idade() {
        return Media_idade;
    }

    public void setMedia_idade(float Media_idade) {
        this.Media_idade = Media_idade;
    }
    
    
    
    
}
