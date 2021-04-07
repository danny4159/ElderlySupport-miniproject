package com.danny.elder.dao;

import java.util.List;

import com.danny.elder.bean.Elderly;
import com.danny.elder.bean.Volunteer;

public interface VolunteerDAO {
	public Volunteer queryVolunteer(String v_id) throws Exception;
	public List<Volunteer> queryVolunteers() throws Exception;//모든 봉사자 조회
	public List<Volunteer> queryVolunteersMatch(String e_id) throws Exception;//노인-봉사자 매칭 봉사자 리스트 조회
	public void insertVolunteer(Volunteer volunteer) throws Exception;
	public void updateVolunteer(Volunteer volunteer) throws Exception;
	public void updateVolunteerEId(Volunteer volunteer) throws Exception;
	public void updateVolunteerPoint() throws Exception;
}
