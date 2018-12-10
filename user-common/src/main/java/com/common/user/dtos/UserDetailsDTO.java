package com.common.user.dtos;

import java.io.Serializable;

public class UserDetailsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3800090249568832530L;
	private String userID;
	private String userName;
	private String firstName;
	private String lastName;
	private String preferredName;
	private String emailAddress;
	private String contactNumber;
	private OrganizationDetailsDTO employerOrganisationDetails;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPreferredName() {
		return preferredName;
	}
	public void setPreferredName(String preferredName) {
		this.preferredName = preferredName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public OrganizationDetailsDTO getEmployerOrganisationDetails() {
		return employerOrganisationDetails;
	}
	public void setEmployerOrganisationDetails(OrganizationDetailsDTO employerOrganisationDetails) {
		this.employerOrganisationDetails = employerOrganisationDetails;
	}
	
	
}
