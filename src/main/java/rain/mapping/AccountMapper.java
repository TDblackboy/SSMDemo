package rain.mapping;

import java.util.List;

import rain.pojo.Account;


/*
 * @Kouch
 * 
 * Dao��ӿڣ����ݿ��� Account ��ɾ�Ĳ飻
 * 
 * Dao�㣺�������ݿ�
 * 
  *   ����ʵ�֣�
  *   	xml�����ļ�����sql��� 
  *   	��ص�mapper.xml�����ļ� - ��mybatis.xml�����ļ�������
 * 
 */
public interface AccountMapper {

	//��
	public List<Account> findAllAccount();


}
