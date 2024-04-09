public class AP {
    private int firstMember, difference;
    public AP(int firstMember, int difference) {
        this.firstMember = firstMember;
        this.difference = difference;
    }    
    public void printGeneralSeries() {
        System.out.println("an = " + firstMember + " + " + difference + " (n - 1)");
    }
    public int memberCalculation(int n) {
        int an = firstMember + difference * (n - 1);
        return an;
    }
    public int calculate(int an) {
        int n = firstMember + difference * (an - 1);
        int MYan = 0;
        int MYn = 1;
        boolean bool = false;
        while (an >= MYan) {
            MYan = firstMember + difference * (MYn - 1);
            if (MYan == an) {
                bool = true;
            }
            MYn ++;
        }
        if (bool == true) {
            return n;
        }
        else {
            return 0;
        }

תרגיל 2:
public class Student {
    private int id;
    private String privateName, lastName;
    public Student(int id, String privateName, String lastName) {   
        this.id = id;
        this.privateName = privateName;  
        this.lastName = lastName;
    }
    public String toString() {
        return privateName + " " + lastName + " " + id;
    }
}
    }
}

תרגיל 3:

public class Book {
    private String name, author;
    private int categoryNumber;
    public Book(String name, String author, int categoryNumber) {
        this.name = name;
        this.author = author;
        this.categoryNumber = categoryNumber;
    }
    public String toString() {
        return name + " " + "Author: " + author + "category Number: " + categoryNumber;
    }
}

