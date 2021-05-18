
public class Weapon {
	private String id;
	private int price;
	private boolean isEnhanced;
	
	public Weapon(String id, int price, boolean isEnhanced) {
		this.id = id;
		this.price = price;
		this.isEnhanced = isEnhanced;
	}

	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		if(price <= 0) {
			return;
		} else {
			this.price = price;
		}
	}
	
	public boolean isEnhanced() {
		return this.isEnhanced;
	}
	
	public void setIsEnhanced(boolean enhanced) {
		this.isEnhanced = enhanced;
	}
}
