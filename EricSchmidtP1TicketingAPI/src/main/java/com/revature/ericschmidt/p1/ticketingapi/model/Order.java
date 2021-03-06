package com.revature.ericschmidt.p1.ticketingapi.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@Column(name = "ORDERID")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ORDERID_SEQ")
	@SequenceGenerator(allocationSize = 1, name = "ORDERID_SEQ")
	private int ORDERID;
	private int ORDER_COST;

	// Constructor for the Order object below

	public Order() {
		// super();
	}

	/*
	 * public Order(int oRDERID, int oRDER_COST) { super(); ORDER_ID = oRDER_ID;
	 * ORDER_COST = oRDER_COST; }
	 */

	// Auto generated getters and setters

	public int getORDERID() {
		return ORDERID;
	}

	public void setORDERID(int oRDERID) {
		ORDERID = oRDERID;
	}

	public int getORDER_COST() {
		return ORDER_COST;
	}

	public void setORDER_COST(int oRDER_COST) {
		ORDER_COST = oRDER_COST;
	}

	// Autogenerated hashCode() method

	@Override
	public int hashCode() {
		return Objects.hash(ORDER_COST, ORDERID);
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
		Order other = (Order) obj;
		return ORDER_COST == other.ORDER_COST && ORDERID == other.ORDERID;
	}

	// Auto generated to-string method

	@Override
	public String toString() {
		return "Order [ORDERID=" + ORDERID + ", ORDER_COST=" + ORDER_COST + "]";
	}

}
