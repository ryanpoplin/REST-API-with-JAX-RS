public class HelloWorld {
	// how to abstract the 'main()' function?
	public static void main(String[] args) { // code to evaluate...
		System.out.println("\"Hello World\""); // semicolons are required here... & print() for none new lines...
		// Resource based URI's
		// HTTP VERBS: GET, POST, PUT, DELETE, etc...
		
		// Here's some variables that hold different Types...
		int age = 25;
		System.out.println(age);
		double realAge = 25.65;
		System.out.println(realAge);
		
		// the clean ternary operator in Java
		int a = 100; int b = 100;
		String result = (a < b) ? "a" : "b";
		System.out.println(result);
		
		int z = 1000;
		String conditionalResult = "";
		if (z == 1) {
			conditionalResult = "1";
			System.out.print(conditionalResult);
		}
		if (z == 100) {
			conditionalResult = "100";
			System.out.print(conditionalResult);
		} else if (z == 1000) {
			conditionalResult = "1000";
			System.out.print(conditionalResult);
		} else {
			conditionalResult = "The value is not 1, 100 or 1000...";
			System.out.print(conditionalResult);
		}
	}
	// Message Headers: text, HTML, JSON, XML
	// HTTP: 200 - Success, 500 - Server Error, 404 - Not Found
	// seriously consider URI names properly
	// example: of messages and comments:
	// http://www.luupy.io/messages/{id}/comments/{id}
	// just like objects in code can be tightly or loosely coupled; so can URI's...
	
	// instance URI's...and resource based URI's 
	// /messages/{id}/comments/{id} = comments are tightly coupled to messages, makes sense.
	// /users
	// /messages
	
	// pagination:
	// starting from message 30, and limit to message 40
	// /messages?offset=30&limit=10
}