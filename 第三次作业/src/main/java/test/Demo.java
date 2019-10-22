package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import service.Service;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo {

	@Autowired
	private Service service;

	@Test
	public void test() {
		service.insert();
	}

	@Test
	public void test2() {
		service.delete();
	}

	@Test
	public void test3() {
		service.update();
	}

	@Test
	public void test4() {
		service.find();

	}
}
