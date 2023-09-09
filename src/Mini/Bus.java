package Mini;

public class Bus 
{
	//Instance Vraiable
	private int busNo;
	private boolean ac;
	private int capacity;
	
	//we can write constructor
	
	Bus(int no, boolean ac,int cap)
	{
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	//all data set--> data ipadi mathitu (mathitha)(data vagitu set) 
	//get-->data vagika (data tha ) data eduthu return send panum methoed create it.
	
	public int getBusNo()
	{
		return busNo;
	}
	public boolean isAc()
	{
		return ac;
	}
	public int getCapcity()	// accessor method
	{
		return capacity;
	}
	public void setAc(boolean val)
	{
		ac = val;
	}
	public void setCapacity(int cap)	// mutator method
	{
		capacity = cap;
	}
	public void displayBusInfo()
	{
		System.out.println("Bus No :"+ " "+ busNo + " Ac :"+" "+ac +"Total Capacity :"+ " "+ capacity);
	}
	
}