package Level1.Exercise3.App;

import Level1.Exercise3.Model.CountryGame;
import Level1.Exercise3.Model.FileManager;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        // Initialize and start the game
        CountryGame game = new CountryGame(fileManager);
        game.start();
    }
}
