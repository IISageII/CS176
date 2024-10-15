package edu.monmouth.problemSet2;

import edu.monmouth.musicalInstrument.MusicalInstrument;

public class ProblemSet2 {

    public static void main(String[] args) {
        // b. Create a MusicalInstrument object using the default constructor
        MusicalInstrument instrument1 = new MusicalInstrument();

        // c. Retrieve and print all attributes for this object
        System.out.println("Instrument 1 (Default Constructor):");
        instrument1.displayInstrumentInfo();
        System.out.println();

        // d. Using the three mutators, set this object’s attributes to valid values
        instrument1.setName("Piano");
        instrument1.setType("keyboard");
        instrument1.setNumberOfKeysorStrings(88);

        // e. Retrieve and print all attributes for this object
        System.out.println("Instrument 1 (After Setting Valid Values):");
        instrument1.displayInstrumentInfo();
        System.out.println();

        // f. Create another MusicalInstrument object specifying valid values for all attributes
        MusicalInstrument instrument2 = new MusicalInstrument("Guitar", "string", 6);

        // g. Retrieve and print all attributes for this object
        System.out.println("Instrument 2 (Constructor with Valid Values):");
        instrument2.displayInstrumentInfo();
        System.out.println();

        // h. Using a mutator method, change this object’s name to “snare drum”,
        // its type to “percussion” and its numberOfKeysorStrings to 0
        instrument2.setName("Snare Drum");
        instrument2.setType("percussion");
        instrument2.setNumberOfKeysorStrings(0);

        // i. Retrieve and print all attributes for this object
        System.out.println("Instrument 2 (After Modifying Values):");
        instrument2.displayInstrumentInfo();
        System.out.println();

        // j. Create a number of other MusicalInstrument objects with valid values
        MusicalInstrument instrument3 = new MusicalInstrument("Flute", "woodwind", 0);
        MusicalInstrument instrument4 = new MusicalInstrument("Trumpet", "brass", 3);

        System.out.println("Instrument 3 (Valid Values):");
        instrument3.displayInstrumentInfo();
        System.out.println();

        System.out.println("Instrument 4 (Valid Values):");
        instrument4.displayInstrumentInfo();
        System.out.println();

        // k. Create a number of other MusicalInstrument objects with invalid values
        MusicalInstrument instrument5 = new MusicalInstrument("", "guitar", 101); // Invalid name and numberOfKeysorStrings
        MusicalInstrument instrument6 = new MusicalInstrument("Violin", "invalidType", -5); // Invalid type and numberOfKeysorStrings

        System.out.println("Instrument 5 (Invalid Values):");
        instrument5.displayInstrumentInfo();
        System.out.println();

        System.out.println("Instrument 6 (Invalid Values):");
        instrument6.displayInstrumentInfo();
        System.out.println();
    }
}
