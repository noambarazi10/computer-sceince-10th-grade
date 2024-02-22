/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.grade();
    }
    public void grade() {
        Scanner scanner = new Scanner(System.in);
        int average = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a grade");
            int grade_num = scanner.nextInt(); 
            average += grade_num;
        }
        scanner.close();
        int average_grade = average / 5;
        System.out.println(average_grade);
    }
}*/

/*import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Main main = new Main();
    main.enter();
   }
   public void enter() {
    Scanner scanner = new Scanner(System.in);
    String str = "";
    int count = 0;
    while (!str.equals("enter")) {
        System.out.println("enter a String");
        str = scanner.nextLine();
        count++;
    }
    System.out.println(count);
    } 
}*/

import java.util.Random;
import java.util.Scanner;

/*public class Main {
public static void main(String[] args) {
    Main main = new Main();
    main.credit();
   }
   public void credit() {
    Scanner scanner = new Scanner(System.in);
    String credit_num;
    int i = 3;
    do {System.out.println("Enter your credit card");
    credit_num = scanner.nextLine();
    i--;
    if (credit_num.length() == 4) {
        System.out.println("How much money");
        i = 0;
       }
       else {
        System.out.println("Error");
       }
   }
   while (i != 0);
   scanner.close();
   }
}*/

/*public class Main {
    public static void main(String[] args) {
        palindrom("12321");
    }
    public static void palindrom(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(right) != str.charAt(left)) {
                System.out.println("Not palindrom");
                break;
            }
            right --;
            left ++;
        }
        System.out.println("is palindrom");
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        num(24);
    }
    public static void num(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        mult_board();
    }
    public static void mult_board() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " X " + j  + " = " + result);
            }
        }

    }
}*/

/*public class Main {
    public static void main(String[] args) {
        grade();
    }
    public static void grade() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int average = 0; 
        while (i < 7) {
            System.out.println("Enter your grade");
            int grade_num = scanner.nextInt();
            average += grade_num;
            i++;
        }
        scanner.close();
        average /= 7;
        System.out.println("The average is : " + average);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        System.out.println(fibonachi(5));
    }
    public static boolean fibonachi(int num_to_check) {
        int num1 = 1;
        int num2 = 1;

        while (num_to_check >= num1) {
            if (num1 == num_to_check) {
                return true;
            }
            int result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
        return false;
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        mult(5, 5);
    }
    public static void mult(int num1, int num2) {
        int result = 0;
        for (int i = 0; i < num2; i ++) {
            result += num1;
        }
        System.out.println(result);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        triangle(5);
    }
    public static void triangle(int height) {
        for (int i = 1; i <= height; i++) {
            // מדפיס רווחים לפי השורה הנוכחית כך שהמשולש יהיה ממורכז
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            // מדפיס את הכוכביות בשורה הנוכחית
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            // מעבר לשורה הבאה
            System.out.println();
    }
  }
}*/




/*public class Main {
    public static void main(String[] args) {
        f1(1, 2, 10);
    }
    public static void f1(int a1, int d, int n) {
        int x = 0;
        while (x < n) {
            int an = a1 + x * d;
            System.out.println(an);
            x++;
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        fibonachi(5, 9);
    }
    public static void fibonachi(int index1, int index2) {
        int a = 1;
        int b = 1;
        int i = 1;
        while (i < index2) {
            if (i >= index1 && i <= index2) {
                System.out.println(a);
                System.out.println(b);
            }
            a = a + b;
            i ++;
            b = b + a;
            i ++;
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        trapez(5);
    }
    public static void trapez(int height) {
        for (int i = 1; i <= height; i ++) {
            for (int j = 0; j < (height - i) * 2.5; j ++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) * 2.5; k ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

/*import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int num1 = rand.nextInt(6) + 1;

     
        int num2 = (num1 + rand.nextInt(5) + 1) % 6 + 1;

      
        System.out.println("first number is : " + num1);
        System.out.println("second number is : " + num2);
    }
}*/


/*public class Main {
    public static void printFirstTenTerms(int first, int ratio) {
        System.out.print(first);
        for (int i = 1; i < 10; i++) {
            double next = first *  Math.pow(ratio, i);
            System.out.print(", " + next);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printFirstTenTerms(3,3); 
    }
}*/


/*public class Main {
    public static void mashcanta(double kerenSum, int numberOfMonths) {
        double interestRatePerMonth = 0.5 / 100;
        double monthlyPayment = (kerenSum * interestRatePerMonth) / (1 - Math.pow(1 + interestRatePerMonth, -numberOfMonths));
        double totalPayment = monthlyPayment * numberOfMonths;

        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);
    }

    public static void main(String[] args) {
        mashcanta(100000, 120);
    }
}*/

/*import java.util.Random;

public class Main {
    public static void generatePoints() {
        Random rand = new Random();
        double closestDistance = Double.MAX_VALUE;
        double closestX = 0;
        double closestY = 0;

        System.out.println("Points:");

        for (int i = 0; i < 5; i++) {
            int x = rand.nextInt() * 100;
            int y = rand.nextInt() * 100;

            System.out.println("(" + x + ", " + y + ")");

            double distance = Math.sqrt(x * x + y * y);

            if (distance < closestDistance) {
                closestDistance = distance;
                closestX = x;
                closestY = y;
            }
        }

        System.out.println("Closest Point to rashit hatzirim: (" + closestX + ", " + closestY + ")");
    }

    public static void main(String[] args) {
        generatePoints();
    }
}*/


import java.util.Scanner;

public class Main {
    public static void printTopStudents() {
        Scanner scanner = new Scanner(System.in);

        String topMathStudent = "";
        String topEnglishStudent = "";
        String topAverageStudent = "";
        double maxMathGrade = Double.MIN_VALUE;
        double maxEnglishGrade = Double.MIN_VALUE;
        double maxAverageGrade = Double.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter student name:");
            String studentName = scanner.next();
            System.out.println("Enter math grade for " + studentName + ":");
            int mathGrade = scanner.nextInt();
            System.out.println("Enter English grade for " + studentName + ":");
            int englishGrade = scanner.nextInt();

            double averageGrade = (mathGrade + englishGrade) / 2.0;

            if (mathGrade > maxMathGrade) {
                maxMathGrade = mathGrade;
                topMathStudent = studentName;
            }

            if (englishGrade > maxEnglishGrade) {
                maxEnglishGrade = englishGrade;
                topEnglishStudent = studentName;
            }

            if (averageGrade > maxAverageGrade) {
                maxAverageGrade = averageGrade;
                topAverageStudent = studentName;
            }
        }

        scanner.close();

        System.out.println("Top Math Student: " + topMathStudent);
        System.out.println("Top English Student: " + topEnglishStudent);
        System.out.println("Top Average grade Student: " + topAverageStudent);
    }

    public static void main(String[] args) {
        printTopStudents();
    }
}
