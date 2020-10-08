
package models;
public class FinancialModels {

    public double calculateInterest(double futureCapital, double presentCapital, double periods) {
        double result = Math.pow(futureCapital/presentCapital,1/periods) - 1;       
        return result;
        /* r = (K_n/K_0)^(1/n) - 1 */
    }   
    
    public double calculatePresentCapital(double futureCapital, double interest, double periods) {
        double result = futureCapital/Math.pow(1+interest,periods);
        return result;
        /* 𝐾_0 =(K_n)/((1+r)^n)*/
    }
    
    public double calculateFutureCapital(double presentCapital, double interest, double periods) {
        double result = presentCapital*Math.pow(1+interest,periods);
        return result;
        /* 𝐾_n = K_0 *(1+r)^n*/
    }
    
    public double calculatePeriods(double futureCapital, double presentCapital, double interest) {
        double result;
        result = (Math.log(futureCapital/presentCapital))/(Math.log(1+interest));
        return result;
        /* n = (ln(K_n/K_0))/ln(1+r)*/
    }    

}
