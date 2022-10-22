package it.domenico.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import it.domenico.calcolatrice.Calcolatrice;
import it.domenico.calcolatrice.Operazioni;

@Configuration
@ComponentScan(basePackageClasses = Calcolatrice.class)

public class Config {
	@Bean
    public Operazioni getOperazioni() {
		
	Operazioni oper = new Operazioni(0, 0, null);
	oper.setOperazioni();
	
	return oper;
		
		
	}
}