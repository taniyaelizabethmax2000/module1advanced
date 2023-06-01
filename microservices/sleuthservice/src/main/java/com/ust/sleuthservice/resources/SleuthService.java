package com.ust.sleuthservice.resources;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class SleuthService {

	
	public static final Logger logger=LoggerFactory.getLogger(SleuthService.class);
	@GetMapping("/data")
	public String sendResponse() {
		logger.info("In Service:");
		return "from Service";
	}
}

