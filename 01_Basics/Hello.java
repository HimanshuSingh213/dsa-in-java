class Hello {
    public static void main(String[] args) {
        int age = 18;
        long x = 10000000L; // integer literals are int by default so "l" at the last is important
        float pi = 3.14F; // decimal numbers are double by default so "F" at the last is important
        char grade = 'A'; // for single character only single quotes are valid
        String name = "New Delhi"; // for multi character-string only double quotes are valid

        // printing my details
        System.out.println("Name\t: Himanshu");
        System.out.println("Age\t:" + age);
        System.out.println("City\t:" + name);
        System.out.println("Grade\t:" + grade);
        System.out.println("PI\t:" + pi);
        System.out.println("X\t:" + x);
    }
}