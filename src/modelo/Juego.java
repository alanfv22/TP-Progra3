package modelo;

public class Juego {

	private int intentosRestantes;

	private Palabra palabras;
	private String palabraSecreta;

	private boolean juegoTerminado;

	public Juego() {
		// Creamos el metodo inicio() para inicializar lo que hace falta del juego
		// esta dentro de un metodo para que sea mas limpio el codigo
		inicio();

	}

	//
	public void tick() {

		while (juegoTerminado) {
			mostrarIntentosRestantes();
		/*
		mostrar la palabra con guiones para que el usuario adivine creo que es parte de la interfaz grafica
		El usuario introduce una letra que es capturada por el Scanner
		Con Scanner lector = new Scanner(System.in);--> lee la entrada por teclado
		
		char letraUsuario = lectorTeclado.next().chatAr(0);--> toma la primer letra del usuario y la signa a letraUsuario
	
		if(!algunaLetraAdivinada){
			Mostrar que no acertó ninguna letra
			descontarIntentos();
			if(intentosRestantes == 0){
				Mostrar que perdio el juego
				juegoTerminado = true;
			}
		}else{
			//El juego se gana cuando deja de haber guiones en la palabra
			boolean juegoGanado = !hayGuiones(palabraGuiones);
			if(juegoGanado){
				Mostrar que se gano el juego
				juegoTerminado = true;
			}
		}
			  
		*/
			
		}

	}
	
//	private void descontarIntentos() {
//		intentosRestantes--;
//	}
//
//	private boolean algunaLetraAdivinada() {
//		boolean algunaLetraAcertada = false;
//		for(int i = 0; i < palabraSecreta.length(); i++) {
//				algunaLetraAcertada = algunaLetraAcertada || letrasIguales(palabraSecreta.charAt(i),letraUsuario);
//				//si son iguales reemplaza los guiones por la letra
//		}
//		return algunaLetraAcertada;
//	}
//	
//	private boolean letrasIguales(char letraPalabra, char usuarioLetra) {
//		if(letraPalabra == usuarioLetra) {
//			return true;
//		}
//		return false;
//	}
	
	private String mostrarIntentosRestantes() {
		StringBuilder sb = new StringBuilder();
		sb.append("Te quedan ");
		sb.append(intentosRestantes);
		sb.append("intentos");
		return sb.toString();
	}

	// Inicializar lo que haga falta del juego
	public void inicio() {
		palabraSecreta = palabras.elegirAlAzar();
		juegoTerminado = false;
		intentosRestantes = 7;

	}

}
