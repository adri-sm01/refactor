package edu.ncsu.monopoly;

public interface IOwnable {

	String getName();

	Player getProprietary();

	boolean isAvailable();

	void setAvailable(boolean available);

	void setProprietary(Player owner);

}