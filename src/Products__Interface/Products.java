package Products__Interface;

public class Products implements Interface {
	public int ID;
	public String title;
	public int price;

	public Products(int id, String title, int price) {
		this.ID = id;
		this.title = title;
		this.price = price;
	}

	@Override
	public int getID() {
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
