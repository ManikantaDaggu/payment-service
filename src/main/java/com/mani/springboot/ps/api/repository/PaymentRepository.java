package com.mani.springboot.ps.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mani.springboot.ps.api.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
