package sms.dao;

import com.leapfrog.Student;
import java.util.Scanner;

public class StudentDAO {

    private Student[] studentList = new Student[10];
    private int counter;

    static Scanner sc = new Scanner(System.in);

    public void insert(Student s) {
        studentList[counter] = s;
        counter++;
    }

    public boolean delete(int id) {
        for (int i = 0; i < studentList.length; i++) {
            Student s = studentList[i];
            if (s != null && s.getId() == id) {
                s = null;
                counter--;
                return true;

            }
        }
        return false;
    }

    public Student getById(int id) {
        for (int i = 0; i < studentList.length; i++) {
            Student s = studentList[i];
            if (s != null && s.getId() == id) {

                return s;

            }

        }

        return null;

    }

    public boolean update(int id) {
        for (int i = 0; i < studentList.length; i++) {
            Student s = studentList[i];
            if (s != null && s.getId() == id) {
                System.out.println("Enter the new first name, last name, address, contact number serially : ");
                String nm = sc.nextLine();
                String lstnm = sc.nextLine();
                String add = sc.nextLine();
                String cntct = sc.nextLine();
                s.setFirstName(nm);
                s.setLastName(lstnm);
                s.setAddress(add);
                s.setContactNo(cntct);
                System.out.println("Now the updated id information is : ");
                System.out.println(s.getFullInfo());
                counter++;
                return true;

            }
        }
        return false;

    }

    public void getAllInfo() {
        for (int i = 0; i < studentList.length; i++) {
            Student s = studentList[i];
            if (s != null) {
                System.out.println(s.getFullInfo());

            }

        }
    }

}
