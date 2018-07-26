package com.just.demo.entity;

import java.util.Date;

public class Student {

	private Long id;

    private String name;

    private String qq;

    private String types;

    private Date startDate;

    private String school;

    private String studentId;

    private String dailyLink;

    private String wish;

    private String coach;

    private String knowFrom;

    private Date createAt;

    private Date updateAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getDailyLink() {
		return dailyLink;
	}

	public void setDailyLink(String dailyLink) {
		this.dailyLink = dailyLink;
	}

	public String getWish() {
		return wish;
	}

	public void setWish(String wish) {
		this.wish = wish;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public String getKnowFrom() {
		return knowFrom;
	}

	public void setKnowFrom(String knowFrom) {
		this.knowFrom = knowFrom;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", qq=" + qq + ", types=" + types + ", school=" + school
				+ ", studentId=" + studentId + ", dailyLink=" + dailyLink + ", wish=" + wish + ", coach=" + coach
				+ ", knowFrom=" + knowFrom + "]";
	}

}
