package com.student.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

import com.student.dao.UserDao;
import com.student.dao.UserDetails;

public class RegistrationAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		int a=0;
		try {
		
			UserDao dao = new UserDao();
			UserDetails user = new UserDetails();
			DynaActionForm helloWorldForm = (DynaActionForm) form;
			user.setLoginId(helloWorldForm.getString("loginId"));
			user.setPassWord(helloWorldForm.getString("passWord"));
			user.setFname(helloWorldForm.getString("fname"));
			user.setCity(helloWorldForm.getString("lname"));
			user.setEmail(helloWorldForm.getString("email"));
			user.setPhone(helloWorldForm.getString("phone"));
			user.setCity(helloWorldForm.getString("city"));
			 a = dao.saveUser(user, servlet);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(a==1)
		return mapping.findForward("success");
		else
			return mapping.findForward("false");	
	}
}
