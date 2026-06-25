package inheritance;

public class university_system {

    static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

    static class Student extends Person {
        private final String studentId; // must be final
        private final double gpa;

        public Student(String name, int age, String studentId, double gpa) {
            super(name, age);
            this.studentId = studentId;
            this.gpa = gpa;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "studentId='" + studentId + '\'' +
                    ", gpa=" + gpa +
                    ", super=" + super.toString() +
                    '}';
        }
    }

    static class GradStudent extends Student {
        private final String thesis;

        public GradStudent(String name, int age, String studentId, double gpa, String thesis) {
            super(name, age, studentId, gpa);
            this.thesis = thesis;
        }

        @Override
        public String toString() {
            return "GradStudent{" +
                    "thesis='" + thesis + '\'' +
                    ", super=" + super.toString() +
                    '}';
        }
    }

    public static void main(String[] args) {
        GradStudent grad = new GradStudent(
                "Alice",
                22,
                "S-1001",
                3.95,
                "Deep Learning for Efficient Training");

        System.out.println("Object via toString():");
        System.out.println(grad);
        System.out.println();

        System.out.println("IS-A checks:");
        System.out.println("grad IS-A Student? " + (grad instanceof Student));
        System.out.println("grad IS-A Person? " + (grad instanceof Person));
    }
}
