package instructor;

public class Subject {
    private static int nextId = 1;
    private int id;
    private String code;
    private String title;
    public Subject(String code, String title) {
        this.id = nextId++;
        this.code = code;
        this.title = title;
    }
    public String normalizedCode() {
        return code.trim().toUpperCase();
    }
    public String properTitle() {
        StringBuilder sb = new StringBuilder();
        String[] s = title.split(" ");
        for (String w : s) {
            if (!w.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(Character.toUpperCase(w.charAt(0)));
                sb.append(w.substring(1));
            }
        }
        return sb.toString();
    }
    public boolean isIntroCourse() {
        return title.toLowerCase().contains("intro") || normalizedCode().startsWith("INTRO-");
    }
    public String syllabusLine(Instructor instructor) {
        StringBuilder sb = new StringBuilder();
        sb.append(code).append(" - ").append(title);
        sb.append(" (Instructor: ");
        sb.append(instructor.getSecondName()).append(" ");
        sb.append(instructor.getFirstName()).append(")");
        return sb.toString();
    }



}
