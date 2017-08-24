package com.autumn.zen.standard.surface;

import java.util.Collection;
import java.util.HashMap;

// 1、包含信息的名字
public class InformationName {

	// 1.1、选择专业的词
	void downloadPage() {

	}

	static interface Thread {

		void kill();

		void pause();

		void resume();
	}

	// 1.2、找到更有表现力的词

	HashMap<String, String> similarWordSample() {
		HashMap<String, String> similarWordMap = new HashMap<String, String>();
		similarWordMap.put("send", "deliver,dispatch,announce,distribute,route");
		similarWordMap.put("find", "search,extract,locate,recover");
		similarWordMap.put("start", "create,begin,open");
		similarWordMap.put("make", "create,set up,build,generate,compose,add,new");
		return similarWordMap;
	}

	// 1.3、避免泛泛的名字

	String generalName() {
		return "tmp,retval,foo";
	}

	// 1.4、循环迭代器

	void normalIterator(Collection<String> names) {
		for (int i = 0; i < names.size(); i++)
			;

	}

	void preciseItertor(String[][] nameGroups) {
		for (int groupIndex = 0; groupIndex < nameGroups.length; groupIndex++) {
			for (int itemIndex = 0; itemIndex < nameGroups[groupIndex].length; itemIndex++)
				;
		}
	}

	// 1.5、用具体的名字代替抽象的名字

	String abstract2concreteNameSample() {
		return "disallow_evil_constructors->disallow_copy_and_assign;--run_locally->--use_local_database";
	}

	// 1.6、为名字附带更多信息

	// 附带格式
	String hexId; // Example: "af84ef"

	// 附带单位
	Long startMs; // start time by ms;

	// 附带其他属性
	String plaintextPassword;
	String unescapedComment;
	String htmlUtf8;
	String untrustedUrl;

	// 1.7 名字长度适中

	// 作用域范围越小，名字越短

	// 首字母缩略词和缩写

	String abbreviation() {
		return "evaluation->eval;document->doc;String->str";
	}

	// 去掉冗余词
	String removeRedundancy() {
		return "covertToString->toString;doServeLoop->serveLoop";
	}

	// 1.8 利用名字的格式传递含义

	// 不同实体采用不同的格式

}
