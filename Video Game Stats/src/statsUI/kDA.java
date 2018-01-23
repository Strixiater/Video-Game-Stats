package statsUI;

public class kDA extends Leaderboards {
	private int kills;
	private int deaths;
	private int kDA = kills/deaths;
	
	public kDA() {}
	
	public kDA(int kills, int deaths, int kDA) {
		setKills(kills);
		setDeaths(deaths);
		setkDA(kDA);
	}
	
	/**
	 * number of player kills
	 * @return number of kills
	 */
	public int getKills() {
		return kills;
	}
	public void setKills(int kills) {
		this.kills = kills;
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
	 * calculated player kills/deaths
	 * @return kda
	 */
	public int getkDA() {
		return kDA;
	}
	public void setkDA(int kDA) {
		this.kDA = kDA;
	}

}
