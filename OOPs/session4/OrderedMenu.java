package session4.assignment;

import java.util.ArrayList;
import java.util.List;

public class OrderedMenu {
	public void displayOrder() {
		System.out.println("Ordered Menu : ");
		List<String> test = new ArrayList<String>();
		test.addAll(FinalOrder.finalOrderList);
		for (String temp : FinalOrder.finalOrderList) {
			System.out.println(temp);
		}
	}
}