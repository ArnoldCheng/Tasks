package com.just.pojo;

public class Occupation {
    private Integer id;

    private String classification;

    private String name;

    private String description;

    private String threshold;

    private String difficulty;

    private String cycle;

    private Integer scarcity;

    private String salary1;

    private String salary2;

    private String salary3;

    private Integer learner;

    private String foundation;

    private String flipTitle;

    private String flipText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification == null ? null : classification.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getThreshold() {
        return threshold;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold == null ? null : threshold.trim();
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty == null ? null : difficulty.trim();
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle == null ? null : cycle.trim();
    }

    public Integer getScarcity() {
        return scarcity;
    }

    public void setScarcity(Integer scarcity) {
        this.scarcity = scarcity;
    }

    public String getSalary1() {
        return salary1;
    }

    public void setSalary1(String salary1) {
        this.salary1 = salary1 == null ? null : salary1.trim();
    }

    public String getSalary2() {
        return salary2;
    }

    public void setSalary2(String salary2) {
        this.salary2 = salary2 == null ? null : salary2.trim();
    }

    public String getSalary3() {
        return salary3;
    }

    public void setSalary3(String salary3) {
        this.salary3 = salary3 == null ? null : salary3.trim();
    }

    public Integer getLearner() {
        return learner;
    }

    public void setLearner(Integer learner) {
        this.learner = learner;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation == null ? null : foundation.trim();
    }

    public String getFlipTitle() {
        return flipTitle;
    }

    public void setFlipTitle(String flipTitle) {
        this.flipTitle = flipTitle == null ? null : flipTitle.trim();
    }

    public String getFlipText() {
        return flipText;
    }

    public void setFlipText(String flipText) {
        this.flipText = flipText == null ? null : flipText.trim();
    }
}