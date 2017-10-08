package APAW.ECP1.MiguelArber.Builder;

import APAW.ECP1.MiguelArber.Article;

public class ArticleBuilder {
	
    private Article article;
    private int id;
    private String reference;
    
    public ArticleBuilder() {
    	
    		this.article = new Article(0, "");
    	
    }
    
    public ArticleBuilder(int id, String reference) {
    	
    		this.article = new Article(id, reference);
    	
    }
    
    public ArticleBuilder addId(int id) {
    	
		this.id = id;
		this.article = new Article(id, reference);
		return this;
    }
    
    public ArticleBuilder addReference(String reference) {
    	
		this.reference = reference;
		this.article = new Article(id, reference);
		return this;
    }
    
    public ArticleBuilder addStock(long stock) {
    	
		article.setStock(stock);
		return this;
    }
    
    public ArticleBuilder addDisontinued(boolean discontinued) {
    	
		article.setDisontinued(discontinued);
		return this;
    }
    
    public Article build() {
        return article;
    }

}
