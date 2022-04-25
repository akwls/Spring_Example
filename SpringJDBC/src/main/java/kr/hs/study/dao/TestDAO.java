package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class TestDAO {
	
	@Autowired
	private JdbcTemplate db;
	
	// ���� ������ �ۼ��ϴ� ��
	
	// 1. insert
	public void insert_data(TestBean bean) {
		// container�� �ִ� TestBean�� ��ü�� bean�� �ڵ� ���Ե�.
		String sql = "insert into test values(?, ?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}
}
