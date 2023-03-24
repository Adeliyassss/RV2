package com.example.rv2.recycler;

import java.io.Serializable;

public class Car implements Serializable {

	String name;
	String description;
	int image;

	public Car(
			String name,
			String description,
			int image
	) {
		this.name = name;
		this.description = description;
		this.image = image;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getImage() {
		return this.image;
	}

	public void setImage(int image) {
		this.image = image;
	}
}
