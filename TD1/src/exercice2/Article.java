package exercice2;


public class Article implements validation.Validation
{
    private String ref;
    private String label;
    private double price;
    private double tva;

    public Article(String ref, String label){
        this.setRef(ref);
        this.setLabel(label);
    }

    public Article(String ref, String label, double price, double tva){
        this.setRef(ref);
        this.setLabel(label);
        this.setPrice(price);
        this.setTva(tva);
    }

    public String getRef(){
        return this.ref;
    }

    public String getLabel(){
        return this.label;
    }

    public double getPrice(){
        return this.price;
    }

    public double getTva(){
        return this.tva;
    }

    public double getPriceTtc(){
        return (this.price)*(this.tva)/100;
    }

    public void setRef(String ref){
        validateEmptyOrNullString(ref);
        this.ref=ref;
    }

    public void setLabel(String label){
        validateEmptyOrNullString(label);
        this.label=label;
    }

    public void setPrice(double price){
        validateNegDouble(price);
        this.price = price;

    }

    public void setTva(double tva){
        validateDoublePercentage(tva);
        this.tva=tva;
    }

    public boolean equals(Article art){
        if(art==this) return true;
        if(art==null) return false;
        if(this.getLabel().equals(art.getLabel()) && this.getPrice()==art.getPrice() && this.getRef().equals(art.getRef())
           && this.getTva()==art.getTva()) return true;
        else return false;
    }

    public String toString(){
        validateArticle(this);
        return ""+this.getRef()+"("+this.getLabel()+") ["+this.getPrice()+"€ | "+this.getTva()+"%] ";
    }

    public boolean expensiveAtoB(Article B){
        validateArticle(this); validateArticle(B);
        return this.getPrice() > B.getPrice();
    }

    public static void main(String[] args){
        System.out.println("On test un product :");
        Article coca = new Article("12412", "Coca");
        Article cocaCherry = new Article("12415", "Coca Cherry", 2.99, 5);
        coca.setPrice(2.49); coca.setTva(5);

        if(coca.equals(cocaCherry)){
            System.out.println(""+coca);
            System.out.println(""+coca);
        }

        if(!coca.equals(cocaCherry)){
            System.out.println(""+coca);
            System.out.println(""+cocaCherry);
            if(cocaCherry.expensiveAtoB((coca))){
                System.out.println("Le Coca Cherry est plus cher que le coca");
            }
        }

        System.out.println("TTC"+coca+coca.getPrice());
    }


}
