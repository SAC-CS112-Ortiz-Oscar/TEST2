
public class Automobile 
{
	// Member variables
	private int 	year;
	private String 	make;
	private String	model;
	private String 	color;
	private String 	name;
	private int 	gears;
	private int		operatingCycle;
	private int		currentSpeed;
	private int 	distanceTraveled;
	
	// Constructor
	Automobile( String model, int year)
	{
		this.model = model;
		this.year = year;
		
		make = "Ford";
		color = "Black";
		name = "Auto";
		gears = 5;
		operatingCycle = 0;
		currentSpeed = 0;
		distanceTraveled = 0;
	}
	
	// Set methods
	public void setYear( int year) { this.year = year; }
	
	public void setMake(String make) { this.make = make; }
	
	public void setModel(String model) { this.model = model; }
	
	public void setColor(String color){ this.color = color; }
	
	public void setName(String name) { this.name = name; }
	
	public void setGears( int gears) { this.gears = gears; }
	
	public void setOperatingCycle( int operatingCycle) { this.operatingCycle = operatingCycle; }
	
	public void setCurrentSpeed( int currentGear ) { currentSpeed = currentGear * 10; }
	
	// Get methods
	public int getYear() { return year; }
	
	public String  getMake() { return make; }
	
	public String getModel() { return model; }
	
	public String getColor() { return color; }
	
	public String getName() { return name; }
	
	public int getGears() { return gears; }
	
	public int getOperatingCycle() { return operatingCycle; }
	
	public int getCurrentSpeed( int currentGear) { return currentSpeed; }
	
	public int getDistanceTraveled() { return distanceTraveled; }
}
