package demo;

import org.apache.lucene.search.spell.JaroWinklerDistance;

public class AddressMatcher {
	
	private AddressHelper helper;	
	/*private AddressMatcher thisInstance;
		
	private AddressMatcher(){
	
	}
	
	public static AddressMatcher getInstance(){
		if(thisInstance == null){
			thisInstance = new AddressMatcher();
			return thisInstance;
		}else{
			return thisInstance;
		}
	}*/
		
	/**
	 * Match the string addresses based on helper data provided
	 * If meta data is not provided, do a String match for JaroWinkler distance
	 * and return the result
	 * @param s1 - Address to be compared
	 * @param s2 - Address to be compared
	 * @return % match as number between 0 and 1
	 */
	public float compare(String s1, String s2){
		JaroWinklerDistance jwd = new JaroWinklerDistance();
		return jwd.getDistance(s1, s2);		
	}

	public void setHelper(AddressHelper addressHelper) {
		this.helper = addressHelper;		
	}
	
}
