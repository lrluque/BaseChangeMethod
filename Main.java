import java.util.Stack;

public class Main {
    public static String toBinary(int number, int base) {
        Stack<String>finalNumber = new Stack<>();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int remainNum = number % base;
        while (number >= 1) {
            if (remainNum > 9){
                char letter = alphabet.charAt(remainNum-10);
                finalNumber.add(Character.toString(letter));
            }else{
                finalNumber.add(Integer.toString(remainNum));
            }
            number /= base;
        }
        int caracteres = finalNumber.size();
        String binaryNumber = "";
        while (!finalNumber.isEmpty()) {
            binaryNumber += finalNumber.pop();
        }
        return binaryNumber;
    }
}
