/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Main main = new Main();
         main.hello();
    }
    public void hello() {
        Scanner scannner = new Scanner(System.in);
        System.out.println("Enter student's name");
        String student = scannner.nextLine();
        scannner.close();
        System.out.println("Hello " + student);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.division(26));
    }
    public int division(int x) {
        int times_of_five = 0;
        times_of_five = x / 5;
        return times_of_five;
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.multipy(5, 4));
    }
    public double multipy(int x, int y) {
        return x * y;
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.average(100, 900, 200));        
    }
    public double average(int x, int y, int z) {
        System.out.println(x + y + z);
        return (x + y + z) / 3;
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.radius(5);
    }
    public void radius(int radius) {
        double S = Math.PI * radius * radius;
        double P = 2 * Math.PI * radius;
        System.out.println("The S is : " + S);
        System.out.println("The P is : " + P);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.let('c', 'b', 'a');
    }
    public void let(char a, char b, char c) {
        System.out.print(c);
        System.out.print(b);
        System.out.print(a);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.math(1, 2, 3);
    }
    public void math(int first_num, int common_difference, int n) {
        int generic = first_num + (n -1) * common_difference;
        System.out.println(generic);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.str("HE"));
    }
    public double str(String str) {
        double ret = Math.pow(str.length(), 2);
        return ret;
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.str("Hello", "Hello, World !"));
    }
    public String str(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str1;
        }
        else {
            return str2;
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isEven("Hello", 5));
    }
    public boolean isEven(String str, int num) {
        if (str.length() == num) {
            return true;
        }
        else {
            return false;
        }
    }
}*/

/*import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.rand());
    }
    public boolean rand() {
        Random random = new Random();
        int num1 = random.nextInt(6) + 1;
        int num2 = random.nextInt(6) + 1;
        System.out.println(num1);
        System.out.println(num2);
        if (num1 == num2) {
            return true;
        }
        else {
            return false;
        }
    }
}*/

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.chr('H'));
    }
    public boolean chr(char let) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 4 letter String");
        String str = scanner.nextLine();
        scanner.close();
        int index = str.indexOf(let);
        if (index >= 0) {
            return true;
        }
        else {
            return false;
        }
    }
}*/
