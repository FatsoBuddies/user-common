/**
 * 
 */
package com.common.user.dtos;

import java.io.Serializable;
import java.util.List;

/**
 * @author Rwik
 *
 */
public class OrganizationDetailsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4746559555771311159L;
	
	/*
	 * Attributes
	 */
	private String organizationName;
	private String organizationID;
	private String organisationAddress;
	private List<OrganizationVendorDetailsDTO> organizationVendorDetailsList;
	
	/*
	 * accessors
	 */
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getOrganizationID() {
		return organizationID;
	}
	public void setOrganizationID(String organizationID) {
		this.organizationID = organizationID;
	}
	public String getOrganisationAddress() {
		return organisationAddress;
	}
	public void setOrganisationAddress(String organisationAddress) {
		this.organisationAddress = organisationAddress;
	}
	public List<OrganizationVendorDetailsDTO> getOrganizationVendorDetailsList() {
		return organizationVendorDetailsList;
	}
	public void setOrganizationVendorDetailsList(List<OrganizationVendorDetailsDTO> organizationVendorDetailsList) {
		this.organizationVendorDetailsList = organizationVendorDetailsList;
	}
	
	
	
}
