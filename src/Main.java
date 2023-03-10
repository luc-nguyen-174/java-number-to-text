import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so: ");
        short number = scanner.nextShort();
        String word1 = "";
        String word2 = "";
        String word3 = "";
        String word4 = "";
        String word5 = "";
        String word6 = "";
        String word7 = "";
        if (number < 0) {
            System.out.println("So khong hop le, nhap lai so lon hon 0!");
        } else if (number <= 10) {
            word1 = switch (number) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                case 10 -> "Ten";
                default -> "";
            };
        } else if (number <= 20) {
            word2 = switch (number % 10) {
                case 1 -> "Eleven";
                case 2 -> "Twelve";
                case 3 -> "Thirteen";
                case 4 -> "Fourteen";
                case 5 -> "Fifteen";
                case 6 -> "Sixteen";
                case 7 -> "Seventeen";
                case 8 -> "Eighteen";
                case 9 -> "Nineteen";
                case 0 -> "Twenty";
                default -> "";
            };
        } else if (number < 100) {
            word3 = switch ((number - (number % 10)) / 10) {

                case 2 -> "Twenty";
                case 3 -> "Thirty";
                case 4 -> "Forty";
                case 5 -> "Fifty";
                case 6 -> "Sixty";
                case 7 -> "Seventy";
                case 8 -> "Eighty";
                case 9 -> "Ninety";
                default -> "";
            };
            word4 = switch (number % 10) {
                case 1 -> "-one";
                case 2 -> "-two";
                case 3 -> "-three";
                case 4 -> "-four";
                case 5 -> "-five";
                case 6 -> "-six";
                case 7 -> "-seven";
                case 8 -> "-eight";
                case 9 -> "-nine";
                default -> "";
            };
        } else if (number < 1000) {
            word5 = switch ((number - (number % 100)) / 100) {
                case 1 -> "One hundred";
                case 2 -> "Two hundred";
                case 3 -> "Three hundred";
                case 4 -> "Four hundred";
                case 5 -> "Five hundred";
                case 6 -> "Six hundred";
                case 7 -> "Seven hundred";
                case 8 -> "Eight hundred";
                case 9 -> "Nine hundred";
                default -> "";
            };
            word6 = switch (((number % 100) - ((number % 100) % 10)) / 10) {
                case 1 -> switch (number % 10) {
                    case 1 -> " and eleven";
                    case 2 -> " and twelve";
                    case 3 -> " and thirteen";
                    case 4 -> " and fourteen";
                    case 5 -> " and fifteen";
                    case 6 -> " and sixteen";
                    case 7 -> " and seventeen";
                    case 8 -> " and eighteen";
                    case 9 -> " and nineteen";
                    default -> " and ten";
                };
                case 2 -> " and twenty";
                case 3 -> " and thirty";
                case 4 -> " and forty";
                case 5 -> " and fifty";
                case 6 -> " and sixty";
                case 7 -> " and seventy";
                case 8 -> " and eighty";
                case 9 -> " and ninety";
                default -> "";
            };
            word7 = switch (number % 10) {
                case 1 -> " one";
                case 2 -> " two";
                case 3 -> " three";
                case 4 -> " four";
                case 5 -> " five";
                case 6 -> " six";
                case 7 -> " seven";
                case 8 -> " eight";
                case 9 -> " nine";
                default -> "";
            };

        }
        if (number <= 20) {
            System.out.println(word1 + word2);
        } else if (number < 100) {
            System.out.println(word3 + word4);
        } else if ((number % 100) <= 19 && ((number % 100)>=10)) {
            System.out.println(word5 + word6);
        } else {
            System.out.println(word5 + word6 + word7);
        }
    }
}