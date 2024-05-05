import java.util.Random;

public class Main {
    public static void main(String[] args) {
        f1(5, 5);
    }
    public static void f1(int row, int col) {
        Random random = new Random();
        int[][] arr1 = new int[row][col];
        for (int i = 0; i < arr1.length; i ++) {
            for (int j = 0; j < arr1[i].length; j ++) {
                arr1[i][j] = random.nextInt(101);
            }
        }
        for (int i = 0; i < arr1.length; i ++) {
            for (int j = 0; j < arr1[i].length; j ++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        f2();
    }
    public static void f2() {
        Scanner scan = new Scanner(System.in);
        int[][] arr2 = new int[3][3];
        for (int i = 0; i < arr2.length; i ++) {
            for (int j = 0; j < arr2[i].length; j ++) {
                System.out.println("Enter a value: ");
                int input = scan.nextInt();
                if (! (input > 0 && input < 100)) {
                    System.out.println("Error. Only Numbers between 0 to 100.");
                    j --;
                }
                else {
                    arr2[i][j] = input;
                }
            }
        }
        for (int i = 0; i < arr2.length; i ++) {
            for (int j = 0; j < arr2[i].length; j ++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        int sum1 = 0;
        for (int i = 0; i < arr2.length; i ++) {
            int sum = 0;
            for (int j = 0; j < arr2[i].length; j ++) {
                sum +=  arr2[i][j];
            }
            if (sum > sum1) {
                sum1 = sum;
            }
        }
        System.out.println(sum1);
    }
}

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        f1(2, 2);
    }
    public static void f1(int row, int col) {
        Random random = new Random();
        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];
        int[][] arr3 = new int[row][col];
        for (int i = 0; i < arr1.length; i ++) {
            for (int j = 0; j < arr1[i].length; j ++) {
                arr1[i][j] = random.nextInt(101);
                arr2[i][j] = random.nextInt(101);
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j ++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < arr1.length; i ++) {
            for (int j = 0; j < arr1[i].length; j ++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < arr2.length; i ++) {
            for (int j = 0; j < arr2[i].length; j ++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < arr3.length; i ++) {
            for (int j = 0; j < arr3[i].length; j ++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        d2(3, 3);
    }
    public static void d2(int row, int col) {
        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i ++) {
            for (int j = 0; j < arr1.length; j ++) {
                arr1[i][j] = random.nextInt(101);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < col; i ++) {
            for (int j = 0; j < col; j ++) {
                arr2[i][j] = arr1[j][i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j ++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}};
        arr(array);
    }
    public static void arr(int[][] arr) {
        int main = 0;
        int second = 0;
        int count_Plus = 0;
        for (int i = 0; i < arr.length; i ++) {
            main += arr[i][count_Plus]; 
            count_Plus ++;
        }
        int count = arr.length - 1;
        System.out.println(main);
        for (int i = arr.length - 1; i >= 0; i --) {
            second += arr[i][count];
            count --;
        }
        System.out.println(second);
    }
}


public class Main {
    public static void main(String[] args) {
        int[][] arr1 = {{2, 4 ,6}, {1, 7, 8}, {0, 40, 5}};
        System.out.println(arr(arr1));
    }
    public static boolean arr(int[][] arr) {
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i ++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j ++) { 
                sum += arr[i][j];  
            }
            nums[i] = sum;
        }
        for (int i = 0; i < nums.length - 1; i ++) {
            if (nums[i] < nums[i + 1]) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}


public class Main {
    public static void main(String[] args) {
        char[][] array = {{'n','o','a','m'},
    {'e','y','a','l'}};
    arr(array);
    }
    public static void arr(char[][] arr) {
        String[] names = new String[arr.length];
        for (int i = 0; i < arr.length; i ++) {
            String name = "";
            for (int j = 0; j < arr[i].length; j ++) {
                name += arr[i][j];
            }
            names[i] = name;
        }
        // for (int i = 0; i < names.length - 2; i ++) {
        //     if (names[i].compareTo(names[i + 1]) > 0) {
        //         String temp = names[i + 1];
        //         names[i + 1] = names[i];
        //         names[i] = temp;
        //     }
        // }
        for (int i = 0; i < names.length; i ++) {
            System.out.println(names[i] + "\t");
        }
    }
  }

public class Main {
    public static void main(String[] args) {
        char[][] names = {{'n','o','a','m'}, {'e','y','a','l'}};
        arr1(names);
    }
    public static void arr1(char[][] array) {
        String[] names = new String[array.length];
        for (int i = 0; i < array.length; i ++) {
            String name = new String(array[i]);
            names[i] = name;
        }
        for (int i = 0; i < names.length - 1; i ++) {
            if (names[i].compareTo(names[i + 1]) > 0) {
                String temp = names[i + 1];
                names[i + 1] = names[i];
                names[i] = temp;
            } 
        }
        for (int i = 0; i < names.length; i ++) {
            System.out.println(names[i]);
        }
    }
}
