package Controller;

import model.Pesquisa;
import dao.PesquisaDao;
import java.util.List;

public class PesquisaController {
    
    public void salvar(Pesquisa pesquisa) throws Exception {
		if (pesquisa.getInstituto() == null || pesquisa.getInstituto().length() < 3) {
			throw new Exception("Nome invalido");
		}
		PesquisaDao.getinstance().salvar(pesquisa);
	}
	
	public void atualizar(Pesquisa pesquisa) throws Exception {
		if (pesquisa.getInstituto() == null || pesquisa.getInstituto().length() < 3) {
			throw new Exception("Nome invalido");
		}
		PesquisaDao.getinstance().atualizar(pesquisa);
	}
	
	public void excluir(int idPesquisa) throws Exception {
		if (idPesquisa == 0) {
			throw new Exception("Nenhuma pesquisa selecionada");
		}
		PesquisaDao.getinstance().excluir(idPesquisa);
	}
	
	public List<Pesquisa> listar(){
            
	       return PesquisaDao.getinstance().listar();
	}
    
}
