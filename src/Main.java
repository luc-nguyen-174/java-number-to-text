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
                case 1 -> "one hundred and ";
                case 2 -> "two hundred and ";
                case 3 -> "three hundred and ";
                case 4 -> "four hundred and ";
                case 5 -> "five hundred and ";
                case 6 -> "six hundred and ";
                case 7 -> "seven hundred and ";
                case 8 -> "eight hundred and ";
                case 9 -> "nine hundred and ";
                default -> "";
            };
            word6 = switch (((number%100)-((number%100)%10))/10) {
                case 1 -> "ten";
                case 2 -> "twenty";
                case 3 -> "thirty";
                case 4 -> "forty";
                case 5 -> "fifty";
                case 6 -> "sixty";
                case 7 -> "seventy";
                case 8 -> "eighty";
                case 9 -> "ninety";
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
        System.out.println(word1+word2+word3+word4+word5+word6+word7);
//
//        if (number < 1000) {
//            System.out.println(word5 + word6 + word7);
//        }
//        if (number > 20) {
//            System.out.println(word3 + word4);
//        } else {
//            System.out.printf(word1 + word2);
//        }
    }
}