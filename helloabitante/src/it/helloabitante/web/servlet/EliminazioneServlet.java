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

@WebServlet("/EliminazioneServlet")
public class EliminazioneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EliminazioneServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws NumberFormatException, ServletException, IOException {

		String destinazione = null;
		String parametroIdDellAbitanteCheVoglioEliminare = request.getParameter("idDaInviareComeParametro");

		AbitanteService abitanteServiceInstance = MyServiceFactory.getAbitanteServiceInstance();

		try {

			Abitante abitanteDaEliminare = abitanteServiceInstance
					.cercaPerId(Long.parseLong(parametroIdDellAbitanteCheVoglioEliminare));
			MyServiceFactory.getAbitanteServiceInstance().elimina(abitanteDaEliminare);
		
			String rimozioneRiuscita = ("Abitante con id: " + abitanteDaEliminare.getIdAbitante() + "eliminato");
			request.setAttribute("rimozioneRiuscita", rimozioneRiuscita);
			request.setAttribute("listAbitantiAttributeName", MyServiceFactory.getAbitanteServiceInstance().listAbitanti());
			destinazione = "results.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(destinazione);
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
