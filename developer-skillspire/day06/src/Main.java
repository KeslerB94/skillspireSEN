//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        countToTen();
        countToTwelve(0);
        countToFourteen(0);
    }

    public static void countToTen() {


        for (int i = 0; i <= 15; i++) {

            System.out.println("count to ten " + i);
        }

    }

    public static void countToTwelve(int i) {


        while (i != 12) {

            i++;
            System.out.println("count to 12 " +  i);
        }
    }

    public static void countToFourteen(int i) {



        do {
           i++;
        }
        while (i != 14);
        System.out.println("count to fourteen " + i);
    }
}
