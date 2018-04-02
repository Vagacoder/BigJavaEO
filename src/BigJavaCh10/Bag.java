package BigJavaCh10;

import java.util.*;

public class Bag {

	class Item {
		private String name;
		private int quantity;

		public Item(String name) {
			this.name = name;
			quantity = 1;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void add() {
			quantity += 1;
		}

		public int getQuantity() {
			return quantity;
		}
	}

	private ArrayList<Item> items = new ArrayList<>();

	public void add(String itemName) {
		boolean found = false;
		for (Item item : items)
			{
				if (itemName.equals(item.getName()))
					{
						item.add();
						found = true;
					}
			}

		if (found == false)
			{
				Item newItem = new Item(itemName);
				items.add(newItem);
			}

	}

	public int count(String itemName) {

		int number = 0;
		for (Item item : items)
			{
				if (itemName.equals(item.getName()))
					{
						number = item.getQuantity();
					}
			}
		return number;
	}

}
