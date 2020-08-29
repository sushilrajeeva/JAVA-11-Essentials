package com.sushil;

public class WebAddressValidator {

	public boolean isValidWebAddress(String webAddress) {
		
		boolean isValid = false;
		
		String regex1 = "(http|https)";
		String regex2 = "://";
		String regex3 = "(www)";
		String regex4 = "[a-zA-Z]+";
		String regex5 = "[.]";
		String regex6 = "(com|org|net)";
		
		String finalRegex = regex1+regex2+regex3+regex4+regex5+regex6;
		
		if(webAddress.matches(finalRegex))
			isValid = true;
		
		return isValid;
		
	}
	
}
