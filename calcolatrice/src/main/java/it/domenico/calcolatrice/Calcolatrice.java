package it.domenico.calcolatrice;

import java.util.Scanner;

import org.springframework.stereotype.Component;


import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString

public class Calcolatrice {
	private Operazioni operazioni;
	
	Scanner input=new Scanner(System.in);
	
	public Calcolatrice(Operazioni operazioni) {
		this.operazioni=operazioni;
	}

	public double Calcolo() {
		
		double valore1=operazioni.getValore1();
		double valore2=operazioni.getValore2();
		String scelta=operazioni.getScelta();
		double risul=0;
		
		
		for(int i=0; i<3; i++) {
			
		if(scelta.equals("1")) {
			risul=valore1+valore2;
			
		}
		if(scelta.equals("2")) {
			risul=valore1-valore2;
	
		}
		
		if(scelta.equals("3")) {
			risul=valore1*valore2;
		}
		
		if(scelta.equals("4")) {
			risul=valore1/valore2;
		}
		
	}
			if(!(scelta.equals("1"))&& !(scelta.equals("2"))&& !(scelta.equals("3"))&& !(scelta.equals("4")))
			{
				System.out.println("Digitare correttamente!");
			}
		
		return risul;
	}
	
	
}


