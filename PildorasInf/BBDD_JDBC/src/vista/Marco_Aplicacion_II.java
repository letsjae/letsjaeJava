package vista;

import java.awt.*;

import javax.swing.*;

import controlador.ControladorBotonEjecuta;
import controlador.ControladorCargaMenus;

public class Marco_Aplicacion_II extends JFrame {
	
	public Marco_Aplicacion_II(){
		
		setTitle ("Consulta BBDD");
		
		setBounds(500,300,400,400);
		
		setLayout(new BorderLayout());
		
		JPanel menus=new JPanel();
		
		menus.setLayout(new FlowLayout());
		
		secciones=new JComboBox();
		
		secciones.setEditable(false);
		
		secciones.addItem("Todos");
		
		paises=new JComboBox();
		
		paises.setEditable(false);
		
		paises.addItem("Todos");
		
		resultado= new JTextArea(4,50);
		
		resultado.setEditable(false);
		
		add(resultado);
		
		menus.add(secciones);
		
		menus.add(paises);	
		
		add(menus, BorderLayout.NORTH);
		
		add(resultado, BorderLayout.CENTER);
		
		JButton botonConsulta=new JButton("Consulta");
		
		add(botonConsulta, BorderLayout.SOUTH);
		
		botonConsulta.addActionListener(new ControladorBotonEjecuta(this));
		
		addWindowListener(new ControladorCargaMenus(this));
	}
	
	public JComboBox secciones; // hacemos visible el campo
	
	public JComboBox paises;
	
	public JTextArea resultado;	
	
}