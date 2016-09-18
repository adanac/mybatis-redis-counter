package com.scienjus.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.scienjus.domain.Post;

/**
 * @author ScienJus
 * @date 16/2/7.
 */
public interface PostMapper {

	@Select("select * from post where id = #{id}")
	Post get(String id);

	@Insert("insert into post(id, title, view_count, score) values(#{id}, #{title}, #{viewCount}, #{score})")
	void insert(Post post);

	@Delete("delete from post")
	void delAll();

}
