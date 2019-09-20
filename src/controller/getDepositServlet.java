package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DepositTrans;

/**
 * Servlet implementation class getDepositServlet
 */
@WebServlet("/getDepositServlet")
public class getDepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getDepositServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String deposit = request.getParameter("deposit");
		String balance = request.getParameter("balance");
		
		DepositTrans newDeposit = new DepositTrans(Integer.parseInt(deposit), Integer.parseInt(balance));
		
		request.setAttribute("bankAccount", newDeposit);
		getServletContext().getRequestDispatcher("/output.jsp").forward(request, response); 
	}

}
