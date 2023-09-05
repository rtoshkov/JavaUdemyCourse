public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // The challenge from lecture
        boolean gameOverChallenge = true;
        int scoreChallenge = 10_000;
        int levelCompletedChallenge = 8;
        int bonusChallenge = 200;

        int finalScoreChallenge = scoreChallenge;

        if (gameOverChallenge) {
            finalScoreChallenge += (levelCompletedChallenge * bonusChallenge);
            System.out.println("Your Challenge score was " + finalScoreChallenge);
        }
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
