package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Juego;
import vista.InterfazAhorcado;

public class Controlador implements ActionListener{

	private InterfazAhorcado view;
	private Juego juego;
	
	public Controlador(InterfazAhorcado view, Juego juego) {
		this.view = view;
		this.juego = juego;
		this.view.btnPrueba.addActionListener(this);
//Traer la accion del boton, this.vista.NombreBoton.addActionListener(this);
//En el video era un boton de multiplicacion, así que this.vista.btnMultiplicar.addActionListener(this);
	}
	
	//Funcion que realiza el boton 
	public void actionPerformed(ActionEvent e) {
		
	}

}
