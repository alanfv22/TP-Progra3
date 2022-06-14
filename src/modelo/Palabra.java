package modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Palabra {

	private ArrayList<String> palabras;
	private File archivo;
	private FileReader fr;
	private BufferedReader br;
	private Random azar;

	public Palabra() {
		agregarPalabras();

	}

	// En el directorio de git 
	private void agregarPalabras() {
		try {
			archivo = new File("palabrasAhorcado.txt"); // Abrir el archivo
			fr = new FileReader(archivo); // leer el archivo
			br = new BufferedReader(fr);// guarda en memoria lo que obtiene de la lectura del archivo

			String linea;
//Mientras que el archivo tenga cosas escritas va a agregar a palabras esas cosas
			while ((linea = br.readLine()) != null) {
				palabras.add(linea);
			}

			// cerrar el archivo
			br.close();
			fr.close();

		} catch (Exception e) {
			throw new RuntimeException("El archivo no existe");
		}
	}

	/*
	 * numero = (int) (Math.random() * n) + 1; Donde n es hasta el número que
	 * quieres que llegue, + 1 para que nunca tengas un 0 y el cast a int porque
	 * Math#random arroja un valor de tipo double
	 */
	public String elegirAlAzar() {
		int numAzar = azar.nextInt(palabras.size());
		return palabras.get(numAzar);
	}

}