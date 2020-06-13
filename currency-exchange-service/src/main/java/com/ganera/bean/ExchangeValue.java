package com.ganera.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class ExchangeValue {
	@Id
	protected long id;
	
	@Column(name="currency_from")
	protected String from;
	
	@Column(name="currency_to")
	protected String to;
	
	@Column(name="conversion_multiple")
	protected BigDecimal conversionMultple;
	protected int port;
	public ExchangeValue() {
		super();
	}
	public ExchangeValue(long id, String from, String to, BigDecimal conversionMultple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultple = conversionMultple;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	

}
