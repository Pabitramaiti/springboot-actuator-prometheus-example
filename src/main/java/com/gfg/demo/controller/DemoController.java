package com.gfg.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@GetMapping("/message")
	public ResponseEntity<String> getAnonymous() {
		return ResponseEntity.ok("Welcome to GeeksforGeeks");
	}
}
