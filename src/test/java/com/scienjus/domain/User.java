package com.scienjus.domain;

import com.scienjus.mrc.annotation.Counter;
import com.scienjus.mrc.annotation.Field;
import com.scienjus.mrc.annotation.Id;

import lombok.Data;

/**
 * @author ScienJus
 * @date 16/2/7.
 */
@Data
@Counter
public class User {

	@Id
	private Integer id;

	private String name;

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

	public int getFollowerCount() {
		return followerCount;
	}

	public void setFollowerCount(int followerCount) {
		this.followerCount = followerCount;
	}

	@Field
	private int followerCount;

	public int incrFollowerCount() {
		return 0;
	}

	public int decrFollowerCount() {
		return 0;
	}

}
