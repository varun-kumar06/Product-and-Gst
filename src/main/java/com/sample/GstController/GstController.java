package com.sample.GstController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.GstEntity;
import com.sample.GstService.GstService;

@RestController
@RequestMapping(value="/Gst") 
public class GstController {

	@Autowired
	GstService gs;
	
	@PostMapping(value="/PostAllGst")
	public String postAllGst(@RequestBody List<GstEntity> ge) {
		return gs.postAllGst(ge);
	}
	
	@GetMapping(value="/getByhsnCode/{b}")
	public int getByhsnCode(@PathVariable int b) {
		return gs.getByhsnCode(b);
	}
}
