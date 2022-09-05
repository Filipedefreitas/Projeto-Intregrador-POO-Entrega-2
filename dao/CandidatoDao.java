
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Candidato;



public class CandidatoDao {
    
    private static CandidatoDao instance;
    private List<Candidato> listaCandidatos = new ArrayList<>();
    //private Connection con = ConnectionUtil.getConnection();
    
    /*
        Singleton Design Pattern
    */
    public static CandidatoDao getinstance() {
        if (instance == null) {
            instance = new CandidatoDao();
            
        } 
        return instance;
    }
    public void salvar(Candidato candidato) throws Exception {
		
	}
	
	public void atualizar(Candidato candidato) throws Exception {
		
		}
		
	
	
	public void excluir(int idCandidato) {
            listaCandidatos.remove(idCandidato);
            
		

}
		

	
	public List<Candidato> listar(){
            return listaCandidatos;

        

		
}
    
}
