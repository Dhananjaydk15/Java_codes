public class OuterClass { // Outer/Main class:
	void print() { // print method in Outer class:
		System.out.println(" Object of Outer class");
	}

	class InnerClass { // Inner class:
		void print() { // print method in Inner class:
			class Local {  //Local Class:
				void print() {  //print method in local class:
					System.out.println(" Object of Local class");   
				}
			}
			Local local = new Local(); // Instance of Local class:
			local.print();     // access print() method from local class:
			System.out.println(" Object of Inner class");
		}
	}

	public static void main(String[] args) {
		OuterClass obj = new OuterClass(); // Instance of Outer class:
		OuterClass.InnerClass obj2 = obj.new InnerClass();  // Instance of Inner class:
		obj2.print();// obj2 call print method in inner class and then Local object call print method in local class:
		obj.print(); 

	}
}