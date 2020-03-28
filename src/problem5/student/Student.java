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
}
