package cn.tedu.entity;

import java.util.List;

public class Article {
	private int oId; //����
	private String articleTitle;//���±���
	private String articleAbstract;//����ժҪ
	private int articleCommentCount;//��������
	private int articleViewCount; //�����
	private String articleContent; //��������
	private int articlePutTop;//�Ƿ��ö�
	private long articleCreated;//����ʱ��
	private long articleUpdated;//�޸�ʱ��
	private int articleRandomDouble;//���������
	private String username;//��������
	
	private List<Tag> tags;//�����ı�ǩ
	
	
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getArticleTitle() {
		return articleTitle;
	}
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}
	public String getArticleAbstract() {
		return articleAbstract;
	}
	public void setArticleAbstract(String articleAbstract) {
		this.articleAbstract = articleAbstract;
	}
	public int getArticleCommentCount() {
		return articleCommentCount;
	}
	public void setArticleCommentCount(int articleCommentCount) {
		this.articleCommentCount = articleCommentCount;
	}
	public int getArticleViewCount() {
		return articleViewCount;
	}
	public void setArticleViewCount(int articleViewCount) {
		this.articleViewCount = articleViewCount;
	}
	public String getArticleContent() {
		return articleContent;
	}
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}
	public int getArticlePutTop() {
		return articlePutTop;
	}
	public void setArticlePutTop(int articlePutTop) {
		this.articlePutTop = articlePutTop;
	}
	public long getArticleCreated() {
		return articleCreated;
	}
	public void setArticleCreated(long articleCreated) {
		this.articleCreated = articleCreated;
	}
	public long getArticleUpdated() {
		return articleUpdated;
	}
	public void setArticleUpdated(long articleUpdated) {
		this.articleUpdated = articleUpdated;
	}
	public int getArticleRandomDouble() {
		return articleRandomDouble;
	}
	public void setArticleRandomDouble(int articleRandomDouble) {
		this.articleRandomDouble = articleRandomDouble;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Article(int oId, String articleTitle, String articleAbstract, int articleCommentCount, int articleViewCount,
			String articleContent, int articlePutTop, long articleCreated, long articleUpdated, int articleRandomDouble,
			String username) {
		super();
		this.oId = oId;
		this.articleTitle = articleTitle;
		this.articleAbstract = articleAbstract;
		this.articleCommentCount = articleCommentCount;
		this.articleViewCount = articleViewCount;
		this.articleContent = articleContent;
		this.articlePutTop = articlePutTop;
		this.articleCreated = articleCreated;
		this.articleUpdated = articleUpdated;
		this.articleRandomDouble = articleRandomDouble;
		this.username = username;
	}
	@Override
	public String toString() {
		return "Article [oId=" + oId + ", articleTitle=" + articleTitle + ", articleAbstract=" + articleAbstract
				+ ", articleCommentCount=" + articleCommentCount + ", articleViewCount=" + articleViewCount
				+ ", articleContent=" + articleContent + ", articlePutTop=" + articlePutTop + ", articleCreated="
				+ articleCreated + ", articleUpdated=" + articleUpdated + ", articleRandomDouble=" + articleRandomDouble
				+ ", username=" + username + "]";
	}
	
	
	
}
