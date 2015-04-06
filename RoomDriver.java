
public class RoomDriver {

	public static void main(String[] args) {
	Room Room1 = new Room(); // uses the defult constructor
	System.out.println(Room1);
	Room Room2 = new Room("hardwood",1,"yellow"); // Uses the constructor with the parameters
	Room Room3 = new Room("tiled",0,"purple");
	Room Room4 = new Room("carpeted",3,"white");
	System.out.println(Room2);
	System.out.println(Room3);
	System.out.println(Room4);
	
	//Testing the set/get methods
	Room1.setFloor("Marble");
	Room1.setColor("Blue");
	Room1.setWindows(5);
	System.out.println(Room1);

	}

}
