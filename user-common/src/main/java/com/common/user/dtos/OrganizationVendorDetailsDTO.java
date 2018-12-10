package com.common.user.dtos;

import java.io.Serializable;

public class OrganizationVendorDetailsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6733587404466932794L;
	
	/*
	 * Attributes
	 */
	private String organizationVendorID;
	private  OrganizationDetailsDTO organizationDetailsDTO;
	private VendorDetailsDTO vendorDetailsDTO;
	private String organizaionVendorBuildingID;
	private String organizationVendorFCNumber;
	public String getOrganizationVendorID() {
		return organizationVendorID;
	}
	public void setOrganizationVendorID(String organizationVendorID) {
		this.organizationVendorID = organizationVendorID;
	}
	public OrganizationDetailsDTO getOrganizationDetailsDTO() {
		return organizationDetailsDTO;
	}
	public void setOrganizationDetailsDTO(OrganizationDetailsDTO organizationDetailsDTO) {
		this.organizationDetailsDTO = organizationDetailsDTO;
	}
	public VendorDetailsDTO getVendorDetailsDTO() {
		return vendorDetailsDTO;
	}
	public void setVendorDetailsDTO(VendorDetailsDTO vendorDetailsDTO) {
		this.vendorDetailsDTO = vendorDetailsDTO;
	}
	public String getOrganizaionVendorBuildingID() {
		return organizaionVendorBuildingID;
	}
	public void setOrganizaionVendorBuildingID(String organizaionVendorBuildingID) {
		this.organizaionVendorBuildingID = organizaionVendorBuildingID;
	}
	public String getOrganizationVendorFCNumber() {
		return organizationVendorFCNumber;
	}
	public void setOrganizationVendorFCNumber(String organizationVendorFCNumber) {
		this.organizationVendorFCNumber = organizationVendorFCNumber;
	}
	
	
}
