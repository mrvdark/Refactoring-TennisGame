public class TennisGame {
    public static void main(String[] args) {
        System.out.println(getScore("Vinh", "an", 4, 7));
    }

    public static String getScore(String player1Name, String player2Name, int point1, int point2) {
        String score = "";
        int tempScore = 0;

        boolean sameScore = point1 == point2;
        if (sameScore) {
            switch (point1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else {
            boolean result = point1 >= 4 || point2 >= 4;
            if (result) {
                int minusResult = point1 - point2;
                if (minusResult == 1) score = "Advantage player1";
                else if (minusResult == -1) score = "Advantage player2";
                else if (minusResult >= 2) score = "Win for player1";
                else score = "Win for player2";
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) tempScore = point1;
                    else {
                        score += "-";
                        tempScore = point2;
                    }
                    switch (tempScore) {
                        case 0:
                            score += "Love";
                            break;
                        case 1:
                            score += "Fifteen";
                            break;
                        case 2:
                            score += "Thirty";
                            break;
                        case 3:
                            score += "Forty";
                            break;
                    }
                }
            }
        }
        return score;
    }
}
