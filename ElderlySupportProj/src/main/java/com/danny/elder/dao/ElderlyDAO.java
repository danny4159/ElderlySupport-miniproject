package com.danny.elder.dao;

import java.util.List;

import com.danny.elder.bean.Elderly;

public interface ElderlyDAO {
	public Elderly queryEldery(String e_id) throws Exception;
	public List<Elderly> queryElderys() throws Exception; 
	public List<Elderly> queryElderysVIdNull() throws Exception; 
	//이거 파라미터 v_id해야할지 아무것도 없는거로 할지 헷갈린다.
	public void insertElderly(Elderly elderly) throws Exception;
	public void updateElderly(Elderly elderly) throws Exception;
	public void updateElderlyVId(Elderly elderly) throws Exception;
	
}