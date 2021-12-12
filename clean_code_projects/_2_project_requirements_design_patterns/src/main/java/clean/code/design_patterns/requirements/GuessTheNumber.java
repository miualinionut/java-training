package clean.code.design_patterns.requirements;

import java.util.*;
//singleton
public class GuessTheNumber {
    private static final GuessTheNumber SINGLETON = new GuessTheNumber();
    private final Random random = new Random();
    private final List<GameHistory> gameHistories = new LinkedList<>();
    private GameHistory currentGame = null;
    public static Scanner in = new Scanner(System.in);
    private static class GameHistory {
        private final int lowBoundary;
        private final int highBoundary;

        public int getCorrectAnswer() {
            return correctAnswer;
        }

        private final int correctAnswer;

        public List<Integer> getGuesses() {
            return guesses;
        }

        private final List<Integer> guesses = new LinkedList<>();
        public GameHistory(int lowBoundary, int highBoundary, int correctAnswer) {
            this.lowBoundary = lowBoundary;
            this.highBoundary = highBoundary;
            this.correctAnswer = correctAnswer;
        }

        public void addGuess(int guess) {
            if (guesses.size() == 0) {
                guesses.add(guess);
            } else if (guesses.get(guesses.size() - 1) == correctAnswer) {
                System.out.println("Rezultatul a fost deja ghicit!");
            } else {
                guesses.add(guess);
            }
        }

        public boolean isWon() {
            if (guesses.size() > 0) {
                return guesses.get(guesses.size() - 1) == correctAnswer;
            }
            else {
                return false;
            }
        }

        public int getLowBoundary() {
            return lowBoundary;
        }

        public int getHighBoundary() {
            return highBoundary;
        }
    }
    private GuessTheNumber() {

    }

    public static GuessTheNumber GetInstance() {
        return SINGLETON;
    }

    public boolean startNewGame(){

        if (currentGame == null) {
            int lowBoundary, highBoundary;
            do {
                System.out.println("Introduceti un interval [a, b] de numere naturale!");
                System.out.println("a=");
                lowBoundary = in.nextInt();
                System.out.println("b=");
                highBoundary = in.nextInt();
                if (lowBoundary >= highBoundary || lowBoundary < 0 || highBoundary < 0) {
                    System.out.println("Interval invalid!");
                } else {

                    break;
                }
            } while (true);

            int correctAnswer = random.nextInt();
            correctAnswer = correctAnswer % (highBoundary - lowBoundary);
            correctAnswer = correctAnswer + lowBoundary;
            currentGame = new GameHistory(lowBoundary, highBoundary, correctAnswer);
            gameHistories.add(currentGame);
            return true;
        } else {

            do {
                System.out.println("Sunteti sigur ca vreti sa incheiati jocul in desfasurare?(D/N)");
                String response;
                do {
                    response = in.nextLine();
                } while (response.length() == 0);
                if (response.charAt(0) == 'd' || response.charAt(0) == 'D') {
                    int lowBoundary, highBoundary;
                    do {
                        System.out.println("Introduceti un interval [a, b] de numere naturale!");
                        System.out.println("a=");
                        lowBoundary = in.nextInt();
                        System.out.println("b=");
                        highBoundary = in.nextInt();
                        if (lowBoundary >= highBoundary || lowBoundary < 0 || highBoundary < 0) {
                            System.out.println("Interval invalid!");
                        } else {
                            break;
                        }
                    } while (true);

                    int correctAnswer = random.nextInt();
                    correctAnswer = correctAnswer % (highBoundary - lowBoundary);
                    correctAnswer = correctAnswer + lowBoundary;
                    currentGame = new GameHistory(lowBoundary, highBoundary, correctAnswer);
                    gameHistories.add(currentGame);
                    return true;
                } else if (response.charAt(0) == 'n' || response.charAt(0) == 'N') {
                    return false;
                } else {
                    System.out.println("Raspuns invalid!");
                }
            } while (true);
        }
    }

    public boolean guess(int guessedNumber) {
        if (currentGame == null) {
            System.out.println("Nu este nici un joc in desfasurare!");
            return false;
        } else if (currentGame.isWon()) {
            System.out.println("Nu este nici un joc in desfasurare!");
            return false;
        } else {
            currentGame.addGuess(guessedNumber);
            if (guessedNumber > currentGame.getCorrectAnswer()) {
                System.out.println("Prea mare!");
                return false;
            } else if (guessedNumber < currentGame.getCorrectAnswer()) {
                System.out.println("Prea mic!");
                return false;
            } else {
                System.out.println("Numarul a fost ghicit!");
                currentGame = null;
                return true;
            }
        }
    }

    public String getHistory() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < gameHistories.size(); i++) {
            GameHistory gh = gameHistories.get(i);
            if (gh != currentGame) {
                result.append("Interval: [").append(gh.getLowBoundary()).append(",").append(gh.getHighBoundary()).append("]\n");
                result.append("Raspuns corect: ").append(gh.getCorrectAnswer()).append("\n");
                result.append("Lista raspunsuri primite: ").append(gh.getGuesses()).append("\n\n\n");
            }
        }
        return result.toString();
    }
    public void playGame() {
        do {
            System.out.println("Ce doriti sa faceti?(S=pornire joc, H=afisare istoric, [numar]=ghiceste, E=iesire)");
            String response;
            do {
                response = in.nextLine();
            } while (response.length() == 0);
            if (response.charAt(0) == 's' || response.charAt(0) == 'S') {
                startNewGame();
            } else if (response.charAt(0) == 'h' || response.charAt(0) == 'H') {
                System.out.println(getHistory());}
            else if (response.charAt(0) == 'e' || response.charAt(0) == 'E') {
                break;
            } else {
                try {
                    int guess = Integer.parseInt(response);
                    guess(guess);
                } catch (Exception e) {
                    System.out.println("Input invalid!");
                    e.printStackTrace();
                }
            }
        } while (true);
    }
}
