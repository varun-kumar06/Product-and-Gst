package com.sample.GstService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.GstEntity;
import com.sample.GstDao.GstDao;

@Service
public class GstService {
	
	@Autowired
	GstDao gd;
	
	public String postAllGst(List<GstEntity> ge) {
		return gd.postAllGst(ge);
	}
	
	
	public int getByhsnCode(int b) {
		return gd.getByhsnCode(b);
	}

}
