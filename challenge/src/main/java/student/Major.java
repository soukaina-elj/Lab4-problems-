package student;

public class Major {
  private static int nextId = 1;
   private int id;
   private String code;
   private String name;
   private Student[] students;
   private int studentCount;
   public Major(){this("23","Computer science");};
   public Major(String code, String name) {
       this.id = nextId++;
       this.code = code;
       this.name = name;
       this.students = new Student[50];
       this.studentCount = 0;
    }
    // Method to add a student
   public void addStudent(Student s) {
       if(s == null) {
           return;
       }
       if(studentCount >= 50) {
           System.out.println("The major is full.");
           return;
       }
       for(int i = 0; i < studentCount; i++) {
           if (students[i] == s) {
               return;
           }
       }
       students[studentCount] = s;
       studentCount++;
    }


    // Getters
    public int getId() {
        return id;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }



    //Display all students in the major
    public void displayStudents() {
        System.out.println("The list of students in the " + name.toLowerCase() + " major is:");
        System.out.print(getStudentListAsString());

    }
    public Student findStudentByCNE(String cne) {
        for(int i = 0; i < studentCount; i++) {
            if(students[i].getCne().equals(cne)) {
                return students[i];
            }
        }
        return null;
    }

    public int getStudentCount() {
        return studentCount;
    }
    public boolean removeStudent(String cne) {
        Student s = findStudentByCNE(cne);
        if (s == null) {
            return false;
        }
        for (int i = 0; i < studentCount; i++) {
            if (students[i] == s) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                studentCount--;
                students[studentCount] = null;
                return true;
            }
        }
        return false;
    }
    public double getOccupancyRate() {
        return (studentCount * 100.0) / 50;
    }

    public String getStudentListAsString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < studentCount; i++) {
            sb.append(i + 1).append(". ").append(students[i].getCne()).append(" ").append(students[i].getSecondName().toUpperCase()).append(" ").append(students[i].getFirstName()).append("\n");
        }
        return sb.toString();
    }

    public String toString() {
        return "Major{id=" + id + ", code='" + code + "', name='" + name + "', studentCount=" + studentCount + "}";
    }


}
