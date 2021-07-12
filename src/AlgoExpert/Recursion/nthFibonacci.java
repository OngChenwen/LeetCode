package AlgoExpert.Recursion;

public class nthFibonacci {
    // typical recursion
    public static int getNthFib(int n){
        // base case
        if(n == 2) return 1;
        if(n == 1) return 0;

        return getNthFib(n-1) + getNthFib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(getNthFib(6));
    }
}
