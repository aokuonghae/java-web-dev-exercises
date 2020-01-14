package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        Student myself= new Student("Anastasia",98018, 1, 4.0);
    }

    public class Teacher {
        String firstName;
        String lastName;
        String subject;
        int yearsTeaching;

        public Teacher (String firstname, String lastName, String subject, int yearsTeaching){
            this.firstName=firstName;
            this.lastName=lastName;
            this.subject=subject;
            this.yearsTeaching = yearsTeaching;
        }

    }
}
