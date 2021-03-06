package Action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Controller.Action;
import Controller.ActionForward;
import DAO.DAO_RetrieveObjects;
import Model.email;

public class retrieveobjectsby implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		//ArrayList<ObjectDTO> listdto= new ArrayList<ObjectDTO>();
		ArrayList<email> emaillist=new ArrayList<email>();
		String psid= request.getParameter("ps_id");
		emaillist = new DAO_RetrieveObjects().retrieveobjectby(psid);
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		String gsondto= new Gson().toJson(emaillist);
		
		response.getWriter().write(gsondto);
		System.out.println(gsondto);
		return null;
	}

}
