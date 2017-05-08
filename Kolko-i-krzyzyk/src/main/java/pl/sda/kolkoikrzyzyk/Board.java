package pl.sda.kolkoikrzyzyk;

public class Board {

	private String[] fields;

	public String[] getFields() {
		return fields;
	}

	public Board() {
		fields = new String[9];
		for (int i = 1; i <= fields.length; i++) {
			fields[i - 1] = String.valueOf(i);
		}
	}

	public boolean enterSign(String sign, int position) {
		if (!TictactoeUtil.isDigit(fields[position - 1])) {
			return false;
		}
		fields[position - 1] = sign;
		return true;

	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < fields.length; i++) {
			if (i != 0 && i % 3 == 0) {
				stringBuilder.append("\n");
				stringBuilder.append("-----");
				stringBuilder.append("\n");
			}
			if (TictactoeUtil.isDigit(fields[i])) {
				stringBuilder.append(i + 1);
			} else {
				stringBuilder.append(fields[i]);
			}
			if (i != 2 && i != 5 && i != 8) {
				stringBuilder.append("|");
			}

		}
		return stringBuilder.toString();
	}
}
