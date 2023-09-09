package Mini;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//date class already defind
import java.util.*;

import javax.swing.text.Position.Bias;

public class Booking 
{
	String PassengerName;
	int busNo;
	Date date;

	//constructor
	Booking()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of passenger :");
		PassengerName = sc.next();

		System.out.println("Enter Bus No :");
		busNo = sc.nextInt();

		System.out.println("Enterr date dd-mm-yyyy");
		String dateInput = sc.next();	//string get

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");	//get a date 
		try
		{
			date = dateFormat.parse(dateInput);
		} 
		catch (ParseException e) 
		{

			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses)
	{
		//reference
		int capacity = 0;
		for(Bus bus : buses)
		{
			if(bus.getBusNo() == busNo)
				capacity = bus.getCapcity();
		}
			//new bus book
			int booked = 0;
			for(Booking b : bookings)
			{
				if(b.busNo == busNo && b.date.equals(date))
					booked++;
				
			}
			return (booked < capacity) ?true:false;
		
	}
}

	