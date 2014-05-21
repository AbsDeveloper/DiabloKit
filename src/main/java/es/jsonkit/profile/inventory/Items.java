package es.jsonkit.profile.inventory;

public class Items {

	private Head head;

	private Torso torso;

	private Feet feet;

	private Hands hands;

	private Shoulders shoulders;

	private Legs legs;

	private Bracers bracers;

	private MainHand mainHand;

	private OffHand offHand;

	private Waist waist;

	private RightFinger rightFinger;

	private LeftFinger leftFinger;

	private Neck neck;

	public Items() {
	}

	/**
	 * @return the head
	 */
	public Head getHead() {
		return this.head;
	}

	/**
	 * @param head
	 *            the head to set
	 */
	public void setHead(final Head head) {
		this.head = head;
	}

	/**
	 * @return the torso
	 */
	public Torso getTorso() {
		return this.torso;
	}

	/**
	 * @param torso
	 *            the torso to set
	 */
	public void setTorso(final Torso torso) {
		this.torso = torso;
	}

	/**
	 * @return the feet
	 */
	public Feet getFeet() {
		return this.feet;
	}

	/**
	 * @param feet
	 *            the feet to set
	 */
	public void setFeet(final Feet feet) {
		this.feet = feet;
	}

	/**
	 * @return the hands
	 */
	public Hands getHands() {
		return this.hands;
	}

	/**
	 * @param hands
	 *            the hands to set
	 */
	public void setHands(final Hands hands) {
		this.hands = hands;
	}

	/**
	 * @return the shoulders
	 */
	public Shoulders getShoulders() {
		return this.shoulders;
	}

	/**
	 * @param shoulders
	 *            the shoulders to set
	 */
	public void setShoulders(final Shoulders shoulders) {
		this.shoulders = shoulders;
	}

	/**
	 * @return the legs
	 */
	public Legs getLegs() {
		return this.legs;
	}

	/**
	 * @param legs
	 *            the legs to set
	 */
	public void setLegs(final Legs legs) {
		this.legs = legs;
	}

	/**
	 * @return the bracers
	 */
	public Bracers getBracers() {
		return this.bracers;
	}

	/**
	 * @param bracers
	 *            the bracers to set
	 */
	public void setBracers(final Bracers bracers) {
		this.bracers = bracers;
	}

	/**
	 * @return the mainHand
	 */
	public MainHand getMainHand() {
		return this.mainHand;
	}

	/**
	 * @param mainHand
	 *            the mainHand to set
	 */
	public void setMainHand(final MainHand mainHand) {
		this.mainHand = mainHand;
	}

	/**
	 * @return the offHand
	 */
	public OffHand getOffHand() {
		return this.offHand;
	}

	/**
	 * @param offHand
	 *            the offHand to set
	 */
	public void setOffHand(final OffHand offHand) {
		this.offHand = offHand;
	}

	/**
	 * @return the waist
	 */
	public Waist getWaist() {
		return this.waist;
	}

	/**
	 * @param waist
	 *            the waist to set
	 */
	public void setWaist(final Waist waist) {
		this.waist = waist;
	}

	/**
	 * @return the rightFinger
	 */
	public RightFinger getRightFinger() {
		return this.rightFinger;
	}

	/**
	 * @param rightFinger
	 *            the rightFinger to set
	 */
	public void setRightFinger(final RightFinger rightFinger) {
		this.rightFinger = rightFinger;
	}

	/**
	 * @return the leftFinger
	 */
	public LeftFinger getLeftFinger() {
		return this.leftFinger;
	}

	/**
	 * @param leftFinger
	 *            the leftFinger to set
	 */
	public void setLeftFinger(final LeftFinger leftFinger) {
		this.leftFinger = leftFinger;
	}

	/**
	 * @return the neck
	 */
	public Neck getNeck() {
		return this.neck;
	}

	/**
	 * @param neck
	 *            the neck to set
	 */
	public void setNeck(final Neck neck) {
		this.neck = neck;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Items [head=" + this.head + ", torso=" + this.torso + ", feet=" + this.feet + ", hands=" + this.hands + ", shoulders=" + this.shoulders + ", legs=" + this.legs
				+ ", bracers=" + this.bracers + ", mainHand=" + this.mainHand + ", offHand=" + this.offHand + ", waist=" + this.waist + ", rightFinger=" + this.rightFinger
				+ ", leftFinger=" + this.leftFinger + ", neck=" + this.neck + "]";
	}

}
