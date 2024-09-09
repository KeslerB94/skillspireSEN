public class Man4 {
    public static String[] students = {"Beau", "Donald", "Tom"};
    public static double[] grades = {4.0,3.0,3.5};
    public static void main(String[] args) {

        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }
        getStudentsGrades(2);
        getStudentsGrades(0);

    }

    public static void getStudentsGrades(int index) {

        if (index >= 0 && index < students.length) {
            System.out.println("Student: " + students[index]);

        }
        else{
            System.out.println("out of bounds");
            }
            if (index >= 0 && index < grades.length) {
                System.out.println("Grade: " + grades[index]);
            }
            else{
                System.out.println("out of bounds");

            }

    }
    }
