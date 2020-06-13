package com.ganera;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ganera.bean.ExchangeValue;
import com.ganera.repository.ExchangeValueRepository;



@RestController
public class CurrencyExchangeController {
	
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueRepository repo;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable String from, @PathVariable String to ) {
		ExchangeValue exchangeValue	= repo.findByFromAndTo(from, to);
				//new ExchangeValue(1000l, from, to, BigDecimal.valueOf(65));
		logger.info("{}"+from);
		exchangeValue.setPort(
				Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeValue;
	}

}
