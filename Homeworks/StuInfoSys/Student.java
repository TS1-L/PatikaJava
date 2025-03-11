public class Student {
  
    String name, stuNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mathOral, int mathExam, int physicsOral, int physicsExam, int chemistryOral, int chemistryExam) {
        if (mathOral >= 0 && mathOral <= 100 && mathExam >= 0 && mathExam <= 100) {
            this.math.oralNote = mathOral;
            this.math.examNote = mathExam;
        }

        if (physicsOral >= 0 && physicsOral <= 100 && physicsExam >= 0 && physicsExam <= 100) {
            this.physics.oralNote = physicsOral;
            this.physics.examNote = physicsExam;
        }

        if (chemistryOral >= 0 && chemistryOral <= 100 && chemistryExam >= 0 && chemistryExam <= 100) {
            this.chemistry.oralNote = chemistryOral;
            this.chemistry.examNote = chemistryExam;
        }
    }

    public void isPass() {
        if (this.math.oralNote == -1 || this.math.examNote == -1 || this.physics.oralNote == -1 || this.physics.examNote == -1 || this.chemistry.oralNote == -1 || this.chemistry.examNote == -1) {
            System.out.println("Grades are not fully entered.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average: " + this.average);
            if (this.isPass) {
                System.out.println("Passed the class.");
            } else {
                System.out.println("Failed the class.");
            }
        }
    }

    public void calcAverage() {
        double mathAverage = (this.math.oralNote * this.math.oralWeight) + (this.math.examNote * this.math.examWeight);
        double physicsAverage = (this.physics.oralNote * this.physics.oralWeight) + (this.physics.examNote * this.physics.examWeight);
        double chemistryAverage = (this.chemistry.oralNote * this.chemistry.oralWeight) + (this.chemistry.examNote * this.chemistry.examWeight);
        this.average = (mathAverage + physicsAverage + chemistryAverage) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Student: " + this.name);
        System.out.println("Math Oral Grade: " + this.math.oralNote + ", Math Exam Grade: " + this.math.examNote);
        System.out.println("Physics Oral Grade: " + this.physics.oralNote + ", Physics Exam Grade: " + this.physics.examNote);
        System.out.println("Chemistry Oral Grade: " + this.chemistry.oralNote + ", Chemistry Exam Grade: " + this.chemistry.examNote);
    }
}
