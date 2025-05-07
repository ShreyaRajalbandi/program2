public class StudentCourse{
    String[] courses = {"Math", "Physics", "CS"};
    int[] marks = {78, 65, 92};

    public void displayCourses() {
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i] + ": " + marks[i]);
        }
    }
    public static void main(String []args){
        StudentCourse sc=new StudentCourse();
        sc.displayCourses();
    }
}
