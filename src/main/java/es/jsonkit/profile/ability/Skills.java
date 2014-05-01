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

	private final List<AbilityActive> active;

	private final List<AbilityPasive> passive;

	public Skills() {
		this.active = new ArrayList<AbilityActive>();
		this.passive = new ArrayList<AbilityPasive>();

	}

	/**
	 * @return the active
	 */
	public List<AbilityActive> getActive() {
		return active;
	}

	/**
	 * @return the passive
	 */
	public List<AbilityPasive> getPassive() {
		return passive;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Skills [active=" + active + ", passive=" + passive + "]";
	}

}
