import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 
// Decompiled by Procyon v0.5.36
// 

public class GradingScale
{
    public static void main(final String[] args) {
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your numeric grades as percentages one per line  and end with a negative number:");
        double grade = 0.0;
        try {
            grade = Double.parseDouble(in.readLine());
        }
        catch (NumberFormatException e) {
            e.printStackTrace();
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
        double total = 0.0;
        int count = 1;
        String letterGrade = "";
        while (grade >= 0.0) {
            ++count;
            total += grade;
            if (grade >= 90.0 && grade <= 100.0) {
                letterGrade = "A";
            }
            else if (grade >= 75.0) {
                letterGrade = "B";
            }
            else if (grade >= 60.0) {
                letterGrade = "C";
            }
            else if (grade > 50.0) {
                letterGrade = "D";
            }
            else {
                letterGrade = "F";
            }
            System.out.println("Letter grade: " + letterGrade);
            try {
                grade = Double.parseDouble(in.readLine());
            }
            catch (NumberFormatException e3) {
                e3.printStackTrace();
            }
            catch (IOException e4) {
                e4.printStackTrace();
            }
        }
        if (count > 0) {
            System.out.println("Average: " + total / count);
        }
    }
}