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
		//����������
		ClassLoaderTemplateResolver resolver
			= new ClassLoaderTemplateResolver();
		//�����ַ��� 
		resolver.setCharacterEncoding("utf-8");
		//���ú�׺
		resolver.setSuffix(".html");
		//��������ģ���������
		te.setTemplateResolver(resolver);
	}
	//��д���Ĵ����װ��������
	public static void write(
			String path,
			HttpServletResponse response,
			Context context) throws IOException {
		//��ҳ������ݽ���ģ�����棬�����µ�html
		String html = te.process(path, context);
		//������Ӧͷ
		response.setContentType("text/html;charset=utf-8");
		//��ȡ������� �쳣�׳�
		PrintWriter pw = response.getWriter();
		pw.println(html);
		pw.close();
	}
	
	
	
	
	
	
	
}
