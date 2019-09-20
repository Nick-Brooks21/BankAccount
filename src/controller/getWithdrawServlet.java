package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.WithdrawTrans;

/**
 * Servlet implementation class getWithdrawServlet
 */
@WebServlet("/getWithdrawServlet")
public class getWithdrawServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getWithdrawServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String withdraw = request.getParameter("withdraw");
		String balance = request.getParameter("balance");
		
		WithdrawTrans newWithdraw = new WithdrawTrans(Integer.parseInt(balance), Integer.parseInt(withdraw));
		
		request.setAttribute("bankAccount", newWithdraw);
		getServletContext().getRequestDispatcher("/withOutput.jsp").forward(request, response); 
	}

}
