public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int oralNote;
    int examNote;
    double oralWeight;
    double examWeight;

    public Course(String name, String code, String prefix, double oralWeight, double examWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.oralNote = -1; 
        this.examNote = -1;
        this.oralWeight = oralWeight;
        this.examWeight = examWeight;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Operation successful.");
        } else {
            System.out.println(t.name + " cannot teach this course.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " course teacher: " + courseTeacher.name);
        } else {
            System.out.println("No teacher assigned to " + this.name + " course.");
        }
    }
}
