import mystuff.*;
import lab2.*;

public class Mine {
	public static void main(String[] args){
		Lamp myLamp = new Lamp();
		System.out.println("This is my lamp!");
		
		myLamp.setColor("white");
		myLamp.setWatts(45);
		myLamp.turnOn();
		
		String status = myLamp.showStatus();
		System.out.println(status);

		Lamp yourLamp = new Lamp();
		Yours.print();
		
		Lamp otherLamp = new Lamp();
		Others.print();
	}
}