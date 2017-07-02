package demo;

import org.apache.lucene.search.spell.JaroWinklerDistance;

public class AddressMatcher {
	
	/**
	 * Match two composed address objects
	 * @param a1
	 * @param a2
	 * @return
	 */
	public float compare(Address a1, Address a2){
		return 0;
		
	}
	
	/**
	 * 
	 * @param a Address
	 * @param s String
	 * @return
	 */
	public float compare(Address a, String s){
		return 0;
		
	}
	/**
	 * Match two address strings just based on JaroWinkler distance
	 * @param s1 - Address to be compared
	 * @param s2 - Address to be compared
	 * @return % match as number between 0 and 1
	 */
	public float compare(String s1, String s2){
		JaroWinklerDistance jwd = new JaroWinklerDistance();
		return jwd.getDistance(s1, s2);		
	}

	
}
