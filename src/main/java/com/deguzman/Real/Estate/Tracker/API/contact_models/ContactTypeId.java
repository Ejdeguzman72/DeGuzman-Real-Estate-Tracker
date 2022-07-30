package com.deguzman.Real.Estate.Tracker.API.contact_models;

public class ContactTypeId {

	public int contactTypeId;
	public String descr;
	
	public int getContactTypeId() {
		return contactTypeId;
	}
	public void setContactTypeId(int contactTypeId) {
		this.contactTypeId = contactTypeId;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + contactTypeId;
		result = prime * result + ((descr == null) ? 0 : descr.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactTypeId other = (ContactTypeId) obj;
		if (contactTypeId != other.contactTypeId)
			return false;
		if (descr == null) {
			if (other.descr != null)
				return false;
		} else if (!descr.equals(other.descr))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ContactTypeId [contactTypeId=" + contactTypeId + ", descr=" + descr + "]";
	}
	public ContactTypeId(int contactTypeId, String descr) {
		super();
		this.contactTypeId = contactTypeId;
		this.descr = descr;
	}
	public ContactTypeId() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
