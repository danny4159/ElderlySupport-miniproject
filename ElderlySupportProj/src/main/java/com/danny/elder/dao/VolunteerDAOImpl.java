package com.danny.elder.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.danny.elder.bean.Volunteer;

public class VolunteerDAOImpl implements VolunteerDAO {
	private SqlSessionTemplate sqlSession;

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public Volunteer queryVolunteer(String v_id) throws Exception {
		return sqlSession.selectOne("mapper.volunteer.selectVolunteer",v_id);
	}

	@Override
	public List<Volunteer> queryVolunteers() throws Exception {
		return sqlSession.selectList("mapper.volunteer.selectVolunteerList");
	}
	
	//노인-봉사자 매칭 봉사자 리스트 조회
	@Override
	public List<Volunteer> queryVolunteersMatch(String e_id) throws Exception {
		return sqlSession.selectList("mapper.volunteer.selectVolunteerListMatch",e_id);
	}

	@Override
	public void insertVolunteer(Volunteer volunteer) throws Exception {
		sqlSession.insert("mapper.volunteer.insertVolunteer",volunteer);
	}

	@Override
	public void updateVolunteer(Volunteer volunteer) throws Exception {
		sqlSession.update("mapper.volunteer.updateVolunteer",volunteer);
	}
	
	@Override
	public void updateVolunteerEId(Volunteer volunteer) throws Exception {
		sqlSession.update("mapper.volunteer.updateVolunteerEId",volunteer);
	}

	@Override
	public void updateVolunteerPoint() throws Exception {
		sqlSession.update("mapper.volunteer.updateVolunteerPoint");
		
	}

	

}
