package Level1.Exercise3.Model;

import java.util.*;

public class CountryGame {

    private final FileManager fileManager;
    private final Map<String, String> countries;

    public CountryGame(FileManager fileManager) {
        this.fileManager = fileManager;
        this.countries = fileManager.loadCountries("countries.txt");
    }

    public void start() {
        if (countries.isEmpty()) {
            System.out.println("No countries loaded. Please check the file.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String playerName = sc.nextLine();


        List<String> countryList = new ArrayList<>(countries.keySet());
        Collections.shuffle(countryList);   // To randomize question order
        int score = 0;

        for (int i = 0; i < 10 && i < countryList.size(); i++) {
            String country = countryList.get(i);
            System.out.println("\nQuestion " + (i + 1) + " of 10:");
            System.out.println("What is the capital of " + country + "?");
            String answer;
            do {
                System.out.print("Your answer: ");
                answer = sc.nextLine().trim();
            } while (answer.isEmpty());

            if (answer.equalsIgnoreCase(countries.get(country))) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + countries.get(country));
            }
        }

        System.out.println("\n---------------------------");
        System.out.println("Game Over");
        System.out.println(playerName + ", your final score is: " + score + "/10");
        System.out.println("---------------------------\n");
        fileManager.saveScore("src/Level1/Exercise3/data/scores.txt", playerName, score);
        System.out.println("Your score has been saved. Thank you for playing!");

        sc.close();
    }
}
