package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.TempConverter;

/**
 * Servlet implementation class getTempServlet
 */
@WebServlet("/getTempServlet")
public class getTempServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTempServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Local variable declaration and initialization.
		String userTemp = request.getParameter("userTemp");
		String userScaleInitial = request.getParameter("userScaleInitial");
		String userScaleFinal = request.getParameter("userScaleFinal");
		
		// If field is left empty, set it to zero.
		if (userTemp.isEmpty()) {
			userTemp = "0";
		}
		
		TempConverter tempObject = new TempConverter(Double.parseDouble(userTemp),
												   userScaleInitial, userScaleFinal);
		
		request.setAttribute("tempObject", tempObject);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
