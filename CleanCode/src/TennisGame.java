public class TennisGame {
    public static final char SUBTRACTION = '-';
    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scrorePlayer2) {
        String score = "";
        int tempScore=0;
        score = CheckScore(player1Name, player2Name, scorePlayer1, scrorePlayer2, score);
        return score;
    }

    private static String CheckScore(String player1Name, String player2Name, int scorePlayer1, int scrorePlayer2, String score) {
        int tempScore;
        if (scorePlayer1==scrorePlayer2)
        {
            switch (scorePlayer1)
            {
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
        }
        else if (scorePlayer1>=4 || scrorePlayer2>=4)
        {
            int result = scorePlayer1-scrorePlayer2;
            boolean RESULT_1 = result == 1;
            if (RESULT_1) score ="Advantage player1";
            else {
                boolean RESULT_1nega = result == -1;
                if (RESULT_1nega) score ="Advantage player2";
                else {
                    boolean RESULT_2 = result >= 2;
                    if (RESULT_2) score = "Win for " + player1Name;
                    else score ="Win for " + player2Name;
                }
            }
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = scorePlayer1;
                else {
                    score = score + SUBTRACTION;
                    tempScore = scrorePlayer2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {
        System.out.println(getScore("AN","BINH",2,6));
    }
}
