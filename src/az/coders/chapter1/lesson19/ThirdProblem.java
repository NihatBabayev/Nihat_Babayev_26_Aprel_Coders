package az.coders.chapter1.lesson19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ThirdProblem {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\user\\IdeaProjects\\Nihat_Babayev_26_Aprel_Coders\\src\\az\\coders\\chapter1\\lesson19\\dates";

        List<Date> dates = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");

            while ((line = br.readLine()) != null) {
                try {
                    Date date = dateFormat.parse(line);
                    dates.add(date);
                } catch (ParseException e) {
                    System.err.println("Failed to parse date: " + line);
                }
            }

            Collections.sort(dates);

            for (Date date : dates) {
                System.out.println(dateFormat.format(date));
            }
        } catch (IOException e) {
            System.err.println("Failed to read the file: " + e.getMessage());
        }
    }
}
