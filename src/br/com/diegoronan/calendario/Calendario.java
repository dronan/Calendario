package br.com.diegoronan.calendario;

import java.text.SimpleDateFormat;

public class Calendario {
	public static void main(String[] args) {

		String data = "3/11/2001";

		try {

			SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
			formatador.setLenient(false);
			System.out.println(formatador.format(formatador.parse(data)));

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
