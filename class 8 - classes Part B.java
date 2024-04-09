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
