package edu.unca.csci201;

public class Tree {
	
	private String type;
	private int height; 
	private int width;
	
	public Tree(String type, int height, int width) {
		
		this.type = type;
		this.height = height;
		this.width = width;
		
	}
	
	public String toString() {
		
		return type + " " + height + " " + width;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	

}
