package com.danny.elder;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.danny.elder.bean.Elderly;
import com.danny.elder.bean.Volunteer;
import com.danny.elder.dao.ElderlyDAO;
import com.danny.elder.dao.VolunteerDAO;

@Controller
public class ElderlyController {
	ElderlyDAO elderlyDAO;
	VolunteerDAO volunteerDAO;

	public void setElderlyDAO(ElderlyDAO elderlyDAO) {
		this.elderlyDAO = elderlyDAO;
	}
	
	public void setVolunteerDAO(VolunteerDAO volunteerDAO) {
		this.volunteerDAO = volunteerDAO;
	}
	
	@RequestMapping(value = "/createelderly", method = RequestMethod.GET)
	public String createElderly() {
		return "2.1_new_elderly";
	}
	
	@RequestMapping(value = "/createelderlycomplete", method = RequestMethod.POST)
	public ModelAndView createelderlycomplete(HttpServletRequest request) {
		Elderly elderly = null;
		ModelAndView modelAndView= new ModelAndView();
		try {
			elderly = new Elderly();
			elderly.setE_id(request.getParameter("e_id"));
			elderly.setE_income(Integer.parseInt(request.getParameter("e_income")));
			elderly.setE_sex(request.getParameter("e_sex"));
			elderly.setE_tel_no(request.getParameter("e_tel_no"));
			elderly.setE_emergency_no(request.getParameter("e_emergency_no"));
			elderly.setE_period(request.getParameter("e_period"));
			elderly.setE_address(request.getParameter("e_address"));
			elderly.setE_birth_date(request.getParameter("e_birth_date"));
			elderly.setE_name(request.getParameter("e_name"));
			elderly.setE_hope1(request.getParameter("e_hope1"));
			elderly.setE_hope2(request.getParameter("e_hope2"));
			elderlyDAO.insertElderly(elderly);
			modelAndView.setViewName("2.1.2_new_elderly_complete");
		} catch(Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("err");
		}
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/updateelderly", method = RequestMethod.GET)
	public ModelAndView updateelderly() {
		ModelAndView modelAndView= new ModelAndView();
		try {
			List<Elderly> elderlyList = elderlyDAO.queryElderys();
			if(elderlyList.size()==0) {
				System.out.println("List가 null입니다.");
				throw new Exception();
			}
			modelAndView.addObject("elderlyList", elderlyList);
			modelAndView.setViewName("2.2_update_elderly");
		} catch(Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("err");
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "/updateelderly2", method = RequestMethod.POST)
	public ModelAndView updateelderly2(HttpServletRequest request) {
		String e_id = request.getParameter("e_id_update");
		ModelAndView modelAndView = new ModelAndView();
		try {
			Elderly elderly = elderlyDAO.queryEldery(e_id);
			if (elderly == null) {
				throw new Exception();
			}
			modelAndView.addObject("e_id",e_id);
			modelAndView.addObject("elderly",elderly);
			modelAndView.setViewName("2.2.2_update_elderly");
		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("err");
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "/updateelderlycomplete", method = RequestMethod.POST)
	public ModelAndView updateelderlycomplete(HttpServletRequest request) {
		Elderly elderly = null;
		ModelAndView modelAndView= new ModelAndView();
		try {
			elderly = new Elderly();
			elderly.setE_id(request.getParameter("e_id"));
			elderly.setE_income(Integer.parseInt(request.getParameter("e_income")));
			elderly.setE_sex(request.getParameter("e_sex"));
			elderly.setE_tel_no(request.getParameter("e_tel_no"));
			elderly.setE_emergency_no(request.getParameter("e_emergency_no"));
			elderly.setE_period(request.getParameter("e_period"));
			elderly.setE_address(request.getParameter("e_address"));
			elderly.setE_birth_date(request.getParameter("e_birth_date"));
			elderly.setE_name(request.getParameter("e_name"));
			elderly.setE_hope1(request.getParameter("e_hope1"));
			elderly.setE_hope2(request.getParameter("e_hope2"));
			elderlyDAO.updateElderly(elderly);
			modelAndView.setViewName("2.1.2_new_elderly_complete");
		} catch(Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("err");
		}
		return modelAndView;
	}
	
	
	

	@RequestMapping(value = "/matchvolunteer", method = RequestMethod.GET)
	public ModelAndView matchElderlyVolunteer1() {
		ModelAndView modelAndView= new ModelAndView();
		try {
			List<Elderly> elderlyList = elderlyDAO.queryElderysVIdNull();
			if(elderlyList.size()==0) {
				System.out.println("List가 null입니다.");
				throw new Exception();
			}
			modelAndView.addObject("elderlyList", elderlyList);
			modelAndView.setViewName("2.3_matching_elderly_volunteer");
		} catch(Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("err");
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "/matchvolunteer2", method = RequestMethod.POST)
	public ModelAndView matchElderlyVolunteer2(HttpServletRequest request) {
		String e_id = request.getParameter("e_id_match");
		ModelAndView modelAndView = new ModelAndView();
		try {
			Elderly elderly = elderlyDAO.queryEldery(e_id);
			List<Volunteer> volunteerList = volunteerDAO.queryVolunteersMatch(e_id);
			if (elderly == null) {
				throw new Exception();
			}
			modelAndView.addObject("elderly",elderly);
			modelAndView.addObject("volunteerList",volunteerList);
			modelAndView.setViewName("2.3.2_matching_elderly_volunteer");
			volunteerDAO.updateVolunteerPoint(); //Point를 0으로 초기화.
		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("err");
		}
		return modelAndView;
	}
	
//	@RequestMapping(value = "/matchvolunteer2", method = RequestMethod.GET)
//	public ModelAndView matchElderlyVolunteer2(HttpServletRequest request) {
//		String e_id = request.getParameter("e_id_match");
//		ModelAndView modelAndView = new ModelAndView();
//		try {
//			Elderly elderly = elderlyDAO.queryEldery(e_id);
//			List<Volunteer> volunteerList = volunteerDAO.queryVolunteers(e_id);
//			if (elderly == null) {
//				throw new Exception();
//			}
//			modelAndView.addObject("elderly",elderly);
//			modelAndView.addObject("volunteerList",volunteerList);
//			modelAndView.setViewName("2.3.2_matching_elderly_volunteer");
//		} catch(Exception e) {
//			e.printStackTrace();
//			modelAndView.addObject("err", "매칭할 노인이 없습니다.");
//			modelAndView.setViewName("err페이지 삽입");
//		}
//		return modelAndView;
//	}
	
	@RequestMapping(value = "/matchvolunteer3", method = RequestMethod.POST)
	public ModelAndView matchElderlyVolunteer3(HttpServletRequest request) {
		ModelAndView modelAndView= new ModelAndView();
		String e_id = request.getParameter("e_id_match");
		String v_id = request.getParameter("v_id_match");
		try {
			Elderly elderly = elderlyDAO.queryEldery(e_id);
			elderly.setV_id(v_id);
			elderlyDAO.updateElderlyVId(elderly);
			Volunteer volunteer = volunteerDAO.queryVolunteer(v_id);
			volunteer.setE_id(e_id);
			volunteerDAO.updateVolunteerEId(volunteer);
			modelAndView.addObject("elderly",elderly);
			modelAndView.addObject("volunteer", volunteer);
			modelAndView.setViewName("2.3.3_matching_complete");
		} catch(Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("err");
		}
		return modelAndView;
	}
	
}
