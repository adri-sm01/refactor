package edu.ncsu.monopoly;

public class FreeParkingCell extends Cell {

	public FreeParkingCell() {
		setName("Free Parking");
	}

	public void playAction() {
		return;
	}

	public int getPrice() {
		return 0;
	}

	public String toString() {
	    return name;
	}
}
