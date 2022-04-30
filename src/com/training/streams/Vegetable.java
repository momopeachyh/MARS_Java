package com.training.streams;

public class Vegetable {
	private String name;
	private String color;
	private int averageLength;

	public Vegetable(String name, String color, int averageLength) {
		super();
		this.name = name;
		this.color = color;
		this.averageLength = averageLength;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAverageLength() {
		return averageLength;
	}

	public void setAverageLength(int averageLength) {
		this.averageLength = averageLength;
	}
	
	@Override
	public String toString()
	{
		return  name + ", " + color + ", " + averageLength;
		}
}
