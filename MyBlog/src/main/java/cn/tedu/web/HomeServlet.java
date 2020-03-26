package cn.tedu.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.Thymeleaf;
import org.thymeleaf.context.Context;

import cn.tedu.dao.ArticleDao;
import cn.tedu.entity.Article;
import cn.tedu.utils.ThyUtils;




public class HomeServlet extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ��ҳ�����б�
		ArticleDao dao = new ArticleDao();
		List<Article> list = dao.getHomeList();
		//�ѵ�һƪ����ȡ�����ݸ�ҳ��
		Context context = new Context();
		context.setVariable("first", list.get(0));
		
		ThyUtils.write("blog/index",
				response,context);
		
	}


}
