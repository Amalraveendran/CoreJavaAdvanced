package com.study.chapter.four.project;

public class Employee {
    String name;
    int experienceYears;
    MesozoicEdenTaskManager.Role role;

    public Employee(String name, int experienceYears, MesozoicEdenTaskManager.Role role) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.role = role;
    }

    public MesozoicEdenTaskManager.Role getRole() {
        return role;
    }

    public void setRole(MesozoicEdenTaskManager.Role role) {
        this.role = role;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
