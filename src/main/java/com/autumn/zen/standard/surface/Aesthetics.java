package com.autumn.zen.standard.surface;

import java.net.HttpURLConnection;
import java.util.HashMap;

// 3.审美
public class Aesthetics {

	// 3.1 相似代码格式相似

	static class TcpConnectionSimulator {

		private int throughput;
		private int latency;
		private int jitter;
		private int packetLoss;

		public TcpConnectionSimulator(int throughput, int latency, int jitter, int packetLoss) {
			super();
			this.throughput = throughput;
			this.latency = latency;
			this.jitter = jitter;
			this.packetLoss = packetLoss;
		}
	}

	// TcpConnectionSimulator(int throughput, int latency, int jitter, int
	// packetLoss)
	// [kbps] [ms] [ms] [percent]

	public static final TcpConnectionSimulator WIFI = new TcpConnectionSimulator(500, 80, 200, 1);

	// 3.2 用方法整理不规则的东西

	// 3.3 必要时使用列对齐

	private static final HashMap<String, String> DICTS = new HashMap<String, String>();

	private String details = DICTS.get("details");
	private String location = DICTS.get("location");
	private String phone = DICTS.get("phone");

	// 3.4 选择有意义的顺序，并一直使用

	// 3.5 把声明按块组织

	static interface FrontendServer {

		// Handlers
		void viewProfile(HttpURLConnection connection);

		void saveProfile(HttpURLConnection connection);

		// Request/reply Utilities
		String extractQueryParam(HttpURLConnection connection, String param);

		void replyOK(HttpURLConnection connection, String html);

		// DataBase Helpers
		void openDataBase(String location, String user);

	}

	// 3.6 代码分成段落

	static void suggestNewFriends(String user, String emailPassword) {

		// Get the user's friends' email address

		// code omit

		// Import all email addresses from this user's email account

		// Find matching users that they aren't already friends with

		// Display these lists on the page.

	}

	// 3.7 使用一致性分格

}
