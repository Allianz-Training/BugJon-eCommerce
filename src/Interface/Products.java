package Interface;

public class Products implements Interface{
	public String ID;
	public String title;
	public int price;

	@Override
	public String getID() {
		return ID;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Products [ID=" + ID + ", title=" + title + ", price=" + price + "]";
	}
	
	
	
}
