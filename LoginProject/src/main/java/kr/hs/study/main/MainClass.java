package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import kr.hs.study.beans.User;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.UserDAO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		UserDAO dao = ctx.getBean(UserDAO.class);
		
		User u1 = ctx.getBean(User.class);
		u1.setUserid("kim");
		u1.setUserpass("1111");
		u1.setUsername("김다리");
		dao.insert(u1);
		
		User u2 = ctx.getBean(User.class);
		u2.setUserid("lee");
		u2.setUserpass("2222");
		u2.setUsername("이로니");
		dao.insert(u2);
		
		User u3 = ctx.getBean(User.class);
		u3.setUserid("park");
		u3.setUserpass("3333");
		u3.setUsername("박로니");
		dao.insert(u3);
		
		System.out.println("insert completed");
		
		ctx.close();
	}

}
