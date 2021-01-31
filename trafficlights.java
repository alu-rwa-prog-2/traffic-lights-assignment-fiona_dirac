// Author: Fiona Mukuhi Ng'ang'a
import java.util.*;
import java.util.ArrayList;
import java.util.Random;
public class trafficlights {

	public static void main(String[] args) throws InterruptedException {
		// This is a traffic lights program
		// we create a random instance here
		Random random = new Random();
		
		// we create the car collection that will be used
		ArrayList<Integer> cars = new ArrayList<Integer>();
		
		/*
		 *  we start adding cars to our collection , we can only generate 20 at a time
		 *  we create a loop that only adds 20 at a time, and checks to see if the cars are more than a hundred or not
		 * */
		while (true) {
			for (int i = 1; i <= 20; i++) {
				cars.add(random.nextInt(21));
			}
			if (cars.size() < 100 ) {
				continue;
			}
			else {
				break;	
			}
		}
		System.out.println(cars);
		System.out.println(cars.size());
		/*
		 * we create the sequences of the traffic lights
		 * this includes the lights, and the time that the particular light stays on
		 * */
		String red;
		String yellow;
		String green;
		
		// the function to remove cars from the array list within different traffic lights
		// for red light which takes 20 seconds no cars can go
		
		
		// for yellow light which takes 20 seconds 1 car leaves after 2 seconds
		long start = System.currentTimeMillis();
		long finish = start + 20000;
		while (start<finish) {
				Thread.sleep(2000);
				cars.remove(0);
				// System.out.println(cars.size());
			
		}
		System.out.println("hey");
		
		// for green light which takes 20 seconds 1 car leaves after 1 second

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
