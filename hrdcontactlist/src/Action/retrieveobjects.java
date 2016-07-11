package Action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import Controller.Action;
import Controller.ActionForward;
import Model.DAO_RetrieveObjects;
import Model.email;

public class retrieveobjects implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		DAO_RetrieveObjects _email = new DAO_RetrieveObjects();
		ArrayList<email> objectlist = _email.ListObjects();
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		String obj= new Gson().toJson(objectlist);
		System.out.println(obj);
		response.getWriter().write(obj);
	
		
		return null;
	}

}
