
public class Room {
	private String Floor;
	private int Windows;
	private String Color;
	
	public Room (){
		this.Floor ="hardwood";
		this.Windows = 2;
		this.Color = "red";
	}
	public Room (String Floor, int Windows, String Color){
		this.Floor=Floor;
		this.Windows=Windows;
		this.Color=Color;
	}
	
public String getFloor(){
	String Floor=this.Floor;
	return Floor;
}
public void setFloor(String floor){
	this.Floor=floor;
}
public int getWindows(){
	int Windows=this.Windows;
	return Windows;
}
public void setWindows(int Windows){
	this.Windows=Windows;
}
public String getColor() {
	String color=this.Color;
	return color;
}
public void setColor(String color) {
	this.Color=color;
}
public String toString(){
	return "The room has " + this.Floor + " floors, " + this.Windows + " windows, and " + this.Color + " walls.";
}
}
