class Copyconstructors {
    int number1;
    int number2;

    // Default constructor
    public Copyconstructors() {
        number1 = 15;
        number2 = 17;
    }

    // Parameterized constructor
    public Copyconstructors(int number3, int number4) {
        number1 = number3;
        number2 = number4;
    }

    // Single-parameter constructor
    public Copyconstructors(int number5) {
        number1 = number5;
        number2 = 0; // Assuming a default value for number2
    }

    // Copy constructor
    public Copyconstructors(Copyconstructors obj3) { // Corrected type
        this.number1 = obj3.number1;
        this.number2 = obj3.number2;
    }

    // Method to print variables
    public void printVariables() {
        System.out.println("number1: " + number1);
        System.out.println("number2: " + number2);
    }
}
