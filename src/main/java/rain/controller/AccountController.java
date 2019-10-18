package rain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rain.pojo.Account;
import rain.service.AccountService;


/*
 *  kouch
 *  
 *  ����ǰ�˶�account������
 *  ���ú�̨�ṩ�Ķ�account�ķ���
 */

@Controller
public class AccountController {

	//ͨ��ע�͵ķ�ʽ  ��  �����࣬Ȼ�󹩱����еķ���ʹ��
	@Autowired
	private AccountService accountService;

	//@RequestMapping?
	//���� - ��ʼ�������������� - ����index���� - model��������
	@RequestMapping(value="/showdata", method=RequestMethod.GET)
	public String index(Model model){

		//System.out.println("�ɲ�����ֱ�ӷ���index.jsp�ǽ�������index������controller����jsp���Դ�ֵ��AccountController.java");
		List<Account> accounts = null;
		accounts =	 accountService.findAllAccount();

		System.out.println("find:"+accounts.get(0).getAccount());

		model.addAttribute("accounts",accounts);
		return "showdata";//�޷�������index.jsp �������ļ���·������
						  //ԭ��spring-mvc�����õ���ͼ���������ص�ҳ���ַ/WEB_INF/view/**

	}

}
