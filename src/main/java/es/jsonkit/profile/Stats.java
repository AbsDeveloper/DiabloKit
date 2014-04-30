package es.jsonkit.profile;

public class Stats {

	private Integer life;

	private Double damage;

	private Integer armor;

	private Integer strength;

	private Integer dexterity;

	private Integer vitality;

	private Integer intelligence;

	private Integer physicalResist;

	private Integer fireResist;

	private Integer coldResist;

	private Integer lightningResist;

	private Integer poisonResist;

	private Integer arcaneResist;

	private Double damageIncrease;

	private Double critChance;

	private Double damageReduction;

	/**
	 * @return the life
	 */
	public Integer getLife() {
		return life;
	}

	/**
	 * @param life
	 *            the life to set
	 */
	public void setLife(Integer life) {
		this.life = life;
	}

	/**
	 * @return the damage
	 */
	public Double getDamage() {
		return damage;
	}

	/**
	 * @param damage
	 *            the damage to set
	 */
	public void setDamage(Double damage) {
		this.damage = damage;
	}

	/**
	 * @return the armor
	 */
	public Integer getArmor() {
		return armor;
	}

	/**
	 * @param armor
	 *            the armor to set
	 */
	public void setArmor(Integer armor) {
		this.armor = armor;
	}

	/**
	 * @return the strength
	 */
	public Integer getStrength() {
		return strength;
	}

	/**
	 * @param strength
	 *            the strength to set
	 */
	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	/**
	 * @return the dexterity
	 */
	public Integer getDexterity() {
		return dexterity;
	}

	/**
	 * @param dexterity
	 *            the dexterity to set
	 */
	public void setDexterity(Integer dexterity) {
		this.dexterity = dexterity;
	}

	/**
	 * @return the vitality
	 */
	public Integer getVitality() {
		return vitality;
	}

	/**
	 * @param vitality
	 *            the vitality to set
	 */
	public void setVitality(Integer vitality) {
		this.vitality = vitality;
	}

	/**
	 * @return the intelligence
	 */
	public Integer getIntelligence() {
		return intelligence;
	}

	/**
	 * @param intelligence
	 *            the intelligence to set
	 */
	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	/**
	 * @return the physicalResist
	 */
	public Integer getPhysicalResist() {
		return physicalResist;
	}

	/**
	 * @param physicalResist
	 *            the physicalResist to set
	 */
	public void setPhysicalResist(Integer physicalResist) {
		this.physicalResist = physicalResist;
	}

	/**
	 * @return the fireResist
	 */
	public Integer getFireResist() {
		return fireResist;
	}

	/**
	 * @param fireResist
	 *            the fireResist to set
	 */
	public void setFireResist(Integer fireResist) {
		this.fireResist = fireResist;
	}

	/**
	 * @return the coldResist
	 */
	public Integer getColdResist() {
		return coldResist;
	}

	/**
	 * @param coldResist
	 *            the coldResist to set
	 */
	public void setColdResist(Integer coldResist) {
		this.coldResist = coldResist;
	}

	/**
	 * @return the lightningResist
	 */
	public Integer getLightningResist() {
		return lightningResist;
	}

	/**
	 * @param lightningResist
	 *            the lightningResist to set
	 */
	public void setLightningResist(Integer lightningResist) {
		this.lightningResist = lightningResist;
	}

	/**
	 * @return the poisonResist
	 */
	public Integer getPoisonResist() {
		return poisonResist;
	}

	/**
	 * @param poisonResist
	 *            the poisonResist to set
	 */
	public void setPoisonResist(Integer poisonResist) {
		this.poisonResist = poisonResist;
	}

	/**
	 * @return the arcaneResist
	 */
	public Integer getArcaneResist() {
		return arcaneResist;
	}

	/**
	 * @param arcaneResist
	 *            the arcaneResist to set
	 */
	public void setArcaneResist(Integer arcaneResist) {
		this.arcaneResist = arcaneResist;
	}

	/**
	 * @return the damageIncrease
	 */
	public Double getDamageIncrease() {
		return damageIncrease;
	}

	/**
	 * @param damageIncrease
	 *            the damageIncrease to set
	 */
	public void setDamageIncrease(Double damageIncrease) {
		this.damageIncrease = damageIncrease;
	}

	/**
	 * @return the critChance
	 */
	public Double getCritChance() {
		return critChance;
	}

	/**
	 * @param critChance
	 *            the critChance to set
	 */
	public void setCritChance(Double critChance) {
		this.critChance = critChance;
	}

	/**
	 * @return the damageReduction
	 */
	public Double getDamageReduction() {
		return damageReduction;
	}

	/**
	 * @param damageReduction
	 *            the damageReduction to set
	 */
	public void setDamageReduction(Double damageReduction) {
		this.damageReduction = damageReduction;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Stats [life=" + life + ", damage=" + damage + ", armor=" + armor + ", strength=" + strength + ", dexterity=" + dexterity + ", vitality=" + vitality
				+ ", intelligence=" + intelligence + ", physicalResist=" + physicalResist + ", fireResist=" + fireResist + ", coldResist=" + coldResist + ", lightningResist="
				+ lightningResist + ", poisonResist=" + poisonResist + ", arcaneResist=" + arcaneResist + ", damageIncrease=" + damageIncrease + ", critChance=" + critChance
				+ ", damageReduction=" + damageReduction + "]";
	}

}
