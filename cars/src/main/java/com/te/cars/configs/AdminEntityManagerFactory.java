package com.te.cars.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class AdminEntityManagerFactory {

	@Bean
	public LocalEntityManagerFactoryBean getEntityMF() {
		LocalEntityManagerFactoryBean localEMF = new LocalEntityManagerFactoryBean();
		localEMF.setPersistenceUnitName("carsPersistence");
		return localEMF;
	}
}
