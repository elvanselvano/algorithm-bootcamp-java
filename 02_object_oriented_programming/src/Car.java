
//public class Car implements Brand {
//
//	@Override
//	public String getBrand() {
//		return null;
//	}
//
//}


// Interface Inheritance
public interface Car extends Brand {
	void drive();
	void stop();
	
//	Default Method: methodnya bsa kita isi blocknya
	default boolean isBig() {
		return false;
	}
}
