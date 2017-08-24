package com.autumn.zen.standard.reorganize;

import java.util.Map;

// 9.一次只做一件事
public class OneTaskAtATime {

	// 9.1 任务可以很小

	// 9.2 从对象中抽取值

	String composeAddress(Map<String, String> addressMap) {

		// extract address item
		String town = addressMap.get("town");
		String city = addressMap.get("city");
		String state = addressMap.get("state");
		String country = addressMap.get("country");

		// second half
		String secondHalf = "Planet Earth";
		if (country != null) {
			secondHalf = country;
		}

		if ((state != null) && country.equals("USA")) {
			secondHalf = state;
		}

		// first half
		String firstHalf = "Middle-of-Nowhere";
		if ((state != null) && country.equals("USA")) {
			firstHalf = secondHalf;
		}

		if (city != null) {
			firstHalf = city;
		}

		if (town != null) {
			firstHalf = town;
		}

		return firstHalf + secondHalf;

	}

}
