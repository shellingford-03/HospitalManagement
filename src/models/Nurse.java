
package models;

import java.io.Serializable;

public class Nurse extends Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String deparment;
    private String shift;
    private double salary;

    public Nurse() {
    }

    public Nurse(String id, String name, int age, String gender, String address, String phone, String deparment,
            String shift, double salary) {
        super(id, name, age, gender, address, phone);
        this.deparment = deparment;
        this.shift = shift;
        this.salary = salary;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void show() {
        String str = String.format("%s,%s,%d,%s,%s,%s,%s,%s,%f",
                id, name, age, gender, address, phone, deparment, shift, salary);
        System.out.println(str);
    }

    @Override
    public String toString() {
        String str = String.format("%s,%s,%d,%s,%s,%s,%s,%s,%f",
                id, name, age, gender, address, phone, deparment, shift, salary);
        return str;
    }
}
