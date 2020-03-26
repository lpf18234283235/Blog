package cn.tedu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.tedu.entity.Article;
import cn.tedu.utils.DBUtils;

public class ArticleDao {
	//获取首页文章列表
	public List<Article> getHomeList(){
		ArrayList<Article> list = 
				new ArrayList<Article>();
		//获取连接 并自动关闭
		try (Connection conn = DBUtils.getConn()){
			String sql = "select "
					+ "a.oId,a.articleTitle,a.articleAbstract, "
					+ "a.articleCommentCount,a.articleViewCount, "
					+ "a.articleContent,a.articlePutTop, "
					+ "a.articleCreated,a.articleUpdated, "
					+ "a.articleRandomDouble,u.userName "
					+ "from blogs_article a join blogs_user u "
					+ "on a.articleAuthorId=u.oId "
					+ "order by articlePutTop desc, "
					+ "articleCreated desc "
					+ "limit 0,8";
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			while(rs.next()) {
				int oId = rs.getInt(1);
				String title = rs.getString(2);
				String articleAbstract = rs.getString(3);
				int commentCount = rs.getInt(4);
				int viewCount = rs.getInt(5);
				String content = rs.getString(6);
				int putTop = rs.getInt(7);
				long created = rs.getLong(8);
				long updated = rs.getLong(9);
				int random = rs.getInt(10);
				String userName = rs.getString(11);
				Article a = new Article(oId, title, 
						articleAbstract, commentCount, 
						viewCount, content, putTop, created, 
						updated, random, userName);
				//查询该文章关联的标签
				TagDao dao = new TagDao();
				//把查询的标签对象赋值给文章对象
				a.setTags(dao.getTagsByArticleId(oId));
				
				list.add(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}




