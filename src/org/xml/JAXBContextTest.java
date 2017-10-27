package org.xml;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * 对象转换成XML格式/XML转换成对象
 * 关键注解:@XmlRootElement
 * @Author chenfei
 * @Date 2017年10月26日 下午4:35:59
 */
public class JAXBContextTest {
public static void main(String[] args) throws JAXBException {
	JAXBContext jc = JAXBContext.newInstance(XMLTest.class);  
    Marshaller ms = jc.createMarshaller();  
    XMLTest st = new XMLTest();  
    st.setMailContent("邮件内容");  
    st.setMailSubject("邮件主题");  
    st.setMailTo("给袁义锐");  
    StringWriter writer = new StringWriter();  
    ms.marshal(st, writer);  
    String result = writer.toString();  
    System.out.println("对象转XML字符串： "+ result +"\n");  
    System.out.println("---------------------------------------- \n");  
    Unmarshaller unmarshaller = jc.createUnmarshaller();  
    XMLTest _XMLTest = (XMLTest) unmarshaller  
            .unmarshal(new StringReader(result));  
      
    System.out.println("翻转XML为对象："+_XMLTest.getMailContent()); 
}
}
