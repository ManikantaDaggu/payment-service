package com.mani.springboot.ps.api.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mani.springboot.ps.api.entity.Payment;
import com.mani.springboot.ps.api.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private PaymentService service;
	
	@PostMapping("/dopayment")
	public Payment doPayment(@RequestBody Payment payment) {
		return service.dopayment(payment);
		
	}
	
	
}
