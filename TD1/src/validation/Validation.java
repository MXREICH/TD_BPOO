package validation;

import exercice2.Article;

public interface Validation
{

    final String VALIDATION_FAIL_STRING_N="String ne peut pas être nul";
    final String VALIDATION_FAIL_STRING_V="String ne peut pas être vide";
    final String VALIDATION_FAIL_DOUBLE="Double ne peut pas etre neg";
    final String VALIDATION_FAIL_DOUBLE_NULL="Double ne peut pas être zéro";
    final String VALIDATION_FAIL_DOUBLE_PERCENT="Double ne correspond pas à pourcent [0;100]";

    public default void validateEmptyOrNullString(String A) {
        if (A == null) {
            System.out.println(VALIDATION_FAIL_STRING_N);
            System.exit(1);
        }

        if (A.equals("")) {
            System.out.println(VALIDATION_FAIL_STRING_V);
            System.exit(1);
        }

    }

    public default void validateNegDouble(double A) {
        if (A < 0) {
            System.out.println(VALIDATION_FAIL_DOUBLE);
            System.exit(1);
        }
    }

    public default void validateNullDouble(double A){
        if ( A == 0 ){
            System.out.println(VALIDATION_FAIL_DOUBLE_NULL);
            System.exit(1);
        }
    }

    public default void validateDoublePercentage(double A){
        if (A < 0  || A > 100){
            System.out.println(VALIDATION_FAIL_DOUBLE_PERCENT);
            System.exit(1);
        }
    }

    public default boolean validateArticle(Article A){
            validateEmptyOrNullString(A.getRef());
            validateEmptyOrNullString(A.getLabel());
            validateNegDouble(A.getPrice());
            validateDoublePercentage(A.getTva());
            if(A != null) return true;
            else return false;
    }

    public default void validateIntNeg(int A){
        if ( A < 0 ){
            System.out.println(VALIDATION_FAIL_INT_NEGATIVE);
            System.exit(1);
        }
        
    }

}
