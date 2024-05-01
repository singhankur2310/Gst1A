package com.gst.Gst1A.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gst.Gst1A.entity.Gst1A;
import com.gst.Gst1A.repository.Gst1ARepository;

@Service
public class Gst1AService {
	@Autowired
	private Gst1ARepository gst1arepository;
	
	public List<Gst1A> getAllGst1A() {
        List<Gst1A> gst1As = gst1arepository.findAll();
		 for (Gst1A gst1A : gst1As) {
		 gst1A.setDISPOSAL_OF_ARN_WITHIN_7(gst1A.calculatePercentage()); }
		 
        return gst1As;
    }
	
	

}
