package tests;

public enum AlgorithmTypeId {
    FIND_ASCII_VALUE_OF_A_CHARACTER("Find ASCII Value of a character", "https://www.programiz.com/java-programming/examples/ascii-value-character"),
    FIND_QUITIENT_ANDREMAINDER("Compute Quotient and Remainder", "https://www.programiz.com/java-programming/examples/compute-quotient-remainder"),
    EVEN_ODD("Check whether a number is even or odd", "https://www.programiz.com/java-programming/examples/even-odd"),
    VOWEL_OR_CONSTANT("Check whether an alphabet is vowel or consonant ", "https://www.programiz.com/java-programming/examples/vowel-consonant"),
    FIND_LEAP_YEAR("Program to Check Leap Year","https://www.programiz.com/java-programming/examples/leap-year" ),
    FIND_FACTORIAL("Find Factorial of a Number", "https://www.programiz.com/java-programming/examples/factorial"),
    DISPLAY_FIBONACCI("Display Fibonacci Series", "https://www.programiz.com/java-programming/examples/fibonacci-series"),
    GRATEST_COMMON_DIVISOR("Gratast Common Divisor of two numbers", "https://www.programiz.com/java-programming/examples/hcf-gcd"),
    LEAST_COMMON_MULTIPLE("Least Common Multiple", "https://www.programiz.com/java-programming/examples/lcm");
    final String name;
    final String link;

    AlgorithmTypeId(final String testName, final String webLink) {
        name = testName;
        link = webLink;
    }

    public String getURL() {
        return link;
    }

    public String getName(){
        return name;
    }
}
