import java.util.*;
public class Main
{
	
    public static void main(String[] args) {
        String binaryStr = "1010"; // Replace this with your binary input

        // Convert binary to octal
        String octalStr = binaryToOctal(binaryStr);

        System.out.println("Octal representation: " + octalStr);
    }

    // Function to convert binary to octal
    public static String binaryToOctal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toOctalString(decimal);
    }
}

