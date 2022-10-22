package it.domenico.calcolatrice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.domenico.config.Config;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Calcolatrice calcolatrice=context.getBean(Calcolatrice.class);
		System.out.println(calcolatrice.Calcolo());

	}

}


