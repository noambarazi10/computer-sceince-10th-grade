// תרגיל 1:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student number 1: ");
        String name1 = scanner.nextLine();
        System.out.println("Enter Student number 2: ");
        String name2 = scanner.nextLine();
        System.out.println("Enter Student number 3: ");
        String name3 = scanner.nextLine();
        scanner.close();
        
        if (name1.compareTo(name2) < 0 && name1.compareTo(name3) < 0) {
            System.out.println();
            System.out.println(name1); //  input is : a
            System.out.println(name2); //  input is : b
            System.out.println(name3); // input is : c
        }
        if (name1.compareTo(name2) < 0 && name1.compareTo(name3) < 0) {
            System.out.println();
            System.out.println(name1); // input is: a
            System.out.println(name2); //  input is: c
            System.out.println(name3); //  input is: b
        }
        if (name1.compareTo(name2) > 0 && name1.compareTo(name3) < 0 && name2.compareTo(name1) < 0) {
            System.out.println();
            System.out.println(name2); // input is : b
            System.out.println(name1); // input is : a
            System.out.println(name3); // input is: c
        }
        if(name1.compareTo(name3) > 0 && name1.compareTo(name2) < 0)  { 
            System.out.println();
            System.out.println(name3); // input is: b
            System.out.println(name1); // input is: c
            System.out.println(name2); // input is: a
        }
        if (name1.compareTo(name2) > 0 && name1.compareTo(name3) > 0) {  
            System.out.println();
            System.out.println(name2); // input is: c
            System.out.println(name3); // input is: a
            System.out.println(name1); // input is: b
        }
        if (name1.compareTo(name2) > 0 && name1.compareTo(name3) > 0 && name3.compareTo(name2) < 0) {  
            System.out.println();
            System.out.println(name3); // input is: c  
            System.out.println(name2); // input is: b  
            System.out.println(name1); // input is: a 
        }
    }
}

תרגיל 2:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 4 words sentence");
        String sen = scanner.nextLine();
        scanner.close();
        System.out.println("The number of letters in the sentence is: "+sen.length());
    }
  }

תרגיל 3:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean palindrom;
        System.out.println("Enter a three digit number");
        String num = scanner.nextLine();
        scanner.close();
        if (num.charAt(0) == num.charAt(2)) {
            palindrom = true;
        }
        else {
            palindrom = false;
        }
        System.out.println("Your number is palindrom: "+palindrom);
    }
}

תרגיל 4:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a three letter String");
        String sen = scanner.nextLine();
        scanner.close();
        if (sen.length() == 3){
        System.out.println();
        System.out.print(sen.charAt(2));
        System.out.print(sen.charAt(1));
        System.out.print(sen.charAt(0));
        }
    }
}
