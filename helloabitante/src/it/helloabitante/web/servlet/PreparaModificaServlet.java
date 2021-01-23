package it.helloabitante.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.helloabitante.model.Abitante;
import it.helloabitante.service.MyServiceFactory;
import it.helloabitante.service.abitante.AbitanteService;

public class PreparaModificaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PreparaModificaServlet() {
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

		try {
			Abitante result = abitanteServiceInstance
					.cercaPerId(Long.parseLong(parametroIdDellAbitanteCheVoglioModificare));
			request.setAttribute("abitanteDaModificare", result);

		} catch (Exception e) {
			e.printStackTrace();
		}
		destinazione = "modificaAbitante.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}

}