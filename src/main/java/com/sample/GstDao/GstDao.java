package com.sample.GstDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.GstEntity;
import com.sample.GstRepository.GstRepository;

@Repository
public class GstDao {
	
	@Autowired
	GstRepository gr; 
	
	public String postAllGst(List<GstEntity> ge) {
		gr.saveAll(ge);
		return "Posted";
	}
	
	public int getByhsnCode(int b) {
		return gr.getByhsnCode(b);
	}

}
