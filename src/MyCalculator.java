interface AdvancedArithmetic{
    
    int divisorSum(int n);
    
    int findFactorial(int n);
    

}

public class MyCalculator implements AdvancedArithmetic {
    
    
    public int divisorSum(int n) {

        int sum=0;

        for(int i=1; i<=n; i++)
        {
               if(n%i == 0)
               {
                    sum = sum+i;
               } 
        }

        return sum;
    }
    public int findFactorial(int n)
    {
        int fact = 1;

        for(int i=n; i>=1; i--)
        {
            fact = fact*i;
        }

        return fact;
    }


}

/**
 * Name: Shah Tajbid Tousif ;
 * ID: 2012020231 ;
 * Section: 5F ;
 * Email: cse_2012020231@lus.ac.bd ;
 */