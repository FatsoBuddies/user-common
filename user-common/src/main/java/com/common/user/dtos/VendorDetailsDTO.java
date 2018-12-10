package com.common.user.dtos;

import java.io.Serializable;

public class VendorDetailsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5162209690921429382L;
	
	private String vendorID;
	private String vendorName;
	private String vendorAddress;
	private String vendorContactNumber;
	public String getVendorID() {
		return vendorID;
	}
	public void setVendorID(String vendorID) {
		this.vendorID = vendorID;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	public String getVendorContactNumber() {
		return vendorContactNumber;
	}
	public void setVendorContactNumber(String vendorContactNumber) {
		this.vendorContactNumber = vendorContactNumber;
	}
	
	 
}
