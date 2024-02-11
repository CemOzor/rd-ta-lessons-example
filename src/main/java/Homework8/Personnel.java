package Homework8;
import java.time.LocalDate;
import java.time.Period;

class Personnel {
        private String firstName;
        private String lastName;
        private LocalDate dateOfBirth;

        public Personnel(String firstName, String lastName, LocalDate dateOfBirth) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.dateOfBirth = dateOfBirth;
}

        public int calculateRetirementAge() {
            LocalDate now = LocalDate.now();
            int retirementAge;
            if (this instanceof Male) {
                retirementAge = 65;
            } else if (this instanceof Female) {
                retirementAge = 60;
            } else {
                retirementAge = -1; // Hata durumu
            }
            int age = Period.between(dateOfBirth, now).getYears();
            return retirementAge - age;
        }
    }

