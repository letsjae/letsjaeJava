package practicas;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Lamina_Botones extends JPanel{
	public Lamina_Botones(String titulo, String[] opciones) {
		
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
		
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		grupo=new ButtonGroup();
		
		for (int i = 0; i < opciones.length; i++) {
			JRadioButton boton= new JRadioButton(opciones[i]);
			
			boton.setActionCommand(opciones[i]);
			
			add(boton);
			
			grupo.add(boton);
			
			boton.setSelected(i==0);
		}
	}
	
	public String seleccion(){
		return grupo.getSelection().getActionCommand();
	}
	
	private ButtonGroup grupo;
}
