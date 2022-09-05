package Controller;

import java.util.List;

import dao.CandidatoDao;
import model.Candidato;

public class CandidatoController {
    
    public void salvar(Candidato candidato) throws Exception {
		if (candidato.getNome() == null || candidato.getNome().length() < 3) {
			throw new Exception("Nome invalido");
		}
		CandidatoDao.getinstance().salvar(candidato);
	}
	
	public void atualizar(Candidato candidato) throws Exception {
		if (candidato.getNome() == null || candidato.getNome().length() < 3) {
			throw new Exception("Nome inv�lido");
		}
		CandidatoDao.getinstance().atualizar(candidato);
	}
	
	public void excluir(int idCandidato) throws Exception {
		if (idCandidato == 0) {
			throw new Exception("Nenhum candidato selecionado");
		}
		CandidatoDao.getinstance().excluir(idCandidato);
	}
	
	public List<Candidato> listar(){
		return CandidatoDao.getinstance().listar();
	}
    
}
