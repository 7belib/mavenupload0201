

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.UserData;

/**
 * Servlet implementation class UserJsonServlet
 */
@WebServlet("/UserJsonServlet")
public class UserJsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserJsonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

//		UserData u = new UserData("Tony","0987987789","KMT2");
//		Gson gson = new Gson();
//		System.out.print(gson.toJson(u));
//		response.getWriter().append(gson.toJson(u));
		List<UserData> list=List.of(new UserData("Tony","23826015","Kung Yuan Road"),
				new UserData("Mary","23826016","Kung Yuan Road 30"),
				new UserData("Sunny","23826017","Kung Yuan Road 30-1"));
		Gson gson=new Gson();
		System.out.println(gson.toJson(list));
		response.getWriter().append(gson.toJson(list));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
