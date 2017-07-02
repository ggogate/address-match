package demo.tests;

import demo.AddressHelper;
import demo.AddressMatcher;

public class AddressMatchTest {

	public static void main(String[] args) {
		String s1 = "18150, N 56 Street, AZ, 85032";
		String s2 = "18150, N56th Street, AZ, 85032";
		
		AddressMatcher am = new AddressMatcher();
		AddressHelper ah = new AddressHelper();
		am.setHelper(ah);
		System.out.println(am.compare(s1, s2));

	}

}
