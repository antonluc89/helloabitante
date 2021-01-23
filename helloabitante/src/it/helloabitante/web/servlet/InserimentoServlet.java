package it.helloabitante.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.helloabitante.model.Abitante;
import it.helloabitante.service.MyServiceFactory;
import it.helloabitante.service.abitante.AbitanteService;

@WebServlet("/InserimentoServlet")
public class InserimentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InserimentoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destinazione = null;

		AbitanteService abitanteServiceInstance = MyServiceFactory.getAbitanteServiceInstance();

		Long idAbitantedaAggiungereWithParse = null;
		String idAbitantedaAggiungere = null;
		int etaWithParse=0;
		String idAbitanteDaAggiungere = request.getParameter("idAbitante");
		String nomeDaAggiungere = request.getParameter("nomeInput");
		String cognomeDAggiungere = request.getParameter("cognomeInput");
		String codicdFiscaleDaAggiungere = request.getParameter("codiceFiscaleInput");
		String etadaAggiungere = request.getParameter("etaInput");
		String mottoDiVitaDaAggiungere = request.getParameter("mottoDiVitaInput");
		
		etaWithParse = Integer.parseInt(etadaAggiungere);
		idAbitantedaAggiungereWithParse=Long.parseLong(idAbitanteDaAggiungere);
		
		destinazione = "results.jsp";
		try {
			Abitante abitanteDaInserire = new Abitante();
			abitanteDaInserire.setNome(nomeDaAggiungere);
			abitanteDaInserire.setCognome(cognomeDAggiungere);
			abitanteDaInserire.setCodiceFiscale(codicdFiscaleDaAggiungere);
			abitanteDaInserire.setEta(etaWithParse);
			abitanteDaInserire.setMottoDiVita(mottoDiVitaDaAggiungere);
			request.setAttribute("abitanteDaInserire",
					MyServiceFactory.getAbitanteServiceInstance().inserisci(abitanteDaInserire));
			String aggiuntaRiuscita = ("Abitante aggiunto con successo");
			request.setAttribute("aggiuntaRiuscita", aggiuntaRiuscita);
			request.setAttribute("listAbitantiAttributeName", abitanteServiceInstance.listAbitanti());
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}

}