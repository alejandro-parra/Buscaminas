import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Panel extends JPanel implements MouseListener{
	private Image fondo;
	private boolean peligro;
	private int contador;
	
	public Panel() {
		super();
		this.setPreferredSize(new Dimension(40,40));
		
		
		this.peligro=false;
		this.contador=0;
		this.addMouseListener(this);
		
	}
	
	public Panel(String ruta) {
		super();
		this.setSize(new Dimension(40,40));
		
		this.setImage(ruta);
		this.addMouseListener(this);
		
		
	}
	
	public void setImage(String text) {
		File pathToFile = new File(text);
		try {
			this.fondo = ImageIO.read(pathToFile);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error");
		}
	}
	
	public void setPeligro(boolean peligro) {
		this.peligro=peligro;
	}
	
	public boolean getPeligro() {
		return this.peligro;
	}
	
	public void setContador() {
		this.contador+=1;
	}
	
	public int getContador() {
		return this.contador;
	}
	
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
	    g.drawImage(this.fondo,0,0,this);
	    
	}
	
	

	@Override
	public void mouseClicked(MouseEvent e) {
		if(this.getContador()!=0) {
			this.setImage("/Users/alejandroparra/Downloads/Juego/"+this.getContador()+".png");
			this.repaint();
		}
		else if(this.peligro==true) {
			this.setImage("/Users/alejandroparra/Downloads/Juego/bomba.png");
			this.repaint();
		}
		else{
			this.setImage("/Users/alejandroparra/Downloads/Juego/vacio.png");
			this.repaint();
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
