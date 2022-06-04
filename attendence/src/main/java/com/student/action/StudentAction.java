package com.student.action;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServletRequest;

import com.student.form.StudentForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;



public class StudentAction extends Action {
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)
	        throws Exception {
			System.out.println("Action Invoked");
			StudentForm helloWorldForm = (StudentForm) form;
			helloWorldForm.setName("Pulkit");
			
			helloWorldForm.setMessage("Hello World! Struts");
			
			return mapping.findForward("success");
		}

}
