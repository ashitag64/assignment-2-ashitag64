/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {

    //4 fields for student class
    private int rollNo;
    private String name;
    private int backLogCounter;
    private int appearingCounter;

    //getter methods for the fields
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getBackLogCounter() {
        return backLogCounter;
    }

    public int getAppearingCounter() {
        return appearingCounter;
    }

    //setter methods for the fields
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBackLogCounter(int backLogCounter) {
        this.backLogCounter = backLogCounter;
    }

    public void setAppearingCounter(int appearingCounter) {
        this.appearingCounter = appearingCounter;
    }

    //override toString() method
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", backLogCounter=" + backLogCounter +
                ", appearingCounter=" + appearingCounter +
                '}';
    }
}
