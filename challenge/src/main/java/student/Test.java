package student;

public class Test {
    public static void main(String[] args) {
        Major cs = new Major("23", "Computer science");
        Major math = new Major("24", "Mathematics");
        Student s1 = new Student("Safi","Amal","","","22885676",cs);
        Student s2 = new Student("Alami","Samir","","","23585976",cs);
        Student s3 = new Student("Bennani","Sara","","","24567890",math);
        cs.displayStudents();
        System.out.println("Find student by CNE: " + cs.findStudentByCNE("22885676"));
        System.out.println("Formatted name: " + s1.getFullNameFormatted());
        System.out.println("Number of students: " + cs.getStudentCount());
        System.out.println("Computer science capacity: 50 students");
        System.out.println("Current enrollment: " + cs.getStudentCount() + " students");
        System.out.println("Occupancy rate = " + cs.getOccupancyRate() + "%");
        System.out.println("Student list:");
        System.out.print(cs.getStudentListAsString());
        System.out.println("\nStudent removed: " + cs.removeStudent("22885676"));
        cs.displayStudents();

    }
}

