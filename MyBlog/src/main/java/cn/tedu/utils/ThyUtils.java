package cn.tedu.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class ThyUtils {
	private static TemplateEngine te;
	static {
		te = new TemplateEngine();
		//创建解析器
		ClassLoaderTemplateResolver resolver
			= new ClassLoaderTemplateResolver();
		//设置字符集 
		resolver.setCharacterEncoding("utf-8");
		//设置后缀
		resolver.setSuffix(".html");
		//解析器和模板引擎关联
		te.setTemplateResolver(resolver);
	}
	//把写出的代码封装到方法中
	public static void write(
			String path,
			HttpServletResponse response,
			Context context) throws IOException {
		//把页面和数据交给模板引擎，生成新的html
		String html = te.process(path, context);
		//设置响应头
		response.setContentType("text/html;charset=utf-8");
		//获取输出对象 异常抛出
		PrintWriter pw = response.getWriter();
		pw.println(html);
		pw.close();
	}
	
	
	
	
	
	
	
}
