
public class CarDriver {

	public static void main(String [] args) {
		
		Car myCar = new Car("Invisible", 100, 0.5, "Fake");
		Car hisCar = new Car("Black", 400, 3.5, "Honda");
		Car herCar = new Car("Pink", 300, 2.5, "Volks");
		
		
		myCar.setcolor("Blue");
		myCar.sethorsepower(650);
		myCar.setenginesize(6.5);
		myCar.setmake("Ferrari");
		
		hisCar.setcolor("Blue");
		hisCar.sethorsepower(650);
		hisCar.setenginesize(6.5);
		hisCar.setmake("Ferrari");
		
		herCar.setcolor("Blue");
		herCar.sethorsepower(650);
		herCar.setenginesize(6.5);
		herCar.setmake("Ferrari");
		
		
		System.out.println(myCar.getColor() + " " + myCar.gethorsepower() + " " + myCar.getenginesize() + " " + myCar.getmake());
		System.out.println(hisCar);
		System.out.println(herCar);
	}
	
}

