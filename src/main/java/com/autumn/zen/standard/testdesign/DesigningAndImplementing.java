package com.autumn.zen.standard.testdesign;

// 13.设计实现
public class DesigningAndImplementing {

	// 13.1 定义接口

	// Track the cumulative counts over the past minute and over the past hour.
	static interface MinuteHourCounter {

		void add(int count);

		// return the accumulated count over the past 60 seconds
		int minuteCount();

		// return the accumulated count over the past 60 minutes
		int hourCount();
	}

	// 13.2 时间桶设计方案

}
