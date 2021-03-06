package kr.hs.study.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class TestDAO {
	
	@Autowired
	private JdbcTemplate db;
	
	@Autowired
	private MapperClass mapper;
	
	// 실제 쿼리를 작성하는 곳
	
	// 1. insert
	public void insert_data(TestBean bean) {
		// container에 있는 TestBean의 객체가 bean에 자동 주입됨.
		String sql = "insert into test values(?, ?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}
	
	public void update_data(TestBean bean) {
		String sql = "update test set data2 = ? where data1 = ?";
		db.update(sql, bean.getData2(), bean.getData1());
	}
	
	public void delete_data(int data1) {
		String sql = "delete from test where data1 = ?";
		db.update(sql, data1);
	}
	
	public List<TestBean> select_data() {
		String sql = "select * from test";
		List<TestBean> result = db.query(sql, mapper);
		return result;
	}
}
