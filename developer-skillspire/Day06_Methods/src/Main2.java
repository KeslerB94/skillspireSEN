public class Main2 {

    public static void main(String[] args) {

        int userAge = 17;
        System.out.println(userAge == 17);

        String name = "Beau";
        System.out.println(name == "Beau");
        System.out.println(name.equals("Beau"));
//wrong way
        String s1 = "hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s3);
      //right way to compare strings
        System.out.println(s1.equals(s3));


    }





}




