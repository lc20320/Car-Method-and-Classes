
/**
 * 
 * Luis Cervantes <br>
 * 11/14/16 <br>
 * Car class with methods and constructors 
 *
 */

public class Car {
	private String color;
	private int horsepower;
	private double enginesize;
	private String make;
	
	
	
	/**
	 * Car class constructor with color, horsepower, enginesize and make
	 */
	
	public Car () {
		color = "Green";
		horsepower = 350;
		enginesize = 4.5;
		make = "Toyota";
	}
	
	/**
	 * 
	 * @param color
	 * @param horsepower
	 * @param enginesize
	 * @param make
	 */
	
	public Car(String color, int horsepower, double enginesize, String make) {
		this.color = color;
		this.horsepower = horsepower;
		this.enginesize = enginesize;
		this.make = make;
	}
	
	/**
	 * 
	 * @return Color
	 */
	
	public String getColor() {
		return color;
	}
	
	/**
	 * 
	 * @param color
	 */
	
	public void setcolor(String color) {
		this.color = color;
	}
	
	/**
	 * 
	 * @returnHorsepower
	 */
	
	public int gethorsepower () {
		return horsepower;
	}
	
	/**
	 * 
	 * @param horsepower
	 */
	
	public void sethorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	
	/**
	 * 
	 * @return Enginesize
	 */
	
	public double getenginesize () {
		return enginesize;
	}
	
	/**
	 * 
	 * @param enginesize
	 */
	
	public void setenginesize(double enginesize) {
		this.enginesize = enginesize;
	}
	
	/**
	 * 
	 * @return Make
	 */
	
	public String getmake () {
		return make;
	}
	
	/**
	 * 
	 * @param make
	 */
	
	public void setmake(String make) {
		this.make = make;
	}
	
	/**
	 * Prints toString
	 */
	
	public String toString() {
		return this.color + " " + this.horsepower + " " + this.enginesize + " " + this.make;
	}	
}
