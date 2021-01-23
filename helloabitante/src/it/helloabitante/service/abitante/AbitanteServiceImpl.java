package it.helloabitante.service.abitante;

import java.util.List;

import it.helloabitante.dao.abitante.AbitanteDAO;
import it.helloabitante.model.Abitante;

public class AbitanteServiceImpl implements AbitanteService {

	private AbitanteDAO abitanteDAO;

	public void setAbitanteDAO(AbitanteDAO abitanteDAO) {
		this.abitanteDAO = abitanteDAO;
	}

	@Override
	public List<Abitante> cercaPerNomeECognome(String nome, String cognome) {
		// abitanteDAO.setConnection(MyConnection.getConnection());
		return abitanteDAO.findByNomeAndCognome(nome, cognome);
	}

	@Override
	public Abitante cercaPerId(Long id) {
		return abitanteDAO.get(id);
	}

	@Override
	public List<Abitante> listAbitanti() throws Exception {
		return abitanteDAO.list();
	}

	@Override
	public int inserisci(Abitante input) throws Exception {
		abitanteDAO.insert(input);
		return 1;
	}

	@Override
	public int elimina(Abitante input) throws Exception {
		abitanteDAO.delete(input);
		return 1;
	}

	@Override
	public int aggiorna(Abitante input) throws Exception {
		abitanteDAO.update(input);
		return 1;
	}

}
