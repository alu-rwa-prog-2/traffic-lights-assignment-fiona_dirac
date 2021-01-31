// Author: Fiona Mukuhi Ng'ang'a
// we import all the modules we need to use
import java.util.*;
import java.util.ArrayList;
import java.util.Random;
public class trafficlights {
    // we add this "interrupted exception" because of the Thread function we use later on
	public static void main(String[] args) throws InterruptedException {
		// This is a traffic lights program
		// we create a random instance here that will generate random cars in our program
		Random random = new Random();
		
		// we create the car collection that will be used
		ArrayList<Integer> cars = new ArrayList<Integer>();
		
		/*
		 *  we start adding cars to our collection , we can only generate 20 at a time
		 *  we create a loop that only adds 20 at a time, and checks to see if the cars are more than a hundred or not
		 *  if not, we add another 20 cars and so on
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
		System.out.println("The cars in traffic are now " + cars.size());
		/*
		 * we create the sequences of the traffic lights
		 * this includes the lights, and the time that the particular light stays on
		 * we also create a timer for the lights
		 * */
		// while loop for the overall traffic light sequence
		while (true) {
			// for red light which takes 20 seconds no cars can go
			Timer redTimer = new Timer();
			int begin = 0;
			int timeInterval = 1000;
			redTimer.schedule(new TimerTask() {
			  int count = 0;
			   @Override
			   public void run() {
			       //print instructions for the drivers
				   System.out.println("Traffic light is red, please don't move ");
			       count++;
			       // we do this to run this once since no cars are moving here
			       if (count == 1){
			         redTimer.cancel();
			       }
			   }
			}, begin, timeInterval);
			// we add the time lapse for the red light
			Thread.sleep(20000);
			// here we check if there are still cars in the queue if not, we stop the program
			if (cars.size() == 0) {
				break;
			}
			// for yellow light which takes 20 seconds 1 car leaves after 2 seconds
			Timer yellowTimer = new Timer();
			int start = 0;
			int yellowInterval = 2000;
			yellowTimer.schedule(new TimerTask() {
			  int count = 0;
			   @Override
			   public void run() {
			       //remove the first car in queue
				// here we check if there are still cars in the queue if not, we stop the program
				   if (cars.size() == 0) {
					   yellowTimer.cancel();
				   }
				   else {
					   System.out.println("The traffic light is now yellow, please move with caution. ");
					   cars.remove(0);
				       count++;
				       // the reason we check it against 5 times is because only 5 cars can move every 2 seconds within 10 seconds
				       if (count == 5){
				         yellowTimer.cancel();
				       }
				       } 
			   }
			}, start, yellowInterval);
			// we add the time lapse for the yellow light
			Thread.sleep(10000);
			// here we check if there are still cars in the queue if not, we stop the program
			if (cars.size() == 0) {
				break;
			}
			
			// for green light which takes 20 seconds 1 car leaves after 1 second
			Timer greenTimer = new Timer();
			int commence = 0;
			int greenInterval = 1000;
			greenTimer.schedule(new TimerTask() {
			  int count = 0;
			   @Override
			   public void run() {
			       //remove the first car in queue
				// here we check if there are still cars in the queue if not, we stop the program
				   if (cars.size() == 0) {
					   greenTimer.cancel();
				   }
				   else {
					   System.out.println("The traffic light is now green, drive towards your destination safely! ");
					   cars.remove(0);
				       count++;
				    // the reason we check it against 30 times is because only 30 cars can move every 1 second within 30 seconds
				       if (count == 30){
				         greenTimer.cancel();
				       }
				   }
				   
			   }
			}, commence, greenInterval);
			// we add the time lapse for the green light
			Thread.sleep(30000);
			// here we check if there are still cars in the queue if not, we stop the program
			if (cars.size() == 0) {
				break;
			}
			
		}
		System.out.println("The cars in the queue are now over.");
	}

}
