package org.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取配置文件内容
 * http://www.cnblogs.com/wavky/p/JAVA_Properties.html
 * @Author chenfei
 * @Date 2017年10月27日 下午1:42:13
 */
public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		InputStream is = PropertiesTest.class.getClassLoader().getResourceAsStream("config/data.properties");
		Properties p = new Properties();
		p.load(is);
		System.out.println(p.get("test1"));
		System.out.println(p.get("test2"));
		System.out.println(p.get("test3"));
		System.out.println(p.get("test4"));
	}
}
