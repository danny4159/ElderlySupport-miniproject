package com.danny.elder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.danny.elder.bean.SocialWorker;
import com.danny.elder.dao.SocialWorkerDAO;

@Controller
public class SocialWorkerController {
	SocialWorkerDAO socialWorkerDAO;

	public void setSocialWorkerDAO(SocialWorkerDAO socialWorkerDAO) {
		this.socialWorkerDAO = socialWorkerDAO;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		return "1_login";
	}
	 
	@RequestMapping(value = "/menu", method = RequestMethod.POST)
	public ModelAndView menu(HttpServletRequest request) {
		String s_id = request.getParameter("s_id");
		String s_password = request.getParameter("s_password");
		ModelAndView modelAndView = new ModelAndView();
		try {
			SocialWorker socialWorker = socialWorkerDAO.querySocialWorker(s_id);
			if(socialWorker==null){
				throw new Exception();
			}else {
				if(socialWorker.getS_password().equals(s_password)){
					HttpSession session = request.getSession();
					session.setAttribute("s_id", s_id);
				}else
					throw new Exception();
				modelAndView.setViewName("2_choice_in_five");
			}
		}catch(Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("err_login");
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String menu(Model model) {
		return "2_choice_in_five";
	}
}
