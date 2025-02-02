package com.tap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_Details")
public class StudentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sdid")
	private int sdid;
	@Column(name="email")
	private String email;
	@Column(name="mobile")
	private String mobile;
	@Column(name="percentage")
	private float percentage;
	public StudentDetails(String email, String mobile, float percentage) {
		super();
	//	this.sdid = sdid; auto incremented value
		this.email = email;
		this.mobile = mobile;
		this.percentage = percentage;
	}
	public StudentDetails() {
		super();
	}
	/**
	 * @return the sdid
	 */
	public int getSdid() {
		return sdid;
	}
	/**
	 * @param sdid the sdid to set
	 */
	public void setSdid(int sdid) {
		this.sdid = sdid;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the percentage
	 */
	public float getPercentage() {
		return percentage;
	}
	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "StudentDetails [sdid=" + sdid + ", email=" + email + ", mobile=" + mobile + ", percentage=" + percentage
				+ "]";
	}

	

}
