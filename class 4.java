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
תרגיל 5:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Enter a four letters word");
        String inputString = scanner.next();

        if (inputString.length() == 4) {
            String modifiedString = inputString.replaceAll("[uoiea]", "*");

            System.out.println("The new word is: " + modifiedString);
        } else {
            System.out.println("The word is not four words long");
        }

        scanner.close();
    }
}
תרגיל 6:
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(0,100) + 1;
        System.out.println(rand);
        if (rand == 0) {
            System.out.println("This number is single digit number");
        } 
        else if (rand == 1) {
            System.out.println("This number is single digit number");
        } 
        else if (rand == 2) {
            System.out.println("This number is single digit number");
        } 
        else if (rand == 3) {
            System.out.println("This number is single digit number");
        } 
        else if (rand == 4) {
            System.out.println("This number is single digit number");
        } 
        else if (rand == 5) {
            System.out.println("This number is single digit number");
        } 
        else if (rand == 6) {
            System.out.println("This number is single digit number");
        } 
        else if (rand == 7) {
            System.out.println("This number is single digit number");
        } 
        else if (rand == 8) {
            System.out.println("This number is single digit number");
        } 
        else if (rand == 9) {
            System.out.println("This number is single digit number");
        } 
        else {
            System.out.println("This number is a two digit number");
        }
        if (rand % 2 == 0) {
            System.out.println("This number is divided by two");
        }
        if (rand % 3 == 0) {
            System.out.println("This number is divided by three");
        }
    }
}
תרגיל 7:
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates of the first point:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates of the second point:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        scanner.close();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between the points is: " + distance);
    }
}
תרגיל 8:
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        scanner.close();

        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);
    }
}
תרגיל 9:
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first side: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of the second side: ");
        double side2 = scanner.nextDouble();

        scanner.close();

        double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        System.out.println("The length of the hypotenuse is: " + hypotenuse);
    }
}
