/**
 * 
 */
package es.jsonkit.profile.ability;

import es.jsonkit.profile.Hero;

/**
 * @author Adrian
 * 
 */
public class HeroSkill extends Hero {

	public static final String END_OF_REQUEST = "";

	private Skills skills;

	public HeroSkill() {
		super();
	}

	public HeroSkill(final String battleTag, final Integer heroId) {
		super(battleTag, heroId);
	}

	/**
	 * @return the skills
	 */
	public Skills getSkills() {
		return this.skills;
	}

	/**
	 * @param skills
	 *            the skills to set
	 */
	public void setSkills(final Skills skills) {
		this.skills = skills;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HeroSkill [skills=" + this.skills + "]";
	}

	@Override
	public String generateUrl() {
		// TODO Auto-generated method stub
		return super.generateUrl();
	}
}
