package pl.sda.kolkoikrzyzyk;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		TictactoeInterface tictactoeInterface = new TictactoeInterface();
		Board board = new Board();
		String menu = tictactoeInterface.menu();

		Map<String, String> playersMap = new HashMap<>();
		System.out.println("Podaj swoje imię gracza 1:");
		String player1 = tictactoeInterface.enterName();
		System.out.println("Podaj swoje imię gracza 2:");
		String player2 = tictactoeInterface.enterName();
		playersMap.put(player1, "X");
		playersMap.put(player2, "O");
		int player1result = 0;
		int player2result = 0;
		int numberOfPlayedGames = 0;
		String currentPlayer = null;
		String currentPlayer1 = player1;
		String currentPlayer2 = player2;
		final int NINE = 9;

		while (player1result < 3 && player2result < 3) {

			for (int i = 0; i < NINE; i++) {

				tictactoeInterface.showBoard(board);
				boolean isEntered;

				String enteredSign = null;
				if (i % 2 == 0) {
					currentPlayer = currentPlayer1;

				} else {
					currentPlayer = currentPlayer2;

				}
				enteredSign = playersMap.get(currentPlayer);

				do {
					int position = tictactoeInterface.enterField(currentPlayer);
					isEntered = board.enterSign(enteredSign, position);
					if (!isEntered) {
						tictactoeInterface.incorrectField();
					}
				} while (!isEntered);
				if (TictactoeUtil.isGameFinished(board)) {
					tictactoeInterface.gameWon(currentPlayer);
					if (currentPlayer == player1) {
						player1result++;
					} else {
						player2result++;
					}
					break;
				}
				if (i == 8) {
					tictactoeInterface.tie();
				}
			}

			tictactoeInterface.showBoard(board);
			if (currentPlayer == player1) {
				currentPlayer1 = player2;
				currentPlayer2 = player1;
			} else {
				currentPlayer1 = player1;
				currentPlayer2 = player2;
			}
			Result result1 = new Result(player1, player1result);
			Result result2 = new Result(player2, player2result);
			numberOfPlayedGames++;
			tictactoeInterface.gameResult(result1, result2, numberOfPlayedGames);
			board = new Board();

		}
		if (player1result == 3) {
			tictactoeInterface.won(player1);
		} else {
			tictactoeInterface.won(player2);
		}

	}

}
