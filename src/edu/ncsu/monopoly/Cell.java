package edu.ncsu.monopoly;

public abstract class Cell implements IOwnable {

	protected boolean available = true;
	protected String name;
	protected Player proprietary;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Player getProprietary() {
		return proprietary;
	}

	@Override
	public boolean isAvailable() {
		return available;
	}

	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}

	protected void setName(String name) {
		this.name = name;
	}

	@Override
	public void setProprietary(Player owner) {
		this.proprietary = owner;
	}
}
