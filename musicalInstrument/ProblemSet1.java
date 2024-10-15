package edu.monmouth.musicalInstrument;

public class ProblemSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step a: Create a MusicalInstrument object using the default constructor
		MusicalInstrument instrument1 = new MusicalInstrument();
		
		//Step b: Retrieve and print the attributes using accessor methods
		System.out.println("Instrument 1:");
		System.out.println("Name: " + instrument1.getName());
		System.out.println("Type: " + instrument1.getType());
		System.out.println("Number of Key or Strings: " + instrument1.getNumberOfKeysorStrings() + "\n");
		
		//Step c: Use mutator methods to set new values
		instrument1.setName("Guitar");
		instrument1.setType("String");
		instrument1.setNumberOfKeysorStrings(6);
		
		//Step d: Retrieve and print the updated attributes
		System.out.println("Updated Instrument 1:");
		System.out.println("Name: " + instrument1.getName());
		System.out.println("Type: " + instrument1.getType());
		System.out.println("Number of Key or Strings: " + instrument1.getNumberOfKeysorStrings() + "\n");
		
		//Step e: Create another Musical object using the parameterized constructor
		MusicalInstrument instrument2 = new MusicalInstrument("Piano", "Keyboard", 88);
		
		//Step f: Retrieve and print all attributes for this object
		System.out.println("Instrument 2:");
		System.out.println("Name: " + instrument2.getName());
		System.out.println("Type: " + instrument2.getType());
		System.out.println("Number of keys or Strings: " + instrument2.getNumberOfKeysorStrings());
	}

}
