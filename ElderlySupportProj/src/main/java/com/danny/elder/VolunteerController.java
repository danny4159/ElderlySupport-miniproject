package com.danny.elder;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.danny.elder.bean.Elderly;
import com.danny.elder.bean.Volunteer;
import com.danny.elder.dao.VolunteerDAO;

@Controller
public class VolunteerController {
	VolunteerDAO volunteerDAO;

	public void setVolunteerDAO(VolunteerDAO volunteerDAO) {
		this.volunteerDAO = volunteerDAO;
	}
	
	@RequestMapping(value = "/createvolunteer", method = RequestMethod.GET)
	public String createVolunteer() {
		return "2.4_new_volunteer";
	}
	
	@RequestMapping(value = "/createvolunteercomplete", method = RequestMethod.POST)
	public ModelAndView createvolunteercomplete(HttpServletRequest request) {
		Volunteer volunteer = null;
		ModelAndView modelAndView= new ModelAndView();
		try {
			volunteer = new Volunteer();
			volunteer.setV_id(request.getParameter("v_id"));
			volunteer.setV_sex(request.getParameter("v_sex"));
			volunteer.setV_tel_no(request.getParameter("v_tel_no"));
			volunteer.setV_period(request.getParameter("v_period"));
			volunteer.setV_address(request.getParameter("v_address"));
			volunteer.setV_birth_date(request.getParameter("v_birth_date"));
			volunteer.setV_name(request.getParameter("v_name"));
			volunteer.setV_expertise1(request.getParameter("v_expertise1"));
			volunteer.setV_expertise2(request.getParameter("v_expertise2"));
			volunteerDAO.insertVolunteer(volunteer);
			modelAndView.setViewName("2.4.2_new_volunteer_complete");
		} catch(Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("err");
		}
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/updatevolunteer", method = RequestMethod.GET)
	public ModelAndView updatevolunteer() {
		ModelAndView modelAndView= new ModelAndView();
		try {
			List<Volunteer> volunteerList = volunteerDAO.queryVolunteers();
			if(volunteerList.size()==0) {
				System.out.println("List가 null입니다.");
				throw new Exception();
			}
			modelAndView.addObject("volunteerList", volunteerList);
			modelAndView.setViewName("2.5_update_volunteer");
		} catch(Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("err");
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "/updatevolunteer2", method = RequestMethod.POST)
	public ModelAndView updatevolunteer2(HttpServletRequest request) {
		String v_id = request.getParameter("v_id_update");
		ModelAndView modelAndView = new ModelAndView();
		try {
			Volunteer volunteer = volunteerDAO.queryVolunteer(v_id);
			if (volunteer == null) {
				throw new Exception();
			}
			modelAndView.addObject("v_id",v_id);
			modelAndView.addObject("volunteer",volunteer);
			modelAndView.setViewName("2.5.2_update_volunteer");
		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("err");
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "/updatevolunteercomplete", method = RequestMethod.POST)
	public ModelAndView updatevolunteercomplete(HttpServletRequest request) {
		Volunteer volunteer = null;
		ModelAndView modelAndView= new ModelAndView();
		try {
			volunteer = new Volunteer();
			volunteer.setV_id(request.getParameter("v_id"));
			volunteer.setV_sex(request.getParameter("v_sex"));
			volunteer.setV_tel_no(request.getParameter("v_tel_no"));
			volunteer.setV_period(request.getParameter("v_period"));
			volunteer.setV_address(request.getParameter("v_address"));
			volunteer.setV_birth_date(request.getParameter("v_birth_date"));
			volunteer.setV_name(request.getParameter("v_name"));
			volunteer.setV_expertise1(request.getParameter("v_expertise1"));
			volunteer.setV_expertise2(request.getParameter("v_expertise2"));
			volunteerDAO.updateVolunteer(volunteer);
			modelAndView.setViewName("2.4.2_new_volunteer_complete");
		} catch(Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("err");
		}
		return modelAndView;
	}
}
