package model;

public abstract class AbstractObject {
	
	private static int id=0;
	
	public AbstractObject() {
		id++;
	}
	
	public static int getId() {
		return id;
	}
	public static void setId(int i) {
		id = i;
	}
}
