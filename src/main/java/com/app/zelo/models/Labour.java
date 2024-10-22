package com.app.zelo.models;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import org.springframework.context.annotation.Scope;

@Entity
public class Labour {

    String name;
    String category;
    String gender;
	int age;
    int experiance;
    @Id
    int labour_Id;
    
    public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getExperiance() {
        return experiance;
    }
    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }
    public int getLabour_Id() {
        return labour_Id;
    }
    public void setLabour_Id(int labour_Id) {
        this.labour_Id = labour_Id;
    }

}
