package pack;

import org.omg.CORBA.portable.InputStream;

public class HelloMyBatis {

	public static void main(String[] args) {
		//声明配置文件的目录读职
		String resource="conf.xml";
		//加载应用配置文件
		InputStream is=(InputStream) HelloMyBatis.class.getClassLoader().getResourceAsStream(resource);
		//创建SqlSessionFactory
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().Build(is);
		
		//获取session值
		//SqlSession session=sessionFactory.openSession();
		try{
			//获取操作类
			//GetUserInfo getuserinfo=session.getMapper(GetUserInfo.class);
			
		}finally{
			
		}
		
		
		
	}

}
