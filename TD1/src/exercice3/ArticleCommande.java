package exercice3;
import exercice2.Article;
import validation.Validation;

public class ArticleCommande implements Validation {
    private Article article;
    private int quantity;
    private double reduction;

    public ArticleCommande(Article article, int quantity, double reduction){
        validateArticle(article); validateDoublePercentage(reduction);
    }

}
