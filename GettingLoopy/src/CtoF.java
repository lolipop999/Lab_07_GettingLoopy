import java.util.Scanner;

public class CtoF {
        public static void main(String[] args) {
            int tempC = 0;
            int tempF = 0;
            String trash = "";
            String integer = "false";

            Scanner in = new Scanner(System.in);

            do {
                System.out.print("What is the temperature in celsius: ");

                if (in.hasNextInt())
                {
                    tempC = in.nextInt();
                    in.nextLine();
                    integer = "true";
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("Please input an integer: " + trash);
                }
            }
            while (integer == "false");

            tempF = (tempC * 9/5) + 32;

            System.out.println("The temperature in celsius is: " + tempC + " degrees and the temperature in fahrenheit is: " + tempF + " degrees");

            if (tempC <= 0)
            {
                System.out.println(tempC + " degrees celsius and " + tempF + " degrees fahrenheit is the freezing point of water.");
            }
            else if (tempC >= 100)
            {
                System.out.println(tempC + " degrees celsius and " + tempF + " degrees fahrenheit is the boiling point of water.");
            }



        }

}
