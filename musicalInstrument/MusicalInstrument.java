package edu.monmouth.musicalInstrument;

public class MusicalInstrument {

    // Constants for unknown values and valid ranges
    public static final String UNKNOWNNAME = "UNKNOWNNAME";
    public static final String UNKNOWNTYPE = "UNKNOWNTYPE";
    public static final int UNKNOWNKEYSORSTRINGS = -1;
    public static final int MIN_KEYSORSTRINGS = 0;
    public static final int MAX_KEYSORSTRINGS = 100;

    // Instance variables
    private String name;
    private String type;
    private int numberOfKeysorStrings;

    // Default constructor, invoking mutators with constant values
    public MusicalInstrument() {
        setName(UNKNOWNNAME);
        setType(UNKNOWNTYPE);
        setNumberOfKeysorStrings(UNKNOWNKEYSORSTRINGS);
    }

    // Constructor with parameters, invoking mutators
    public MusicalInstrument(String name, String type, int numberOfKeysorStrings) {
        setName(name);
        setType(type);
        setNumberOfKeysorStrings(numberOfKeysorStrings);
    }

    // Getter and setter for name with validation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = UNKNOWNNAME;
        } else {
            this.name = name;
        }
    }

    // Getter and setter for type with validation
    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null) {
            this.type = UNKNOWNTYPE;
        } else {
            type = type.trim().toLowerCase();
            if (type.equals("woodwind") || type.equals("string") || type.equals("brass") 
                || type.equals("keyboard") || type.equals("percussion")) {
                this.type = type;
            } else {
                this.type = UNKNOWNTYPE;
            }
        }
    }

    // Getter and setter for numberOfKeysorStrings with validation
    public int getNumberOfKeysorStrings() {
        return numberOfKeysorStrings;
    }

    public void setNumberOfKeysorStrings(int numberOfKeysorStrings) {
        if (numberOfKeysorStrings >= MIN_KEYSORSTRINGS && numberOfKeysorStrings <= MAX_KEYSORSTRINGS) {
            this.numberOfKeysorStrings = numberOfKeysorStrings;
        } else {
            this.numberOfKeysorStrings = UNKNOWNKEYSORSTRINGS;
        }
    }

    // Method to display instrument information
    public void displayInstrumentInfo() {
        System.out.println("Instrument Name: " + getName());
        System.out.println("Instrument Type: " + getType());
        System.out.println("Number of Keys/Strings: " + getNumberOfKeysorStrings());
    }
    
    // Optionally override toString()
    @Override
    public String toString() {
        return "Instrument Name: " + getName() +
               ", Type: " + getType() +
               ", Number of Keys/Strings: " + getNumberOfKeysorStrings();
    }
}
