package com.autumn.zen.standard.looplogic;

// 6.拆分长表达式
public class BreakDownGiantExpressions {

	static class Request {

		private User user;

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
	}

	static class User {
		private int id;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
	}

	static class Document {

		private int ownId;

		public int getOwnId() {
			return ownId;
		}

		public void setOwnId(int ownId) {
			this.ownId = ownId;
		}

	}

	void breakDownGiantExpression() {

		// 6.1 引入解释变量
		String userGroup = "root;work;nobody";

		// bad
		if (userGroup.split(";")[0].trim().equals("root")) {

		}

		// good
		String userName = userGroup.split(";")[0].trim();
		if (userName.equals("root")) {

		}

		// 6.2 引入总结变量

		User user = new User();
		user.setId(123);
		Request request = new Request();
		request.setUser(user);

		Document doc = new Document();
		doc.setOwnId(123);

		// bad
		if (request.getUser().getId() == doc.getOwnId()) {
			// some code
		}

		if (!(request.getUser().getId() == doc.getOwnId())) {
			// some code
		}

		// good
		boolean userHasEditAuthor = request.getUser().getId() == doc.getOwnId();

		if (userHasEditAuthor) {

		}

		if (!userHasEditAuthor) {

		}

		// 6.3 使用德摩根定理

		boolean fileExist = true;
		boolean isProtected = false;

		// bad
		if (!(fileExist && !isProtected))
			;

		// good
		if (!fileExist || isProtected)
			;

		// 6.4 拆分巨大的语句

	}

}
