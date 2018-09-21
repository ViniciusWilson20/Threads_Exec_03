package controller;

import java.util.Random;

public class ThreadSapo extends Thread {

	private int num_sapo;
	private int salto;
	private int limite_max;
	private int Distancia_Perc;
	private static int posicao;

	public ThreadSapo(int num_sapo, int limite_max) {

		this.limite_max = limite_max;
		this.num_sapo = num_sapo;
	}

	public void run() {

		controle();

	}

	public void controle() {

		int tempo = 1000;
		Random r = new Random();
		
		while (Distancia_Perc < limite_max) {

			salto = r.nextInt(30);
			Distancia_Perc = Distancia_Perc + salto;
			System.out.println("Sapo " + num_sapo + " Saltou: " + salto + "km Percorrendo = " + Distancia_Perc + "km/h");

			try {

				Thread.sleep(tempo);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
		
		posicao++;
		System.out.println("Sapo " + num_sapo + " Foi o " + posicao + "º a Chegar!");
	}
}
