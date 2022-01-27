package exercice1;

public class UE {
    private String nom;
    private double CM;
    private double TD;
    private double TP;


    public UE(String nom){
        if (nom==null || nom.trim().equals("")){
            System.out.println(" Le nom ne peut pas être nul ou vide");
            System.exit(1);
        }
        this.nom = nom;
    }

    public UE(String nom, double CM, double TD, double TP){
        if (nom==null || nom.trim().equals("")){
            System.out.println(" Le nom ne peut pas être nul ou vide");
            System.exit(1);
        }

        if(CM < 0 || TD < 0 || TP < 0){
            System.out.println("Un nombre d'heures ne peut pas être négatif");
            System.exit(1);
        }

        this.nom = nom;
        this.CM = CM;
        this.TD = TD;
        this.TP = TP;
    }

    public UE(UE original){
        if (original == null){
            System.out.println("UE ne peut pas être null");
        }
        this.nom = original.nom;
        this.CM = original.CM;
        this.TD = original.TD;
        this.TP = original.TP;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        if(nom==null || nom.equals("")){
            System.out.println("nom ne doit pas être nulle ou vide");
            System.exit(1);
        }
        this.nom = nom;
    }

    public void setCM(double CM){
        if(CM < 0 ){
            System.out.println("CM ne doit pas etre nul dans setCM");
            System.exit(1);
        }
        this.CM = CM;
    }

    public void setTD(double TD){
        if( TD < 0 ){
            System.out.println("TD ne doit pas etre nul dans setTD");
            System.exit(1);
        }
        this.CM = CM;
    }

    public void setTP(double TP){
        if( TP < 0 ){
            System.out.println("TP ne doit pas etre nul dans setTP");
            System.exit(1);
        }
        this.TP = TP;
    }

    public boolean estEgale(UE ue){
        if (ue == null) return false;
        if (this == ue) return true;
        return (this.nom.equals(ue.nom) && this.CM == ue.CM && this.TD == ue.TD && this.TP == TP);
    }

    public String toString(){
        return "UE[nom="+nom+"; CM="+CM+" TD="+TD+" TP="+TP+"]";
    }

    public static void main(String[] args){
        System.out.println("Test de la classe UE");
        UE bpo = new UE("Bases de la Prog Objet", 16, 16, 28);
        System.out.println("BPO :"+bpo);
        //System.out.println("Cumul présentiel : "+bpo.getCumulPresentiel());
        //System.out.println("Cum équivalent TD :"+bpo.getCumulEqTD());

    }
}