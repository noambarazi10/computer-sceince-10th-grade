public class AP {
    private int firstMember, difference;
    public AP(int firstMember, int difference) {
        this.firstMember = firstMember;
        this.difference = difference;
    }    
    public AP(AP other) {
        this.firstMember = other.firstMember;
        this.difference = other.difference;
    }
    public int getFirstMember(int firstMember) {
        return firstMember;
    }
    public int getDifference(int difference) {
        return difference;
    }
    public void setFirstMember(int newN) {
        firstMember = newN;
    }
    public void setDifference(int newD) {
        difference = newD;
    }
    public boolean smallDiff(int newDiff) {
        if (newDiff < difference) {
            return true;
        }
        return false;
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
    }
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
    public Student(Student other) {
        id = other.id;
        privateName = other.privateName;
        lastName = other.lastName;
    }
    public String toString() {
        return privateName + " " + lastName + " " + id;
    }
    public int getId() {
        return id;
    }
    public String getPrivateName() {
        return privateName;
    }
    public String getlastName() {
        return lastName;
    }
    public void setId(int newId) {
        id = newId;
    }
    public void setPrivateName(String nameN) {
        privateName = nameN;
    }
    public void setLastName(String name1) {
        lastName = name1;
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
    public Book(Book other) {
        name = other.name;
        author = other.author;
        categoryNumber = other.categoryNumber;
    }
    public String toString() {
        return name + " " + "Author: " + author + "category Number: " + categoryNumber;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getcategoryNumber() {
        return categoryNumber;
    }
    public void setName(String name1) {
        name = name1;
    }
    public void setAuthor(String author1) {
        author = author1;
    }
    public void setcategoryNumber(int categoryNumber1) {
        categoryNumber = categoryNumber1;
    }
    public boolean book(int category) {
        if (category == categoryNumber) {
            return true;
        }
        return false;
    } 
}
