import java.util.Scanner;

public class Ex1024 {
    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);

        // processing
        int testCases = sc.nextInt();
        sc.nextLine(); // clean buffer
        for (int i = 0; i < testCases; i++) {
            String message = sc.nextLine();
            String encryptedtMessage = encripyt(message);

            // output
            System.out.println(encryptedtMessage);
        }
        sc.close();
    }
    
    public static String encripyt(String message) {
        // stage 1
        String messageEncrypted = "";
        int sizeMessage = message.length();
        
        for (int i = 0; i < sizeMessage; i++) {
            int letter = message.charAt(i);
            if (Character.isAlphabetic(letter)) messageEncrypted += (char)(letter + 3);
            else messageEncrypted += (char)(letter);
        }
        
        // stage 2
        messageEncrypted = new StringBuilder(messageEncrypted).reverse().toString();
        
        // stage 3
        String firstPartWord = messageEncrypted.substring(0, sizeMessage / 2);
        String lastPartWord = messageEncrypted.substring(sizeMessage / 2, sizeMessage);
        String partTwo = "";
        int sizePartTwo = lastPartWord.length();

        for (int i = 0; i < sizePartTwo; i++) {
            int letter = lastPartWord.charAt(i);
            partTwo += (char)(letter - 1);
        }
        messageEncrypted = firstPartWord + partTwo;

        return messageEncrypted;
    }
}