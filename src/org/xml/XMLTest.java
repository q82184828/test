package org.xml;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author chenfei
 * @date 2017年10月26日 下午5:45:02
 */
@XmlRootElement(name = "XMLTest")
public class XMLTest {
	private String mailTo;  
    private String mailSubject;  
    private String mailContent;
	public String getMailTo() {
		return mailTo;
	}
	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}
	public String getMailSubject() {
		return mailSubject;
	}
	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}
	public String getMailContent() {
		return mailContent;
	}
	public void setMailContent(String mailContent) {
		this.mailContent = mailContent;
	}
    
}
