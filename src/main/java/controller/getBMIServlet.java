package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BMICalculator;

/**
 * Servlet implementation class getBMIServlet
 */
@WebServlet("/getBMIServlet")
public class getBMIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getBMIServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userFeet = request.getParameter("userFeet"); // set the user input into variables
		String userInches = request.getParameter("userInches");
		String userWeight = request.getParameter("userWeight");
		
		BMICalculator bmi = new BMICalculator(Integer.parseInt(userFeet),Integer.parseInt(userInches),Double.parseDouble(userWeight)); // create bmi object with variables
		
		request.setAttribute("userBMI", bmi); // set the attribute
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response); // put the data onto the results page
	}

}
