package it.helloabitante.service.abitante;

import java.util.List;

import it.helloabitante.dao.abitante.AbitanteDAO;
import it.helloabitante.model.Abitante;

public interface AbitanteService {
	public void setAbitanteDAO(AbitanteDAO abitanteDAO);

	public List<Abitante> cercaPerNomeECognome(String nome, String cognome);
	
	public Abitante cercaPerId(Long id);
	
	public List<Abitante> listAbitanti() throws Exception;
	
	public int elimina(Abitante input) throws Exception;
	
	public int aggiorna(Abitante input) throws Exception;
	
	public int inserisci(Abitante input) throws Exception;
}
