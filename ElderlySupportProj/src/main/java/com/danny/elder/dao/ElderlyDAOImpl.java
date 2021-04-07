package com.danny.elder.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.danny.elder.bean.Elderly;

public class ElderlyDAOImpl implements ElderlyDAO {
	private SqlSessionTemplate sqlSession;

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public Elderly queryEldery(String e_id) throws Exception {
		return sqlSession.selectOne("mapper.elderly.selectElderly",e_id);
	}

	@Override
	public List<Elderly> queryElderys() throws Exception {
		return sqlSession.selectList("mapper.elderly.selectElderlyList");
	}

	@Override
	public List<Elderly> queryElderysVIdNull() throws Exception {
		return sqlSession.selectList("mapper.elderly.selectElderlyListVIdNull");
	}

	@Override
	public void insertElderly(Elderly elderly) throws Exception {
		sqlSession.insert("mapper.elderly.insertElderly",elderly);
	}

	@Override
	public void updateElderly(Elderly elderly) throws Exception {
		sqlSession.update("mapper.elderly.updateElderly",elderly);		
	}

	@Override
	public void updateElderlyVId(Elderly elderly) throws Exception {
		sqlSession.update("mapper.elderly.updateElderlyVId",elderly);		
	}


}
