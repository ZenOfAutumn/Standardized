package com.autumn.zen.standard.surface;

import java.util.Vector;

// 4.注释
public class Comment {

	// 4.1 不要为了注释而注释

	// 4.2 记录个人思想

	// 4.3 为代码中的瑕疵写注释

	// TODO:待优化
	// FIXME:无法运行
	// HACK:粗糙的解决方案
	// XXX:危险提示

	// 4.4 常量注释

	// as long as it's >= 2 num_processors, that's good enough
	private static final int NUM_THREADS = 8;

	// 4.5 提示 可能的陷阱

	// Calls an external service to deliver email. (Times out after 1 minute.)
	void sendEmail(String to, String subject, String body) {

	}

	// 4.6 全局性注释

	// 4.7 总结性注释

	// 4.8 注释保持紧凑

	// 4.9 避免使用意义不明的代词

	// 4.10 精确描述函数行为

	// 4.11 对输入输出进行举例说明

	// Example: Partition([8 5 9 8 2], 8) might result in [5 2 | 8 9 8] and
	// return 1

	int partition(Vector<Integer> vector, int pivot) {
		// fake implement
		return 0;
	}

	// 4.12 声明代码的意图

	// 4.13 具名函数参数

	void connect(int timeout, boolean useEncrytion) {

	}

	void touch() {
		connect(/** timeout **/
				10, /** useEncrytion **/
				true);
	}

	// 4.14 采用信息含量高的词

}
