package reeEngine1.gfx;
import javax.swing.*;
import reeEngine1.head.Engine;
public class Window implements Runnable {
    String name;
    int sizex, sizey;
    JFrame gameWindow; 
	public Window() {
		this.name = Engine.n;
	    this.sizex = Engine.sizex;
	    this.sizey = Engine.sizey;
	}
	public void run() {
		
	}
	public void createWindow() {
		gameWindow = new JFrame(name);
		gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameWindow.setSize(sizex, sizey);		
	}

}
