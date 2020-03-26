package cn.tedu.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtils {
	//����ȫ�ֵ����ӳض���
	private static BasicDataSource ds;
	static {
		//�������Զ���
		Properties p = new Properties();
		//��ȡ�ļ�������
		InputStream ips = 
				DBUtils.class.getClassLoader()
				.getResourceAsStream("jdbc.properties");
		try {
			p.load(ips);
			String driver = p.getProperty("driver");
			String url = p.getProperty("url");
			String username = p.getProperty("username");
			String password = p.getProperty("password");
			//�������ӳ�
			ds = new BasicDataSource();
			ds.setDriverClassName(driver);
			ds.setUrl(url);
			ds.setUsername(username);
			ds.setPassword(password);
			//���ó�ʼ���������������������
			ds.setInitialSize(3);
			ds.setMaxActive(5);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//��ȡ���ӵķ���
	public static Connection getConn()
			throws Exception {
		//�����ӳض����л�ȡ����
		return ds.getConnection();
	}
}




