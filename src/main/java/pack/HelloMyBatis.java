package pack;

import org.omg.CORBA.portable.InputStream;

public class HelloMyBatis {

	public static void main(String[] args) {
		//���������ļ���Ŀ¼��ְ
		String resource="conf.xml";
		//����Ӧ�������ļ�
		InputStream is=(InputStream) HelloMyBatis.class.getClassLoader().getResourceAsStream(resource);
		//����SqlSessionFactory
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().Build(is);
		
		//��ȡsessionֵ
		//SqlSession session=sessionFactory.openSession();
		try{
			//��ȡ������
			//GetUserInfo getuserinfo=session.getMapper(GetUserInfo.class);
			
		}finally{
			
		}
		
		
		
	}

}
