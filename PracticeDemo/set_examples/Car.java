package set_examples;

import java.util.TreeSet;

public class Car implements Comparable<Car>{
	
	String name;
	int price;
	
	public Car(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}


	@Override
	public int compareTo(Car o) {
		
//		return Integer.compare(this.price, o.price)+this.name.compareTo(o.name);
		return Integer.compare(this.price, o.price);
	}

	public static void main(String[] args) {
		
		Car c1 = new Car("BMW",50);
		Car c2 = new Car("Benz",15);
		Car c3 = new Car("Swift",10);
		Car c4 = new Car("Volvo",60);
		
//		System.out.println(c1.compareTo(c4));
		
		
		TreeSet<Car> car = new TreeSet<Car>();
		
		car.add(c1);
		car.add(c2);
		car.add(c3);
		car.add(c4);
		
		System.out.println(car);

	}
}
