package com.aurionpro.test;

import com.aurionpro.model.Document;
import com.aurionpro.model.ProxyDocument;

public class ProxyTester {

	public static void main(String[] args) {
		Document document = new ProxyDocument("example.txt");
		document.display();
		document.display();

	}

}
/* used to provide placeholder for the another object to control access to it
it is useful when we want to manage or control the creation and access of an expensive resources, restrict access
and lazy loading
acts as a intermediary between the client and real object ,add functionality / control access
without modifying the actual object
 */