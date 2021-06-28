package com.darkside.studio.movies;

public class Actor {
	
	String name = "";
	Integer age = 0;
	Reward[] rewards;
	
	public Actor(String name, Integer age, Reward[] rewards) {
		this.name = name;
		this.age = age;
		this.rewards = rewards;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Reward[] getRewards() {
		return rewards;
	}

	public void setRewards(Reward[] rewards) {
		this.rewards = rewards;
	}
	
}
