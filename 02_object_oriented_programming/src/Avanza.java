
public class Avanza implements Car, Maintenance {

	@Override
	public String getBrand() {
		return "Avanza";
	}

	@Override
	public void drive() {
		System.out.println("Driving Avanza");
	}

	@Override
	public void stop() {
		System.out.println("Stop");
	}

	@Override
	public boolean isMaintenance() {
		return false;
	}

}
