package es.jsonkit.profile;

/**
 * @author Adrian
 * 
 *         La clase Kills representa la cuantificacion de los asesinatos
 *         realizados por el heroe
 *         Esta clase desglosa por monstruos normales y elites para el modo de
 *         juego softcore
 *         y monstruos asesinados en general para el modo hardcore
 * 
 */
public class Kills {

	/**
	 * Cantidad de monstruos
	 */
	private Integer monsters;

	/**
	 * Cantidad de elites
	 */
	private Integer elites;

	/**
	 * Si Hero.hardcore es <code>true</code> Cantiodad de monstruos (elites o
	 * no) en modo hardocre
	 */
	private Integer hardcoreMonsters;

	/**
	 * @return the monsters
	 */
	public Integer getMonsters() {
		return monsters;
	}

	/**
	 * @param monsters
	 *            the monsters to set
	 */
	public void setMonsters(Integer monsters) {
		this.monsters = monsters;
	}

	/**
	 * @return the elites
	 */
	public Integer getElites() {
		return elites;
	}

	/**
	 * @param elites
	 *            the elites to set
	 */
	public void setElites(Integer elites) {
		this.elites = elites;
	}

	/**
	 * @return the hardcoreMonsters
	 */
	public Integer getHardcoreMonsters() {
		return hardcoreMonsters;
	}

	/**
	 * @param hardcoreMonsters
	 *            the hardcoreMonsters to set
	 */
	public void setHardcoreMonsters(Integer hardcoreMonsters) {
		this.hardcoreMonsters = hardcoreMonsters;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Kills [monsters=" + monsters + ", elites=" + elites + ", hardcoreMonsters=" + hardcoreMonsters + "]";
	}

}
