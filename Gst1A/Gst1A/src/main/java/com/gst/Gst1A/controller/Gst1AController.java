package com.gst.Gst1A.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gst.Gst1A.entity.Gst1A;
import com.gst.Gst1A.service.Gst1AService;
//Singh Ankur 012352 client
// Hey Ankur i am java Developer
@RestController

//@RequestMapping("/api/gst1A")
public class Gst1AController {
	@Autowired
	private Gst1AService gst1aservice;
	
	@GetMapping("/gstall")
	public List<Gst1A> getAllGst1A() {
        return gst1aservice.getAllGst1A();
    }
	

}
