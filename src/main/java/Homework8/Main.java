package Homework8;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Takım lideri oluşturuluyor
        TeamLead teamLead = new TeamLead("John", "Doe", LocalDate.of(1980, 5, 15));

        // Departman oluşturuluyor ve takım lideri atanıyor
        Department department = new Department(teamLead);

        // Departmana personel ekleniyor
        Personnel person1 = new Male("Michael", "Smith", LocalDate.of(1990, 8, 20));
        Personnel person2 = new Female("Emily", "Johnson", LocalDate.of(1985, 3, 10));


        // Emeklilik yaşları hesaplanıyor
        System.out.println("Michael Smith's retirement age: " + person1.calculateRetirementAge());
        System.out.println("Emily Johnson's retirement age: " + person2.calculateRetirementAge());
    }
}