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
		yourLamp.setWatts(60);
		yourLamp.setColor("blue");
		System.out.println(yourLamp.showStatus());
		
		StopWatch s = new StopWatch();
		s.start();
		s.stop();
		System.out.println("Timer ran for " + s.time() + " seconds");
	}
}