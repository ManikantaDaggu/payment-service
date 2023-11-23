package com.mani.springboot.ps.api.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.mani.springboot.ps.api.entity.Payment;
import com.mani.springboot.ps.api.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository repository;
	
	
	public Payment dopayment( Payment payment) {
		payment.setPaymentstatus(paymentprocessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return repository.save(payment);
	}
	
	public String paymentprocessing() {
		return new Random().nextBoolean()?"success":"false";
	}
}
