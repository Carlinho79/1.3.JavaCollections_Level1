package Level1.Exercise3.Model;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileManager {

    // Method to read country data from a file
    public Map<String, String> loadCountries(String resourceName) {
        // Implementation to return a map of country names and their capitals
        Map<String, String> countries = new HashMap<>();

        String filepath = System.getProperty("user.dir")
                + "/src/Level1/Exercise3/Resources/" + resourceName;

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("=")) {
                    String[] parts = line.split("=");
                    String country = parts[0].trim();
                    String capital = parts[1].trim();
                    countries.put(country, capital);
                }
            }
        } catch (IOException e) {
            System.out.println("⚠️ Reading file error: " + e.getMessage());
        }

        return countries;
    }

    // Method to save game results to a file (not implemented here)
    public void saveScore(String filePath, String playerName, int score) {
        File file = new File(filePath);
        // Create the file if it doesn't exist
        file.getParentFile().mkdirs();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(playerName + "=" + score);
            writer.newLine();
            System.out.println("✅ Score saved successfully to: " + file.getPath());
        } catch (IOException e) {
            System.out.println("⚠️ Writing file error: " + e.getMessage());
        }
    }
}
