//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        UserCredentials Steve = new UserCredentials("SteveWillis22@yahoo.com", "asd321", "Willis", "Steve");
        UserCredentials Bob = new UserCredentials("BobWillis23@yahoo.com", "asd123", "Willis", "Bob");

        System.out.println(Steve.getFirstName());
        System.out.println(Steve.getLastName());

        System.out.println(Bob.getFirstName());
        System.out.println(Bob.getLastName());

        automateInvesting(500, 200, 0);

    }

    public static int automateInvesting(int savingsAccountBalance, int indexFundBalance, int depositAmount) {

        if (savingsAccountBalance > 50000) {

            indexFundBalance = indexFundBalance + depositAmount;

            System.out.println("indexFundBalance = " + indexFundBalance);

            return indexFundBalance;
        } else {

            savingsAccountBalance = savingsAccountBalance + depositAmount;

            System.out.println("savingsAccountBalance = " + savingsAccountBalance);

        return savingsAccountBalance;
    }
}
    }
