package generalproblems.lightableinterface;
import java.util.ArrayList;

public class LightTester {

	public static void main(String[] args) {
		
		ArrayList<lightable> listOfLightables= new ArrayList<lightable>();
		
		Torch a = new Torch("Redwood");
		a.light();
		
		Flashlight b = new Flashlight();
		b.turnOn();
		
		Torch c = new Torch("Chestnut");
		c.timeExpires();
		c.timeExpires();
		c.light();
		
		Flashlight d = new Flashlight();
		d.removeBattery();
		d.insertBattery(275);
		d.turnOn();
		
		listOfLightables.add(a);
		listOfLightables.add(b);
		listOfLightables.add(c);
		listOfLightables.add(d);
		
		for (lightable x : listOfLightables) {
			System.out.println(x);
		}
		
	}

}
