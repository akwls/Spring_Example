package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.User;

@Component
public class UserDAO {
	
	@Autowired
	private JdbcTemplate db;

	public void insert(User user) {
		String sql = "insert into user_table values(?, ?, ?)";
		db.update(sql, user.getUserid(), user.getUserpass(), user.getUsername());
	}
}
