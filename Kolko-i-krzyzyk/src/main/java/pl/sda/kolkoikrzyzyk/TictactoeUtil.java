package pl.sda.kolkoikrzyzyk;

public class TictactoeUtil {

	public static boolean isDigit(String text) {
		char table[] = text.toCharArray();
		char sign = table[0];
		return (sign > 48 && sign < 58 && table.length < 2);
	}

	public static boolean checkRows(Board board) {
		String[] fields = board.getFields();
		for (int i = 0; i < 9; i += 3) {
			String pattern = board.getFields()[i];
			if (pattern.equals(fields[i + 1]) && pattern.equals(fields[i + 2])) {
				return true;
			}
		}
		return false;
	}

	public static boolean checkColumns(Board board) {
		String[] fields = board.getFields();
		for (int i = 0; i < 3; i++) {
			String pattern = fields[i];
			if (pattern.equals(fields[i + 3]) && pattern.equals(fields[i + 6])) {
				return true;
			}
		}
		return false;
	}

	public static boolean checkDiagonal(Board board) {
		String[] fields = board.getFields();
		String pattern = fields[4];
		boolean leftToRightDiagonal = pattern.equals(fields[0]) && pattern.equals(fields[8]);
		boolean rightToLeftDiagonal = pattern.equals(fields[2]) && pattern.equals(fields[6]);
		if (leftToRightDiagonal || rightToLeftDiagonal) {
			return leftToRightDiagonal || rightToLeftDiagonal;
		}
		return false;
	}

	public static boolean isGameFinished(Board board) {
		return checkRows(board) || checkColumns(board) || checkDiagonal(board);
	}

}
