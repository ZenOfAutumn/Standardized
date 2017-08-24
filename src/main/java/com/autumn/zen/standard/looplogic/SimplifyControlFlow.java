package com.autumn.zen.standard.looplogic;

import java.util.ArrayList;
import java.util.List;

// 5.简化控制流
public class SimplifyControlFlow {

	private static final int MAX_PARAM_EXPECTED = 10;

	private static final int MIN_PARAM_EXPECTED = 20;

	void simplifyControlFlow(int param) {

		// 5.1 条件语句参数顺序
		if (param > MAX_PARAM_EXPECTED) {

		}

		// 5.2 if/else顺序
		if (param == MAX_PARAM_EXPECTED) {

		} else {

		}

		// 5.3 条件表达式（避免太复杂）

		// 5.4 避免do/while循环

		// 5.5 从函数中提前返回

		if (param > MIN_PARAM_EXPECTED) {
			return;
		} else {

		}

		// 5.6 避免goto

		// 5.7 最小化嵌套

		// 5.8 减小循环里的嵌套

		List<String> names = new ArrayList<String>();
		int notNullNum = 0;
		int notEmptyNum = 0;
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i) == null) {
				continue;
			}
			notNullNum++;
			if (names.get(i).equals("")) {
				continue;
			}
			notEmptyNum++;

			// ...

		}

	}

}
