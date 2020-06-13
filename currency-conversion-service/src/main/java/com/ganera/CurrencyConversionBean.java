package com.ganera;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultple;
	private BigDecimal quantity;
	private BigDecimal totalCalculateAmount;
	private int port;
	
	
	
	public CurrencyConversionBean() {
	
	}


    
	


	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultple, BigDecimal quantity,
			BigDecimal totalCalculateAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultple = conversionMultple;
		this.quantity = quantity;
		this.totalCalculateAmount = totalCalculateAmount;
		this.port = port;
	}






	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getFrom() {
		return from;
	}



	public void setFrom(String from) {
		this.from = from;
	}



	public String getTo() {
		return to;
	}



	public void setTo(String to) {
		this.to = to;
	}







	public BigDecimal getConversionMultple() {
		return conversionMultple;
	}






	public void setConversionMultple(BigDecimal conversionMultple) {
		this.conversionMultple = conversionMultple;
	}






	public BigDecimal getQuantity() {
		return quantity;
	}



	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}



	public BigDecimal getTotalCalculateAmount() {
		return totalCalculateAmount;
	}



	public void setTotalCalculateAmount(BigDecimal totalCalculateAmount) {
		this.totalCalculateAmount = totalCalculateAmount;
	}



	public int getPort() {
		return port;
	}



	public void setPort(int port) {
		this.port = port;
	}
	
	

}
