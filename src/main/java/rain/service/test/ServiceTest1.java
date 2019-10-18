package rain.service.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import rain.pojo.Account;
import rain.service.AccountService;

/**
 * kouch
 *  
 *  ���ܣ�����SSM��̨�����Ƿ���Է��� �� ��������Ƿ�ɹ�
 *    
 *  ע������spring��junit���ϣ�junit����ʱ����springIOC���� spring-test,junit
 *  
 */

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration({ "classpath:/config/applicationContext.xml"})//����junit spring�����ļ�
public class ServiceTest1 {
	
	@Autowired
	public AccountService accountService;
	
	
	@Test
	public void getAccountsFromDataBase() {
		List<Account> ac=accountService.findAllAccount();
		System.out.println("���أ�"+ac.get(0).getAccount());
	}
	
//	public void main(String[] args) {
//		ApplicationContext application=new ClassPathXmlApplicationContext("applicationContext.xml");
//		AccountService accountService=(AccountService)application.getBean("accountService");
//		List<Account> ac=accountService.findAllAccount();
//		System.out.println("���أ�"+ac.get(0));
//	}
	
}
