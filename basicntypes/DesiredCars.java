public class DesiredCars {
    final int [] yearsAvailable = {2010, 2015, 2016, 2018, 2020};
    final String [] carColorAvailable = {"Green", "Yellow", "Red", "Black"};

    // Car color
    public void carColor(String desiredColor){
        int k = 0;
        boolean yearAvailable = false;
        while (k < carColorAvailable.length){
            if (carColorAvailable[k] == desiredColor){
                yearAvailable = true;
                System.out.println("Desired Color: " + desiredColor + " is available");
                break;
            }
            k++;
        }
        if (!yearAvailable){
            System.out.println("Desired Color: " + desiredColor + " is out of stock.");
        }
    }

    // Car Model
    public void carModel(String desiredModel){
        System.out.println(desiredModel);
    }

    // Car year
    public void carYear(int desiredYear){
        boolean yearAvailable = false;
        for (int i = 0; i < yearsAvailable.length; i++){
            if (desiredYear == yearsAvailable[i]){
                yearAvailable = true;
                System.out.println("Desired Year: " + desiredYear + " is available.");
                break;
            }
        }

        if (!yearAvailable){
            System.out.println("Desired Year: " + desiredYear + " is out of stock.");
        }
    }
}