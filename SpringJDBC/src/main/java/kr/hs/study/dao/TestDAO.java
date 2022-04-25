package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class TestDAO {
	
	@Autowired
	private JdbcTemplate db;
	
	// 실제 쿼리를 작성하는 곳
	
	// 1. insert
	public void insert_data(TestBean bean) {
		// container에 있는 TestBean의 객체가 bean에 자동 주입됨.
		String sql = "insert into test values(?, ?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}
}
