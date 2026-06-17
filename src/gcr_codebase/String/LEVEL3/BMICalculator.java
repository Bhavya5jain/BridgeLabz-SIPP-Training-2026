package gcr_codebase.String.LEVEL3;

import java.util.Scanner;

public class BMICalculator {

    public static String[][] calculateBMI(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double height = data[i][1] / 100.0;

            double bmi = weight / (height * height);

            String status;

            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 25)
                status = "Normal";
            else if (bmi < 40)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.valueOf(data[i][0]);
            result[i][1] = String.valueOf(data[i][1]);
            result[i][2] = String.valueOf(Math.round(bmi * 100.0) / 100.0);
            result[i][3] = status;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][2];

        for (int i = 0; i < 10; i++) {
            persons[i][0] = sc.nextDouble();
            persons[i][1] = sc.nextDouble();
        }

        String[][] result = calculateBMI(persons);

        System.out.println("Weight\tHeight\tBMI\tStatus");

        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1] + "\t" +
                    row[2] + "\t" + row[3]);
        }

        sc.close();
    }
}