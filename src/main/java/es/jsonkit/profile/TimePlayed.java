package es.jsonkit.profile;

import com.google.gson.annotations.SerializedName;

/**
 * @author Adrian
 * 
 */
public class TimePlayed {

	private Double barbarian;

	private Double crusader;
	@SerializedName("demon-hunter")
	private Double demonHunter;

	private Double monk;

	@SerializedName("witch-doctor")
	private Double witchDoctor;

	private Double wizard;

	/**
	 * @return the barbarian
	 */
	public Double getBarbarian() {
		return barbarian;
	}

	/**
	 * @param barbarian
	 *            the barbarian to set
	 */
	public void setBarbarian(Double barbarian) {
		this.barbarian = barbarian;
	}

	/**
	 * @return the crusader
	 */
	public Double getCrusader() {
		return crusader;
	}

	/**
	 * @param crusader
	 *            the crusader to set
	 */
	public void setCrusader(Double crusader) {
		this.crusader = crusader;
	}

	/**
	 * @return the monk
	 */
	public Double getMonk() {
		return monk;
	}

	/**
	 * @param monk
	 *            the monk to set
	 */
	public void setMonk(Double monk) {
		this.monk = monk;
	}

	/**
	 * @return the wizard
	 */
	public Double getWizard() {
		return wizard;
	}

	/**
	 * @param wizard
	 *            the wizard to set
	 */
	public void setWizard(Double wizard) {
		this.wizard = wizard;
	}

	/**
	 * @return the demonHunter
	 */
	public Double getDemonHunter() {
		return demonHunter;
	}

	/**
	 * @param demonHunter
	 *            the demonHunter to set
	 */
	public void setDemonHunter(Double demonHunter) {
		this.demonHunter = demonHunter;
	}

	/**
	 * @return the witchDoctor
	 */
	public Double getWitchDoctor() {
		return witchDoctor;
	}

	/**
	 * @param witchDoctor
	 *            the witchDoctor to set
	 */
	public void setWitchDoctor(Double witchDoctor) {
		this.witchDoctor = witchDoctor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TimePlayed [barbarian=" + barbarian + ", crusader=" + crusader + ", demon_hunter=" + demonHunter + ", monk=" + monk + ", witch_doctor=" + witchDoctor + ", wizard="
				+ wizard + "]";
	}

}
