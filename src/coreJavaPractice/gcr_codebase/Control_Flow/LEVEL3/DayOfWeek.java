package coreJavaPractice.gcr_codebase.Control_Flow.LEVEL3;

public class DayOfWeek {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Error: Please supply arguments in the format: java DayOfWeek <month> <day> <year>");
            System.out.println("Example: java DayOfWeek 6 11 2026");
            return;
        }

        try {
            int m = Integer.parseInt(args[0]);
            int d = Integer.parseInt(args[1]);
            int y = Integer.parseInt(args[2]);

            if (y < 1582) {
                System.out.println("The calculation requires standard Gregorian Calendar limits (Year >= 1582).");
                return;
            }

            int y0 = y - (14 - m) / 12;
            int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
            int m0 = m + 12 * ((14 - m) / 12) - 2;
            int d0 = (d + x + (31 * m0) / 12) % 7;

            String[] standardDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

            System.out.println("Calculated Output Integer: " + d0);
            System.out.println("Day of Week text profile: " + standardDays[d0]);

        } catch (NumberFormatException e) {
            System.out.println("Failure processing inputs. Confirm parameter fields are strictly integer formatting values.");
        }
    }
}