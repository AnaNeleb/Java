package recursividad_fibonacci_factorial;

public class Recursividad_fibonacci_factorial {

    public static long factorial(long n){
        if(n==1)
            return 1;
            else
            
           return n*factorial(n-1); 
        
        }
    public static long fibonacci(long n){
        if((n==1)||(n==2))
            return 1;
            else
            return fibonacci(n-1)+fibonacci(n-2);
        
        
    }
        
    
    public static void main(String[] args) {
        System.out.println(""+factorial(4));
        System.out.println(""+fibonacci(9));
    }
    
}
