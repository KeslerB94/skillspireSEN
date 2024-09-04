//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int calculateCrimeRisk() {

        int crimeRisk = 20;

        return crimeRisk;

    }

    public static int calculateEarthquakeRisk() {

        int earthquakeRisk = 20;

        return earthquakeRisk;
    }

    public static int calculateFloodRisk() {



        int floodRisk = 20;

        return floodRisk;

    }

    public static int totalCalculatedRisk() {
        calculateCrimeRisk();
        calculateFloodRisk();
        calculateEarthquakeRisk();
        int sumOfRisks = calculateCrimeRisk() + calculateFloodRisk() + calculateEarthquakeRisk();
        return sumOfRisks;

    }
    public static void main(String[] args) {

        System.out.println(totalCalculatedRisk());
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        }
    }