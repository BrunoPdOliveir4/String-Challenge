import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma string para ser invertido: ");
        String value = scanner.next();

        String invertedValue = "";

        for (int index = value.length()-1; index >= 0; index--) {
            invertedValue += value.charAt(index);
        }

        System.out.println(invertedValue);
    }

}