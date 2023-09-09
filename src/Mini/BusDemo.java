package Mini;


import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo 
{

	public static void main(String[] args) 
	{
		//array add --> objects
		//Bus buses[] = new Bus [50];	// arraylist--> collection use panikalam --> efficient

		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();

		//flexiable/
		buses.add(new Bus(1,true,2));	// object create --> add list inside
		buses.add(new Bus(2,false,50));	
		buses.add(new Bus(3,true,48));	

		int userOpt =1;
		Scanner sc = new Scanner(System.in);

		//ivoke the object
		for(Bus b : buses)
		{
			b.displayBusInfo();
		}

		while(userOpt == 1) 
		{
			System.out.println("Enter 1 to book and 2 to exit");
			userOpt = sc.nextInt();
			if(userOpt == 1)
			{
				//System.out.println("Booking ......");
				Booking booking = new Booking();
				
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed.");}
				else
					System.out.println("Sorry. Bus is full. try to another bus or date.");
			}
		}

	}

}
