package reeEngine1.head;

// AUTHOR Roe Appelqvist, xdysszetv@gmail.com, 2022
public class Engine {
    // Första skapelsen av klassen engine
	public static String n;
	Thread wi;
	reeEngine1.gfx.Window w;
	public static int sizex, sizey;

	public Engine(String name) {
		w = new reeEngine1.gfx.Window();
	    wi = new Thread(w, "Game-Window-Thread");
	    
	}
    
}
