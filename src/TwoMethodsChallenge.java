public class TwoMethodsChallenge {

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 100) {
            position = 3;
        }
        if (score >= 500) {
            position = 2;
        }
        if (score >= 1000) {
            position = 1;
        }

        return position;
    }

    public static void main(String[] args) {
        displayHighScorePosition("Thomas", calculateHighScorePosition(1500));
        displayHighScorePosition("Thomas", calculateHighScorePosition(999));
        displayHighScorePosition("Thomas", calculateHighScorePosition(499));
        displayHighScorePosition("Thomas", calculateHighScorePosition(99));
        displayHighScorePosition("Thomas", calculateHighScorePosition(-1000));
    }

}




