package com.udayansoft.coderbd.hackerearth.pojo;

/**
 * Created by Biswajit Debnath on 26-Sep-16.
 */

public class Contest {
    private Integer id;
    private String name;
    private String image;
    private String category;
    private String description;
    private String experience;

    public Contest(){

    }

    public Contest(Integer id, String name, String image, String category, String description, String experience) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.category = category;
        this.description = description;
        this.experience = experience;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Contest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}
