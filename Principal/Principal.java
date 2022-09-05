package Principal;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import Controller.CandidatoController;
import Controller.PesquisaController;

import model.Candidato;
import model.Pesquisa;


public class Principal {
    public static void main(String[] args) {
//      testeCliente();
//	testeProduto();
	testeCandidato();
    }
    public static void testeCandidato() {
		Candidato c1 = new Candidato();
		c1.setIdCandidato(1);
		c1.setNome("JOAO PAULO");
		c1.setPartido("Novo");
		c1.setFichaLimpa(true);
		
		Candidato c2 = new Candidato();
		c2.setIdCandidato(2);
		c2.setNome("PEDRO PAULO");
		c2.setPartido("Podemos");
		c2.setFichaLimpa(true);
                
                Candidato c3 = new Candidato();
		c3.setIdCandidato(3);
		c3.setNome("JOAO PAULO");
		c3.setPartido("PSOL");
		c3.setFichaLimpa(false);
		
		CandidatoController controller = new CandidatoController();
		try {
			controller.salvar(c1);
			controller.salvar(c2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (Candidato c : controller.listar()) {
			System.out.println(c.toString());
		}
	}
	
	public static void testePesquisa() {
		
		Pesquisa p1 = new Pesquisa();
		p1.setIdPesquisa(1);
		p1.setInstituto("Picole de Morango");
		p1.setLocal("Praça da Sé");
		
		Pesquisa p2 = new Pesquisa();
		p2.setIdPesquisa(2);
		p2.setInstituto("Pesquisa Datafolha");
		p2.setLocal("Parque Ibirapuera");

PesquisaController controller = new PesquisaController();
		try {
			controller.salvar(p1);
			controller.salvar(p2);
                       }catch (Exception e) {
			System.out.println(e.getMessage());
}
}
    
}
