package cn.tedu.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class DBUtils {
	//声明全局的连接池对象
	private static BasicDataSource ds;
	static {
		//创建属性对象
		Properties p = new Properties();
		//获取文件输入流
		InputStream ips = 
				DBUtils.class.getClassLoader()
				.getResourceAsStream("jdbc.properties");
		try {
			p.load(ips);
			String driver = p.getProperty("driver");
			String url = p.getProperty("url");
			String username = p.getProperty("username");
			String password = p.getProperty("password");
			//创建连接池
			ds = new BasicDataSource();
			ds.setDriverClassName(driver);
			ds.setUrl(url);
			ds.setUsername(username);
			ds.setPassword(password);
			//设置初始连接数量和最大连接数量
			ds.setInitialSize(3);
			ds.setMaxActive(5);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//获取连接的方法
	public static Connection getConn()
			throws Exception {
		//从连接池对象中获取连接
		return ds.getConnection();
	}
}




