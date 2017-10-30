package org.publicmethod;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
 * PostConstruct注解可在构造器构造完成后调用注解的方法进行其他初始化步骤,如使用dictService里的某些方法
 * @Author chenfei
 * @Date 2017年10月30日 下午12:20:27
 */
@Service
public class TestPostConstruct {
	@Resource
	private DictService dictService;
	private static TestPostConstruct test;
	
	public TestPostConstruct() {
		System.out.println("初始化");
		test = this;
	}
//	@PostConstruct
//	public void init() {
//		test = this;
//	}
	
	public static String te() {
		return test.dictService.test();
	}
}
