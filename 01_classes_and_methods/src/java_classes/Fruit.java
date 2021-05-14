package java_classes;

public class Fruit {
	String name;
	int price;
	
	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
    public String toString() {
    	return "Name: " + this.name + ", Price: " + this.price;
    }
}
