package ch15;

// |-- AnonymousClassExample (outer class)
// |---- HelloWorld (interface)
// |---- sayHello() (method of outer class)
// |------ EnglishGreeting (inner class)
// |------ englishGreeting (an instance of EnglishGreeting class)
// |------ frenchGreeting (first anonymous class, implements HelloWorld interface)
// |------ spanishGreeting (second anonymous class, implements HelloWorld interface)
// |---- main()

public class AnonymousClasseExample {
	interface HelloWorld {
		public void greet();

		public void greetSomeone(String someone);
	}

	public void sayHello() {

		// this is an inner class
		class EnglishGreeting implements HelloWorld {
			String name = "world";

			public void greet() {
				greetSomeone("world");
			}

			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello " + name);
			}
		}

		HelloWorld englishGreeting = new EnglishGreeting();

		// first anonymous class, which implements HelloWorld interface
		HelloWorld frenchGreeting = new HelloWorld() {
			String name = "tout le monde";

			public void greet() {
				greetSomeone("tout le monde");
			}

			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Salut " + name);
			}
		};

		// second anonymous class, which implements HelloWorld interface
		HelloWorld spanishGreeting = new HelloWorld() {
			String name = "mundo";

			public void greet() {
				greetSomeone("mundo");
			}

			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hola, " + name);
			}
		};
		englishGreeting.greet();
		frenchGreeting.greetSomeone("Fred");
		spanishGreeting.greet();
	}

	public static void main(String... args) {
		AnonymousClasseExample myApp = new AnonymousClasseExample();
		myApp.sayHello();
	}
}
