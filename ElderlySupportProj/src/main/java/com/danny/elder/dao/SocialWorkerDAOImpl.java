package com.danny.elder.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.danny.elder.bean.SocialWorker;

public class SocialWorkerDAOImpl implements SocialWorkerDAO {
	private SqlSessionTemplate sqlSession;

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public SocialWorker querySocialWorker(String s_id) throws Exception {
		return sqlSession.selectOne("mapper.socialworker.selectSocialWorker",s_id);
	}
}