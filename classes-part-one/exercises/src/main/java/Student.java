public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        public void setName(String name) {
                this.name = name;
        }
        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }
        public void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }
        public void  setGpa(double gpa) {
                this.gpa = gpa;
        }
        public String getName() {
                return getName();
        }
        public int getStudentId() {
                return getStudentId();
        }
        public int getNumberOfCredits() {
                return getNumberOfCredits();
        }
        public double getGpa() {
                return getGpa();
        }

        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

}
