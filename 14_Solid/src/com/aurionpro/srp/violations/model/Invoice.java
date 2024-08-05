package com.aurionpro.srp.violations.model;

public class Invoice {
	private int invoiceId;
	private String description;
	private double amount;
	private double tax;
	
	public Invoice(int invoiceId, String description, double amount, double tax) {
		super();
		this.invoiceId = invoiceId;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
	}
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	
	
}
