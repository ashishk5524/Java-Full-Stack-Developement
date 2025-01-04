class maincopy {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Copyconstructors obj1 = new Copyconstructors();
        obj1.printVariables();

        // Creating an object using the parameterized constructor
        Copyconstructors obj2 = new Copyconstructors(20, 30);
        obj2.printVariables();

        // Creating an object using the single-parameter constructor
        Copyconstructors obj3 = new Copyconstructors(40);
        obj3.printVariables();

        // Creating an object using the copy constructor
        Copyconstructors obj4 = new Copyconstructors(obj2);
        obj4.printVariables();
    }
}

