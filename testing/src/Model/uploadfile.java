package Model;

import java.io.File;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class uploadfile{
	/*String saveFile = "D:/upload/";
	private File checkExist(String fileName) {
		File f = new File(saveFile+"/"+fileName);

		if(f.exists()){
		StringBuffer sb = new StringBuffer(fileName);
		sb.insert(sb.lastIndexOf("."),"-"+new Date().getTime());
		f = new File(saveFile+"/"+sb.toString());
		}
		return f;
		}
	
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		//response.setContentType("text/html;charset=UTF-8");
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		try {
			boolean ismultipart = ServletFileUpload.isMultipartContent(request);
			if (!ismultipart) {

			} else {
				FileItemFactory factory = new DiskFileItemFactory();
				ServletFileUpload upload = new ServletFileUpload(factory);
				List items = null;

				try {

					items = upload.parseRequest(request);
				} catch (Exception e) {
				}
				Iterator itr = items.iterator();
				while (itr.hasNext()) {
					FileItem item = (FileItem) itr.next();
					if (item.isFormField()) {

					} else {
						String itemname = item.getName();
						if ((itemname == null || itemname.equals(""))) {
							continue;
						}
						String filename = FilenameUtils.getName(itemname);
						File f = checkExist(filename);
						item.write(f);
						System.out.println(filename);
					}
				}
			}
			
		} catch (Exception e) {
			
		} finally {
			response.sendRedirect("/hrdcontactlist/pages/pg_setting.jsp");
			response.getWriter().write("success");
			out.close();			
		}
		return null;
	}*/

}
