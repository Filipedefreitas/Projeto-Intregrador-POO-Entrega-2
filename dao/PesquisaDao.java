package dao;

import java.util.ArrayList;
import java.util.List;
import model.Pesquisa;


public class PesquisaDao {
    
    private static PesquisaDao instance;
    private List<Pesquisa> listaPesquisa = new ArrayList<>();
    //private Connection con = ConnectionUtil.getConnection();
    
    /*
        Singleton Design Pattern
    */
    public static PesquisaDao getinstance() {
        if (instance == null) {
            instance = new PesquisaDao();   
            
        } 
        return instance;
    }
    public void salvar(Pesquisa pesquisa) throws Exception {
		
	}
	
	public void atualizar(Pesquisa pesquisa) throws Exception {
		
		}
		
	
	
	public void excluir(int idPesquisa) {
            listaPesquisa.remove(idPesquisa);
            
		

}
		

	
	public List<Pesquisa> listar(){
            return listaPesquisa;

               }
}