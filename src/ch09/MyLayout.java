package ch09;

public enum MyLayout {
	WEST("West"), 
	EAST("EAST"), 
	SOUTH("SOUTH"), 
	NORTH("North"), 
	CENTER("Center");
	
	private String value;
	
	public String getValue() {
		return value;
	}
	private MyLayout(String value) {
		this.value = value;
	}
}
