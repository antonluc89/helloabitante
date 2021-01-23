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

@WebServlet("/ModificaServlet")
public class ModificaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ModificaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destinazione = null;

		String parametroIdDellAbitanteCheVoglioModificare = request.getParameter("idDaInviareComeParametro");
		
		AbitanteService abitanteServiceInstance = MyServiceFactory.getAbitanteServiceInstance();

	
		int etaWithParse=0;
	Long idParsato= Long.parseLong(parametroIdDellAbitanteCheVoglioModificare);
		String nomeDaModificare = request.getParameter("nomeModify");
		String cognomeDaModificare = request.getParameter("cognomeModify");
		String codicdFiscaleDaModificare = request.getParameter("codiceFiscaleModify");
		String etaDaModificare = request.getParameter("etaModify");
		String mottoDiVitaDaModificare = request.getParameter("mottoDiVitaModify");
		
		etaWithParse = Integer.parseInt(etaDaModificare);

		
		destinazione = "results.jsp";
		try {
			Abitante abitanteDaModificare = new Abitante();
			abitanteDaModificare.setIdAbitante(idParsato);
			abitanteDaModificare.setNome(nomeDaModificare);
			abitanteDaModificare.setCognome(cognomeDaModificare);
			abitanteDaModificare.setCodiceFiscale(codicdFiscaleDaModificare);
			abitanteDaModificare.setEta(etaWithParse);
			abitanteDaModificare.setMottoDiVita(mottoDiVitaDaModificare);
			request.setAttribute("abitanteDaModificare",
					MyServiceFactory.getAbitanteServiceInstance().aggiorna(abitanteDaModificare));
			String aggiuntaRiuscita = ("Abitante modificato con successo");
			request.setAttribute("modificaRiuscita", aggiuntaRiuscita);
			request.setAttribute("listAbitantiAttributeName", abitanteServiceInstance.listAbitanti());
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}

}