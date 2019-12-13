package edu.ncsu.monopoly;

public class JailCell extends Cell {
	public static int BAIL = 50;
	public JailCell() {
		setName("Jail");
	}
	
	public void playAction() {
		
	}

	public int getPrice() {
		return 0;
	}

	public String toString() {
	    return name;
	}
}
