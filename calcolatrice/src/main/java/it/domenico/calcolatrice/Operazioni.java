package it.domenico.calcolatrice;

import java.util.Scanner;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Operazioni {

	private double valore1;
	private double valore2;
	private String scelta;
	
	Scanner input = new Scanner(System.in);
	
	
	public Operazioni(double valore1, double valore2, String scelta) {
		this.valore1=valore1;
		this.valore2=valore2;
		this.scelta=scelta;
	}

	
	Calcolatrice calcola=new Calcolatrice(null);
	
	public void setOperazioni() {
		
		System.out.println("Inserisci primo valore:");
		this.valore1=Integer.parseInt(input.nextLine());
		System.out.println("Inserisci secondo valore:");
		this.valore2=Integer.parseInt(input.nextLine());
		
		System.out.println("Scegli operazione:");
		this.scelta=input.nextLine();
		
	}
}
