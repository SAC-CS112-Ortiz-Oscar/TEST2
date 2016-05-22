
public class Automobile 
{
	// Member variables
	private String 	year;
	private String 	make;
	private String	model;
	private String 	color;
	private String 	name;
	private int 	numberOfGears;
	private int		operatingCycle;
	private int 	currentGear;
	private int		currentSpeed;
	private int 	distanceTraveled;

	public void drive(int operatingCycle)
	{
		for(int count = operatingCycle; count < numberOfGears; count++)
		{
			distanceTraveled = distanceTraveled + (currentSpeed / 60);
		}
	}
	// Constructor
	Automobile( String model, int numberOfGears)
	{
		this.model = model;
		this.numberOfGears = numberOfGears;
		
		this.year 				= "2006";
		this.make 				= "Ford";
		this.color 				= "Black";
		this.name 				= "Auto";
		this.operatingCycle 	= 0;
		this.currentGear 		= 0;
		this.currentSpeed 		= 0;
		this.distanceTraveled 	= 0;
	}
	
	// Set methods
	public void setYear( String year) { this.year = year; }
	
	public void setMake(String make) { this.make = make; }
	
	public void setModel(String model) { this.model = model; }
	
	public void setColor(String color){ this.color = color; }
	
	public void setName(String name) { this.name = name; }
	
	public void setNumberOfGears(int numberOfGears) { this.numberOfGears = numberOfGears; }
	
	public void setOperatingCycle( int operatingCycle) { this.operatingCycle = operatingCycle; }
	
	public void setCurrentSpeed() { this.currentSpeed = currentGear * 10; }
	
	// Get methods
	public String getYear() { return year; }
	
	public String  getMake() { return make; }
	
	public String getModel() { return model; }
	
	public String getColor() { return color; }
	
	public String getName() { return name; }
	
	public int getNumberOfGears() { return numberOfGears; }
	
	public int getOperatingCycle() { return operatingCycle; }
	
	public int getCurrentSpeed() { return currentSpeed; }
	
	public int getDistanceTraveled() { return distanceTraveled; }
}
