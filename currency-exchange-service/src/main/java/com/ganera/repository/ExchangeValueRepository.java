package com.ganera.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganera.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
	ExchangeValue findByFromAndTo(String from, String to);
}
