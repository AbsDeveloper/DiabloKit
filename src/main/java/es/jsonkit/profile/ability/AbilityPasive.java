package es.jsonkit.profile.ability;

public class AbilityPasive {

	private Skill skill;

	public AbilityPasive() {
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
		return "AbilityPasive [skill=" + skill + "]";
	}
}
