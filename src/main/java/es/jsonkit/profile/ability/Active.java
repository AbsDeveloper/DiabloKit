package es.jsonkit.profile.ability;

public class Active {

	private Skill skill;

	private Rune rune;

	public Active() {
	}

	/**
	 * @return the skill
	 */
	public Skill getSkill() {
		return skill;
	}

	/**
	 * @param skill
	 *            the skill to set
	 */
	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	/**
	 * @return the rune
	 */
	public Rune getRune() {
		return rune;
	}

	/**
	 * @param rune
	 *            the rune to set
	 */
	public void setRune(Rune rune) {
		this.rune = rune;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Active [skill=" + skill + ", rune=" + rune + "]";
	}

}
