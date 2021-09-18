import java.util.Stack;

public class BaseChangeMethod {
    public static String decimalTo(int number, int base) {
        Stack<String>finalNumber = new Stack<>();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while (number >= 1) {
            int remainNum = number % base;
            if (remainNum > 9){
                char letter = alphabet.charAt(remainNum-10);
                finalNumber.add(Character.toString(letter));
            }else finalNumber.add(Integer.toString(remainNum));
            number /= base;
        }
        StringBuilder binaryNumber = new StringBuilder();
        while (!finalNumber.isEmpty()) {
            binaryNumber.append(finalNumber.pop());
        }
        return binaryNumber.toString();
    }
}