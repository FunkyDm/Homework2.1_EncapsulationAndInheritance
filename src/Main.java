public class Main {
    public static void main(String[] args) {

        Gryffindor student1 = new Gryffindor(40, 80, "Harry Potter", 9, 10, 10);
        Gryffindor student2 = new Gryffindor(10, 30, "Ron Weasley", 5, 4, 3);
        Gryffindor student3 = new Gryffindor(70, 85, "Hermione Ganger", 7, 6, 8);

        Slytherin student4 = new Slytherin(40, 60, "Drako Malfoy", 10, 7, 9, 3, 10);
        Slytherin student5 = new Slytherin(10, 10, "Gregory Goyle", 3, 4, 3, 5, 1);
        Slytherin student6 = new Slytherin(10, 10, "Graham Montegue", 7, 7, 5, 6, 5);

        Hufflepuff student7 = new Hufflepuff(20, 40, "Zacharias Smith", 7, 5, 6);
        Hufflepuff student8 = new Hufflepuff(40, 60, "Cedric Diggory", 8, 8, 7);
        Hufflepuff student9 = new Hufflepuff(10, 20, "Justin Finch-Fletchey", 6, 7, 5);

        Ravenclaw student10 = new Ravenclaw(10, 30, "Cho Chang", 5, 5, 6, 6);
        Ravenclaw student11 = new Ravenclaw(30, 50, "Padma Patil", 6, 6, 7, 7);
        Ravenclaw student12 = new Ravenclaw(20, 40, "Marcus Belby", 5, 6, 8, 7);

        student1.descriptionStudent();
        student2.descriptionStudent();
        student3.descriptionStudent();

        student1.twoStudentsFacultyComparison(student1);

        student5.descriptionStudent();
        student6.descriptionStudent();
        student4.descriptionStudent();

        student4.twoStudentsFacultyComparison(student6);

        student7.descriptionStudent();
        student8.descriptionStudent();
        student9.descriptionStudent();

        student9.twoStudentsFacultyComparison(student8);

        student10.descriptionStudent();
        student11.descriptionStudent();
        student12.descriptionStudent();

        student11.twoStudentsFacultyComparison(student10);

        student8.twoStudentsComparison(student2);

    }
}