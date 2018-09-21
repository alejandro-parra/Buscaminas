import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JPanel;

public class PanelJuego extends JPanel{
	
	private Panel[][] paneles;
	private int[] randomList;
	private int num;
	
	public PanelJuego() {
		super();
		this.num=16;
		this.setPreferredSize(new Dimension(num*40,num*40));
		
		FlowLayout layout = new FlowLayout();
		layout.setHgap(0);
		layout.setVgap(0);
		this.setLayout(layout);
		
		this.paneles= new Panel[num][num];
		
		if(num==8) {
			this.randomList=new int[10];
		}
		else if(num==16) {
			this.randomList=new int[40];
		}
		
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				this.paneles[i][j]=new Panel();
				this.add(paneles[i][j]);
			}
		}
		
		//this.setRandomList(num);
		this.setNumeros();
		
		
		
		
	}
	
	public void setRandomList(int num) {
		Random rand = new Random();
		int tmp;
		boolean repetir;
		
		for(int i=0;i<num;i++) {
			repetir=true;
			tmp=rand.nextInt(num);
			while(repetir==true) {
				for(int j=0;j<num;j++){
					if (randomList[num] != tmp) {
						randomList[num]=tmp;
						repetir=false;
					}
				}
			}
		}
		
		for(int i=0;i<this.randomList.length;i++){
			this.paneles[rand.nextInt(num)][rand.nextInt(num)].setPeligro(true);
		}
	}
	
	public void setNumeros() {
		
		for(int i=0;i<this.paneles.length;i++) {
			for(int j=0;j<this.paneles.length;j++) {
				
				if(this.paneles[i][j].getPeligro()==false) {	
					
					if(i!=0 && j!=0 && i!=this.paneles.length-1 && j!=this.paneles.length-1) {
						if(this.paneles[i-1][j-1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i-1][j].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i-1][j+1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i][j-1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i][j+1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i+1][j-1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i+1][j].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i+1][j+1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
					}
					
					else if(i==0 && j==0) {
						
						if(this.paneles[i][j+1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i+1][j].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i+1][j+1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}		
					}
					
					
					else if(i==0 && j==this.paneles.length-1) {
						
						if(this.paneles[i][j-1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i+1][j-1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i+1][j].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}	
					}
					
					else if(i==this.paneles.length-1 && j==0) {
						
						if(this.paneles[i-1][j].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i-1][j+1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						
						if(this.paneles[i][j+1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
					}
					
					else if(i==this.paneles.length-1 && j==this.paneles.length-1) {
						
						if(this.paneles[i-1][j-1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i-1][j].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						
						if(this.paneles[i][j-1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
					}
					
					else if(i!=0 && i!=this.paneles.length-1 && j==this.paneles.length-1) {
						if(this.paneles[i-1][j-1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i-1][j].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i][j-1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i+1][j-1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i+1][j].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
					}
					
					
					else if(i==0 && j!=0 && j!=this.paneles.length-1) {
						
						if(this.paneles[i][j-1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i][j+1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i+1][j-1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i+1][j].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}	
						if(this.paneles[i+1][j+1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}	
					}
					
					
					
					else if(i==this.paneles.length-1 && j!=0 && j!=this.paneles.length-1) {
						if(this.paneles[i-1][j-1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i-1][j].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i-1][j+1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i][j-1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i][j+1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
					}
					
					else if(i!=0 && i!=this.paneles.length-1 && j==0 ) {
						if(this.paneles[i+1][j].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i-1][j].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i-1][j+1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i+1][j+1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
						if(this.paneles[i][j+1].getPeligro()==true) {
							this.paneles[i][j].setContador();
						}
					}
				}
			}
		}
		
		
	}
}
