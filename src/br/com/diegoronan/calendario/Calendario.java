package br.com.diegoronan.calendario;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Calendario {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dia: ");
		int dia = scan.nextInt();
			
		System.out.print("Mes: ");
		int mes = scan.nextInt();
		
		System.out.print("Ano: ");
		int ano = scan.nextInt();
		
		String data = dia+"/"+mes+"/"+ano;
		

		try {

			SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
			formatador.setLenient(false);
			System.out.println(formatador.format(formatador.parse(data)));

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
