
import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        int[] message = {1, 2, 3, 2, 5};
        int[] password = {0, 4, 5, 10, 1, 20};
        encrypt(message, password);
        System.out.println(Arrays.toString(message)); // prints: [4, 5, 10, 5, 20]
        decrypt(message, password);
        System.out.println(Arrays.toString(message)); // prints: [1, 2, 3, 2, 5]
    }
    
    public static void encrypt(int[] message, int[] password) {
        for (int i = 0; i < message.length; i++) {
            message[i] = password[message[i]];
        }
    }
    
    public static void decrypt(int[] encrypted, int[] password) {
        for (int i = 0; i < encrypted.length; i++) {
            for (int k = 0; k < password.length; k++) {
                if (encrypted[i] == password[k]) {
                    encrypted[i] = k;
                    break;
                }
            }
        }
    }
    
}
