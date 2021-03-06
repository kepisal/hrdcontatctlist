package Action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import Controller.Action;
import Controller.ActionForward;
import DAO.DAO_RetrieveObjects;
import DAO.objectinformation;
import Model.email;

public class retrieveobjects implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		DAO_RetrieveObjects information = new DAO_RetrieveObjects();
		ArrayList<objectinformation> objectlist = information.ListObjects();
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		String obj = new Gson().toJson(objectlist);
		System.out.println(obj);
		response.getWriter().write(obj);
		
		return null;
	}

}
