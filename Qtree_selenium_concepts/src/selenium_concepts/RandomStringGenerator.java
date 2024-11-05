package selenium_concepts;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomStringGenerator {
    // Define the character set as a constant
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    /**
     * Generates a random string of the specified length using the defined character set.
     *
     * @param length the length of the random string to generate
     * @return a random string of the specified length
     */
    public static String generateRandomString(int length) {
        // Use ThreadLocalRandom for better performance in multithreaded environments
        Random random = ThreadLocalRandom.current();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Example usage 
        System.out.println(generateRandomString(10));
    }
}
