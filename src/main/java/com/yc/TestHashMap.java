package com.yc;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
//		Map<String, Boolean> hashMap = new HashMap<>();
////		hashMap.put("Hollis", true);
//		
//		 Boolean b = Boolean.valueOf(hashMap == null ? false : ((Boolean)hashMap.
//				 get("Hollis")).booleanValue());
//		System.out.println(b);
		
//		Map<String,Boolean> map = new HashMap<String, Boolean>();
//		map.put("Hollis", true);
//		 Boolean b = (map!=null ? map.get("Hollis") : false);
//		 System.out.println(b);
		System.out.println(cleanString("../a.txt"));
		

	}
	public static String cleanString(String aString) {
	    if (aString == null) return null;
	    if(aString.indexOf("../") != -1){
			return null;
		}
	    String cleanString = "";
	    for (int i = 0; i < aString.length(); ++i) {
	        cleanString += cleanChar(aString.charAt(i));
	    }
	    return cleanString;
	}

	private static char cleanChar(char aChar) {

	    // 0 - 9
	    for (int i = 48; i < 58; ++i) {
	        if (aChar == i) return (char) i;
	    }

	    // 'A' - 'Z'
	    for (int i = 65; i < 91; ++i) {
	        if (aChar == i) return (char) i;
	    }

	    // 'a' - 'z'
	    for (int i = 97; i < 123; ++i) {
	        if (aChar == i) return (char) i;
	    }

	    // other valid characters
	    switch (aChar) {
	        case '/':
	            return '/';
	        case '.':
	            return '.';
	        case '-':
	            return '-';
	        case '_':
	            return '_';
	        case ' ':
	            return ' ';
	    }
	    return '%';
	}
	
}
