package Servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BoasVindas
 */
@WebServlet("/BoasVindas.do")
public class BoasVindas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoasVindas() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida  = response.getWriter();
		String nome = request.getParameter("name");
		
		if(!nome.isEmpty()) {
			saida.println("Ola�, " + nome + "!");
		} else {
			saida.println("Volte e informe o seu nome!");
		}
		
	}

	

}
