package es.jsonkit.profile.ability;

public class Passive {

	private Skill skill;

	public Passive() {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Passive [skill=" + skill + "]";
	}

}
