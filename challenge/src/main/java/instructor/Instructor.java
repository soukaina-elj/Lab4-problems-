package instructor;
import student.Person;

public class Instructor extends Person{
    private String employeeNumber;
    public Instructor(String firstName, String secondName,
                      String phone, String email, String employeeNumber) {
        super(firstName, secondName, phone, email);
        this.employeeNumber = employeeNumber;
    }
    public String cleanEmployeeNumber() {
        return employeeNumber.trim().replace(" ","");
    }
    public String toCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instructor\n");
        sb.append("----------\n");
        sb.append("Employee #: ").append(employeeNumber).append("\n");
        sb.append("Name : ").append(secondName).append(", ").append(firstName).append("\n");
        sb.append("Email : ").append(email).append("\n");
        sb.append("Phone : ").append(phone);
        return sb.toString();
    }
    public String displayName() {
        StringBuilder sb = new StringBuilder();
        if (secondName != null) {
            sb.append(secondName);
        }
        if (firstName != null) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(firstName);
        }
        return sb.toString();
    }
    public String summaryLine() {
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]", employeeNumber, secondName, firstName);
    }





}
