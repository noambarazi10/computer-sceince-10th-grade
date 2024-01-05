import java.util.Scanner;
תרגיל 1:
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1;
        System.out.println("Enter number1");
        num1=scanner.nextInt();
        if(num1>0) {
            System.out.println("This is positive number");
        }
        else if(num1<0) {
            System.out.println("This is negative number");
        }
        scanner.close();
    }
}

תרגיל 2:
    
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); 
        int num1,num2;
        System.out.println("enter number #1");
        num1=scanner.nextInt();
        System.out.println("Enter your number #2");
        num2=scanner.nextInt();
        if(num1>num2) {
            System.out.println("the greater number is "+num1);
        }
        else if(num2>num1) {
            System.out.println("the greater number is "+num2);
        }
        scanner.close();
    }
}

תרגיל 3:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a sign for the first bike rider");
        String bike_Rider1=scanner.nextLine();
        System.out.println("Enter a sign for the second bike rider");
        String bike_Rider2=scanner.nextLine();
        System.out.println("Enter the first's ride biker distance");
        double bike_Rider1_Distance=scanner.nextInt();
        System.out.println("Enter the second's ride biker distance");
        double bike_Rider2_Distance=scanner.nextInt();
        System.out.println("Enter the first's ride biker speed");
        double bike_Rider1_speed=scanner.nextInt();
        System.out.println("Enter the second's ride biker speed");
        double bike_Rider2_speed=scanner.nextInt();
        double time_Rider1 = (bike_Rider1_Distance / bike_Rider1_speed);
        double time_Rider2 = (bike_Rider2_Distance / bike_Rider2_speed);  
        if(time_Rider1>time_Rider2) {
            System.out.println("The bike rider who arrived first is: "+bike_Rider1);
        }
        else if(time_Rider2>time_Rider1) {
            System.out.println("The bike rider who arrived first is: "+bike_Rider2);
        }
        else if(time_Rider1==time_Rider2) {
            System.out.println("They both arrived at the same time");
        }
   }
}    

תרגיל 4:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter num1");
        num1=scanner.nextInt();
        System.out.println("enter num2");
        num2=scanner.nextInt();
        System.out.println("enter num3");
        num3=scanner.nextInt();
        int average=num1+num2+num3/3;
        System.out.println("the average is "+average);
        scanner.close();
    }

תרגיל 5:
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter three numbers");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int minNumber;

        if (num1 <= num2 && num1 <= num3) {
            minNumber = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            minNumber = num2;
        } else {
            minNumber = num3;
        }

        System.out.println("the smallest number is: " + minNumber);

        scanner.close();
    }
}

תרגיל 6:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the coordinates of the first point:");
        System.out.print("Point 1 - X coordinate: ");
        double x1 = scanner.nextDouble();
        System.out.print("Point 1 - Y coordinate: ");
        double y1 = scanner.nextDouble();

        System.out.println("Please enter the coordinates of the second point:");
        System.out.print("Point 2 - X coordinate: ");
        double x2 = scanner.nextDouble();
        System.out.print("Point 2 - Y coordinate: ");
        double y2 = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between the points is: " + distance);

        scanner.close();
    }
}

תרגיל 7:
    
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number of the series");
        int first_Number=scanner.nextInt();
        System.out.println("Enter a common differnce");
        int common_Differnce=scanner.nextInt();
        int fifth_Num=first_Number + 4 *common_Differnce;
        System.out.println("The fifth number in the series is: "+fifth_Num);
        int Number_10=first_Number + 9 *common_Differnce;
        System.out.println("The 10th number in the series is: "+Number_10);
    }
} 

תרגיל 8:

import java.util.Scanner;
public class Main
{
    public static void main(String []args)
    {
        int total_Price,remainder;
        System.out.println("Enter the number of units you wish to buy");
        Scanner scanner = new Scanner(System.in);
        int unit=scanner.nextInt();
        if (unit > 0 && unit < 10) {
            System.out.println(1.2 * unit);
        }
        if (unit == 10) {
            System.out.println(10);
        }    
        if(unit > 10 && unit < 54) {
            total_Price=unit/10;
            remainder=unit%10;
            System.out.println((10*total_Price)+(1.2*remainder));
        }
        if(unit==54) {
            System.out.println(50);
        }
        if(unit > 54 && unit < 108) {                
           total_Price=(unit - 54)/10;
           remainder=(unit-54)%10;
            System.out.println(50+(total_Price*10)+(remainder*1.2));
        }   
        if(unit==108) {
            System.out.println(100);
        }
        if(unit>108) {
            System.out.println("108 is the max of units you can buy");
        }
        scanner.close();
    }
}

תרגיל 9:
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name:");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name:");
        String lastName = scanner.nextLine();

        System.out.println("Please enter your school name:");
        String schoolName = scanner.nextLine();

        System.out.println("Please enter the number of subjects you study:");
        int numberOfSubjects = scanner.nextInt();

        System.out.println("My name is " + firstName + " " + lastName + ", My school is " + schoolName + ", The number of subjects I study is " + numberOfSubjects + ".");

        scanner.close();
    }
}
תרגיל 10:
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a three-digit number:");
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999) {
            int digit1 = number % 10;          
            int digit2 = (number / 10) % 10;
            int digit3 = number / 100;          

            int sum = digit1 + digit2 + digit3;

            System.out.println("The sum of the digits is: " + sum);
        } else {
            System.out.println("something went wrong");
        }

        scanner.close();
    }
}

