package com.scienjus.domain;

import com.scienjus.mrc.annotation.Counter;
import com.scienjus.mrc.annotation.Field;
import com.scienjus.mrc.annotation.Id;

import lombok.Data;

/**
 * @author xieenlong
 * @date 16/2/7.
 */
@Counter(name = "Post", expire = 3)
@Data
public class Post {

	@Id
	private String id;

	private String title;

	@Field(name = "views", realtime = true)
	private long viewCount;

	@Field
	private double score;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getViewCount() {
		return viewCount;
	}

	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public int incrViewCount() {
		return 0;
	}

	public int decrViewCount() {
		return 0;
	}

	public int incrViewCount(int increment) {
		return 0;
	}

	public int decrViewCount(int decrement) {
		return 0;
	}

	public double incrScore() {
		return 0D;
	}

	public double decrScore() {
		return 0D;
	}

	public double incrScore(double incrment) {
		return 0D;
	}

	public double decrScore(double decrement) {
		return 0D;
	}
}
