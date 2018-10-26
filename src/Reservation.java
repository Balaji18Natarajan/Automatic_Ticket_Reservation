import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Balaji
 *
 */
public class Reservation {
int transaction_no ;
String category;
String customer_name;
Scanner in = new Scanner(System.in);
public Reservation(String category,String customer_name){
	this.category=category;
	this.customer_name = customer_name;
	validateCategory();
}
private boolean validateCategory() {
	// TODO Auto-generated method stub
	if(category.equalsIgnoreCase("Train")||category.equalsIgnoreCase("Flight"))
		return true;
	else
		return false;
}

public String getCategory() {
	return category;
}
public String getCustomer_name() {
	return customer_name;
}
public int getTransactionNumber() {
	// TODO Auto-generated method stub
	int upper = 100000;
	int lower = 1;
	Random r = new Random();
	int randomnumber = r.nextInt(upper-lower)+lower;
	return randomnumber;
}
}

