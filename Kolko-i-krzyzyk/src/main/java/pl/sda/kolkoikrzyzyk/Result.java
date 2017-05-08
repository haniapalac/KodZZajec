package pl.sda.kolkoikrzyzyk;

public class Result {

	private String playerName;
	private int result;

	public Result(String playerName, int result) {
		super();
		this.playerName = playerName;
		this.result = result;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

}
