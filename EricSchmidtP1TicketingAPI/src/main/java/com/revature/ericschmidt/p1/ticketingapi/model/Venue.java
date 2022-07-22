package com.revature.ericschmidt.p1.ticketingapi.model;

import java.util.Objects;

public class Venue {

	private int VENUEID;
	private String VENUE_NAME = new String();
	private String VENUE_ADDRESS = new String();
	private int VENUE_ZIP;
	private int VENUE_CAPACITY;

	// Constructor for the Venue object below

	public Venue() {
		// super();
	}

	/*
	 * public Venue(int vENUEID, String vENUE_NAME, String vENUE_ADDRESS, int
	 * vENUE_ZIP, int vENUE_CAPACITY) { super(); VENUE_ID = vENUE_ID; VENUE_NAME =
	 * vENUE_NAME; VENUE_ADDRESS = vENUE_ADDRESS; VENUE_ZIP = vENUE_ZIP;
	 * VENUE_CAPACITY = vENUE_CAPACITY; }
	 */

	// Auto generated getters and setters

	public int getVENUEID() {
		return VENUEID;
	}

	public void setVENUE_ID(int vENUEID) {
		VENUEID = vENUEID;
	}

	public String getVENUE_NAME() {
		return VENUE_NAME;
	}

	public void setVENUE_NAME(String vENUE_NAME) {
		VENUE_NAME = vENUE_NAME;
	}

	public String getVENUE_ADDRESS() {
		return VENUE_ADDRESS;
	}

	public void setVENUE_ADDRESS(String vENUE_ADDRESS) {
		VENUE_ADDRESS = vENUE_ADDRESS;
	}

	public int getVENUE_ZIP() {
		return VENUE_ZIP;
	}

	public void setVENUE_ZIP(int vENUE_ZIP) {
		VENUE_ZIP = vENUE_ZIP;
	}

	public int getVENUE_CAPACITY() {
		return VENUE_CAPACITY;
	}

	public void setVENUE_CAPACITY(int vENUE_CAPACITY) {
		VENUE_CAPACITY = vENUE_CAPACITY;
	}

	// Autogenerated hashCode() method

	@Override
	public int hashCode() {
		return Objects.hash(VENUE_ADDRESS, VENUE_CAPACITY, VENUEID, VENUE_NAME, VENUE_ZIP);
	}

	// Autogenerated toEquals() method

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venue other = (Venue) obj;
		return Objects.equals(VENUE_ADDRESS, other.VENUE_ADDRESS) && VENUE_CAPACITY == other.VENUE_CAPACITY
				&& VENUEID == other.VENUEID && Objects.equals(VENUE_NAME, other.VENUE_NAME)
				&& VENUE_ZIP == other.VENUE_ZIP;
	}

	// Auto generated to-string method

	@Override
	public String toString() {
		return "Venue [VENUEID=" + VENUEID + ", VENUE_NAME=" + VENUE_NAME + ", VENUE_ADDRESS=" + VENUE_ADDRESS
				+ ", VENUE_ZIP=" + VENUE_ZIP + ", VENUE_CAPACITY=" + VENUE_CAPACITY + "]";
	}

}
