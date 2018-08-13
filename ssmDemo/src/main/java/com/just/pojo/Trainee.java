package com.just.pojo;

public class Trainee {
    private Long id;

    private String displayName;

    private String headImage;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage == null ? null : headImage.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", displayName='" + displayName + '\'' +
                ", headImage='" + headImage + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}