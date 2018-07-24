package com.just.pojo;

public class Student {
    private Long id;

    private String name;

    private String qq;

    private String types;

    private Long startDate;

    private String school;

    private String studentId;

    private String dailyLink;

    private String wish;

    private String coach;

    private String knowFrom;

    private Long createAt;

    private Long updateAt;

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
        this.name = name == null ? null : name.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types == null ? null : types.trim();
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getDailyLink() {
        return dailyLink;
    }

    public void setDailyLink(String dailyLink) {
        this.dailyLink = dailyLink == null ? null : dailyLink.trim();
    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish == null ? null : wish.trim();
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach == null ? null : coach.trim();
    }

    public String getKnowFrom() {
        return knowFrom;
    }

    public void setKnowFrom(String knowFrom) {
        this.knowFrom = knowFrom == null ? null : knowFrom.trim();
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", qq=" + qq + ", types=" + types + ", startDate=" + startDate
				+ ", school=" + school + ", studentId=" + studentId + ", dailyLink=" + dailyLink + ", wish=" + wish
				+ ", coach=" + coach + ", knowFrom=" + knowFrom + ", createAt=" + createAt + ", updateAt=" + updateAt
				+ "]";
	}
    
    
}