package rain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rain.service.TestService;

/*
 * kouch
 * 
 * ���� SSM controller���óɹ�
 *      success����ת��test.jsp
 */

@Controller
public class TestController {
    
	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){
		//ʵ�ʷ��ص���views/test.jsp ,spring-mvc.xml�����ù�ǰ��׺
		System.out.println("��������̨���������");
        return "test";
    }
	
	@RequestMapping(value = "springtest", method = RequestMethod.GET)
	public String springTest() {
		return testService.test();
		
	}
}
