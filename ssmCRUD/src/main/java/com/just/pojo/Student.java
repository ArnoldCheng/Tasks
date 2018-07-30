package com.just.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//学生实体类
public class Student {
    private Long id;    //学生ID

    private String name; //姓名

    private String qq;  //ID

    private String types; //修真类型

    @DateTimeFormat(pattern = "yyyy-MM-dd") //表单中输入一定格式的字符串，转化后存储至数据库date字段
    private Date startDate; //预计入学时间

    private String school; //毕业院校

    private String studentId; //在线学号

    private String dailyLink; //日报链接

    private String wish; //立愿

    private String coach; //线上师兄

    private String knowFrom; //从哪里了解到修真院

    private Date createAt; //数据创建字段

    private Date updateAt;//数据更新字段

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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qq='" + qq + '\'' +
                ", types='" + types + '\'' +
                ", startDate=" + startDate +
                ", school='" + school + '\'' +
                ", studentId='" + studentId + '\'' +
                ", dailyLink='" + dailyLink + '\'' +
                ", wish='" + wish + '\'' +
                ", coach='" + coach + '\'' +
                ", knowFrom='" + knowFrom + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
