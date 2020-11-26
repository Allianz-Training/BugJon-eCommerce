package Interface;

import java.util.HashMap;
import sun.security.action.PutAllAction;

public class Products implements Interface{
	public int ID;
	public String title;
	public int price;

	public Products(int id, String title, int price) {
		this.ID = id;
		this.title = title;
		this.price = price;
	}
	public ProductList() {
	  HashMap<String, String> Item = new HashMap<String, String>;
	  Item.put<"Honda Accord", 1200000>;
	  Item.put<"Toyota Alphard", 1100000>;
	  Item.put<"Hyundai H1", 1400000>;
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
