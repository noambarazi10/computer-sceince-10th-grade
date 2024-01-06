import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much time did the 1st car drove in hours ?");
        double T1 = scanner.nextDouble();
        System.out.println("How much km/h did the 1st car drove on ?");
        int V1 = scanner.nextInt();
        System.out.println("How much time did the 2sd car drove in hours ?");
        double T2 = scanner.nextDouble();
        System.out.println("How much km/h did the 2sd car drove on ?");
        int V2 = scanner.nextInt();
        scanner.close();

        double D1 = T1 * V1;
        double D2 = T2 * V2;

        if (D1 + D2 >= 60) {
            System.out.println(true);
        }
        else if (D1 + D2 <= 60) {
            System.out.println(false);
        }
    }
}

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numbers = random.nextInt(101,999);
        int first_digit = numbers / 100;
        int third_digit = numbers & 10;

        if (first_digit == third_digit) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first subject");
        String first_subject = scanner.nextLine();
        System.out.println("Enter first subject's grade");
        int first_grade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter second subject");
        String second_subject = scanner.nextLine();
        System.out.println("Enter second subject's grade");
        int second_grade = scanner.nextInt();
        scanner.close();

        if (first_grade > second_grade) {
            System.out.println(first_subject);
        }
        else if(first_grade == second_grade) {
            System.out.println("Bote grades are even");
        }
        else {
            System.out.println(second_subject);
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String str1 = scanner.nextLine();
        System.out.println("Enter another string");
        String str2 = scanner.nextLine();
        scanner.close();

        if (str1.length() > str2.length()) {
            System.out.println("The longer string is "+str1);
        }
        else if (str1.length() == str2.length()) {
            System.out.println("Both string are even");
        }
        else {
            System.out.println("The longer string is "+str2);
        }

        if (str1.charAt(0) == str2.charAt(0)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        int index = str2.indexOf(str1);
        if (index >= 0) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
