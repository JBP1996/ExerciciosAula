package serv;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AcertaNumero
 */
@WebServlet("/AcertaNumero")
public class AcertaNumero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AcertaNumero() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Random numerosEleatorios= new Random();
		
		String numero1 = request.getParameter("numero1");
		String numero2 = request.getParameter("numero2");
		String numero3 = request.getParameter("numero3");
		String numero4 = request.getParameter("numero4");
		String numero5 = request.getParameter("numero5");
		int num1= Integer.valueOf(numero1);
		int num2= Integer.valueOf(numero2);
		int num3= Integer.valueOf(numero3);
		int num4= Integer.valueOf(numero4);
		int num5= Integer.valueOf(numero5);
		
		response.getWriter().append("Num1= "+num1+" Num2= "+num2+" Num3= "+num3+" Num4= "+num4+" Num5= "+num5);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
