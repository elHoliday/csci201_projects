package edu.unca.csci201;

public class Tree {
	
	private String type;
	private double height; 
	private double width;
	
	public Tree(String type, double treeHeight, double treeWidth) {
		
		this.type = type;
		this.height = treeHeight;
		this.width = treeWidth;
		
	}
	
	public String toString() {
		
		return "This tree is a " + type + " with a height of: " + height + "ft and a width of: " + width + "ft";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	

}
