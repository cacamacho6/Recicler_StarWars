package model;

public class Character {
    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;

    public Character(String name, String height, String mass, String hairColor, String skinColor, String eyecolor, String birth, String gender) {
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hair_color = hairColor;
        this.skin_color = skinColor;
        this.eye_color = eyecolor;
        this.birth_year = birth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHairColor() {
        return hair_color;
    }

    public void setHairColor(String hairColor) {
        this.hair_color = hairColor;
    }

    public String getSkinColor() {
        return skin_color;
    }

    public void setSkinColor(String skinColor) {
        this.skin_color = skinColor;
    }

    public String getEyecolor() {
        return eye_color;
    }

    public void setEyecolor(String eyecolor) {
        this.eye_color = eyecolor;
    }

    public String getBirth() {
        return birth_year;
    }

    public void setBirth(String birth) {
        this.birth_year = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
