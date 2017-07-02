package demo.tests;

import demo.AddressHelper;
import demo.AddressMatcher;

public class AddressMatchTest {

	public static void main(String[] args) {
		String s1 = "12345, N 10 Street, AZ, 89999, USA";
		String s2 = "12345, N-10th Ave, AU, 89999";
		
		AddressMatcher am = new AddressMatcher();
		AddressHelper ah = new AddressHelper();
		am.setHelper(ah);
		System.out.println(am.compare(s1, s2));

	}

}
