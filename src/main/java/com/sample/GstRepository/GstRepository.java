package com.sample.GstRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sample.GstEntity;

public interface GstRepository extends JpaRepository<GstEntity, Integer>{
	
	@Query(value="select percentage from Gst_table where hsn_code =?", nativeQuery=true)
	public int getByhsnCode(int b); 
	
}
