public class Main {
  
    public static void main(String[] args) {

        Course math = new Course("Mathematics", "MAT101", "MAT", 0.2, 0.8);
        Course physics = new Course("Physics", "FZK101", "FZK", 0.3, 0.7);
        Course chemistry = new Course("Chemistry", "KMY101", "KMY", 0.4, 0.6);

        Teacher t1 = new Teacher("John Doe", "90550000000", "MAT");
        Teacher t2 = new Teacher("Jane Smith", "90550000001", "FZK");
        Teacher t3 = new Teacher("Alice Johnson", "90550000002", "KMY");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Alice", 4, "140144015", math, physics, chemistry);
        s1.addBulkExamNote(90, 60, 80, 70, 85, 65);
        s1.isPass();

        Student s2 = new Student("Bob", 4, "2211133", math, physics, chemistry);
        s2.addBulkExamNote(50, 40, 60, 50, 70, 60);
        s2.isPass();

        Student s3 = new Student("Charlie", 4, "221121312", math, physics, chemistry);
        s3.addBulkExamNote(30, 20, 40, 30, 50, 40);
        s3.isPass();
        
    }
}
