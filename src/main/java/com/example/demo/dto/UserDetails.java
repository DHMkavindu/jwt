package com.example.demo.dto;

import java.sql.Date;

public class UserDetails {

	private String userid;

	private String sbu_code;

	private String loc_code;

	private String title;

	private String sex;

	private String nic;

	private String passport;

	private String email;

	private String tel_no;

	private String mobile_no;

	private char sys_alow;

	private Date cre_date;

	private String cre_by;

	private Date mod_date;

	private String mod_by;

	private Date last_log;

	private char active;

	public UserDetails() {
		// TODO Auto-generated constructor stub
	}

	public UserDetails(String userid, String sbu_code, String loc_code, String title, String sex, String nic,
			String passport, String email, String tel_no, String mobile_no, char sys_alow, Date cre_date, String cre_by,
			Date mod_date, String mod_by, Date last_log, char active) {
		super();
		this.userid = userid;
		this.sbu_code = sbu_code;
		this.loc_code = loc_code;
		this.title = title;
		this.sex = sex;
		this.nic = nic;
		this.passport = passport;
		this.email = email;
		this.tel_no = tel_no;
		this.mobile_no = mobile_no;
		this.sys_alow = sys_alow;
		this.cre_date = cre_date;
		this.cre_by = cre_by;
		this.mod_date = mod_date;
		this.mod_by = mod_by;
		this.last_log = last_log;
		this.active = active;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getSbu_code() {
		return sbu_code;
	}

	public void setSbu_code(String sbu_code) {
		this.sbu_code = sbu_code;
	}

	public String getLoc_code() {
		return loc_code;
	}

	public void setLoc_code(String loc_code) {
		this.loc_code = loc_code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel_no() {
		return tel_no;
	}

	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public char getSys_alow() {
		return sys_alow;
	}

	public void setSys_alow(char sys_alow) {
		this.sys_alow = sys_alow;
	}

	public Date getCre_date() {
		return cre_date;
	}

	public void setCre_date(Date cre_date) {
		this.cre_date = cre_date;
	}

	public String getCre_by() {
		return cre_by;
	}

	public void setCre_by(String cre_by) {
		this.cre_by = cre_by;
	}

	public Date getMod_date() {
		return mod_date;
	}

	public void setMod_date(Date mod_date) {
		this.mod_date = mod_date;
	}

	public String getMod_by() {
		return mod_by;
	}

	public void setMod_by(String mod_by) {
		this.mod_by = mod_by;
	}

	public Date getLast_log() {
		return last_log;
	}

	public void setLast_log(Date last_log) {
		this.last_log = last_log;
	}

	public char getActive() {
		return active;
	}

	public void setActive(char active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "UserDetails [userid=" + userid + ", sbu_code=" + sbu_code + ", loc_code=" + loc_code + ", title="
				+ title + ", sex=" + sex + ", nic=" + nic + ", passport=" + passport + ", email=" + email + ", tel_no="
				+ tel_no + ", mobile_no=" + mobile_no + ", sys_alow=" + sys_alow + ", cre_date=" + cre_date
				+ ", cre_by=" + cre_by + ", mod_date=" + mod_date + ", mod_by=" + mod_by + ", last_log=" + last_log
				+ ", active=" + active + "]";
	}

}
