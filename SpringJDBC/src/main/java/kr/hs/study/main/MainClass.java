package kr.hs.study.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestDAO dao = ctx.getBean(TestDAO.class);
//		
//		TestBean t1 = ctx.getBean(TestBean.class);
//		t1.setData1(10);
//		t1.setData2("spring");
//		
//		dao.insert_data(t1);
//		
//		TestBean t2 = ctx.getBean(TestBean.class);
//		
//		t2.setData1(20);
//		t2.setData2("spring2");
//		
//		dao.insert_data(t2);
//		
//		System.out.println("inserted!!");
		
//		TestBean t3 = ctx.getBean(TestBean.class);
//		t3.setData1(10);
//		t3.setData2("spring1010");
//		dao.update_data(t3);
//		System.out.println("updated!!");
//		
//		dao.delete_data(20);
//		System.out.println("deleted!!");
		
		List<TestBean> list = dao.select_data();
		for(TestBean data : list) {
			System.out.println("data1 : " + data.getData1());
			System.out.println("data2 : " + data.getData2());
		}
		
		ctx.close();

	}

}
