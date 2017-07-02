package demo.tests;

import demo.Address;
import demo.AddressMatcher;

public class AddressMatchTest2 {

	public static void main(String[] args) {
		
		Address a1 = new Address();
		
		a1.setState("AZ");
		a1.setZip("89999");
		a1.setCountry("US");
		AddressMatcher am = new AddressMatcher();

	}

}
