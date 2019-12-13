package edu.ncsu.monopoly;

public class GoCell extends Cell {
	public GoCell() {
		super.setName("Go");
		setAvailable(false);
	}

	public void playAction() {
	}
	
	public int getPrice() {
		return 0;
	}

	void setName(String name) {
		this.name = name;
	}

	public String toString() {
	    return name;
	}
}
