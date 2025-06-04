package com.demo;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.HelloService;
import com.demo.utility_classes.ResponseEntityUtil;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class HelloController {

	private final HelloService helloService;

	@GetMapping("/")
	public String hello() {
		return "hello";
	}

	@GetMapping("/util")
	public ResponseEntity<Map<String, Object>> helloUtil() {
		return ResponseEntityUtil.getResponseEntity(helloService.hello(), HttpStatus.OK);
	}

}
