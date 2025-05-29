package com.example.docker_impl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class PingController {
	
	private final static Logger logger = LoggerFactory.getLogger(PingController.class);
	
	@GetMapping("/ping")
	public String ping(HttpServletRequest req) {
		logger.info("request received from " + req.getLocalName());
		logger.warn("simple warning test");
		logger.debug("simple debug test");
		logger.error("simple error test");
		return "ping success";
	}
}
