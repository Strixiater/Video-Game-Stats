package statsUI;

public class Score extends Leaderboards {
	private int kills;
	private int assists;
	private int deaths;
	private int score = kills * 100 + assists * 50;
	
	public Score(){}
	
	public Score(int kills, int assists, int deaths, int score) {
		setKills(kills);
		setAssists(assists);
		setDeaths(deaths);
		setScore(score);
	}
	
	public String toString() {
		return "Score: " + getScore();
	}
	
	/**
	 * number of kills the player received
	 * @return number of kills
	 */
	public int getKills() {
		return kills;
	}
	public void setKills(int kills) {
		this.kills = kills;
	}
	
	/**
	 * number of assists the player received
	 * @return number of assists
	 */
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	
	/**
	 * number of player deaths
	 * @return number of deaths
	 */
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	
	/**
	 * player score
	 * @return score
	 */
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	

}
