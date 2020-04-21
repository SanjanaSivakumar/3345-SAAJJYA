
public class GroceryBillCalculator {

	public double calcBill(double [] list) {
		double totalPrice = 0;
		for (int i = 0; i < list.length; i++) {
			totalPrice += list[i];
		}
		return totalPrice;
	}	
}
