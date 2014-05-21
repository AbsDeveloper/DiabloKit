/**
 * 
 */
package es.jsonkit.profile.ability;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adrian
 * 
 */
public class Skills {

	private List<AbilityActive> active;

	private List<AbilityPasive> passive;

	public Skills() {
		this.active = new ArrayList<AbilityActive>();
		this.passive = new ArrayList<AbilityPasive>();

	}

	/**
	 * @return the active
	 */
	public List<AbilityActive> getActive() {
		return this.active;
	}

	/**
	 * @return the passive
	 */
	public List<AbilityPasive> getPassive() {
		return this.passive;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Skills [active=" + this.active + ", passive=" + this.passive + "]";
	}

}
