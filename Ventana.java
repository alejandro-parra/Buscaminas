import java.awt.Dimension;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	private PanelJuego pj;
	
	
	
	public Ventana() {
		super("Buscaminas");
		this.setSize(new Dimension(800,800));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.pj=new PanelJuego();
		
		this.add(pj);
		
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[]args) {
		Ventana miVentana= new Ventana();
	}
}
