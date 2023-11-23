package com.mani.springboot.ps.api.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="PAYMENT_TB")
public class Payment {

	@Id
	@GeneratedValue
	private int paymentId;
	private String paymentstatus;
	private String transactionId;
	private int orderId;
	private double amount;
	
	
	public Payment(int paymentId, String paymentstatus, String transactionId, int orderId, double amount) {
		super();
		this.paymentId = paymentId;
		this.paymentstatus = paymentstatus;
		this.transactionId = transactionId;
		this.orderId = orderId;
		this.amount = amount;
	}
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
