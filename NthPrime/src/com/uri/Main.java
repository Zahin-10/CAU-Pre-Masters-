package com.uri;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 11;
        int count = 0;
        int i =2;
        while(true)
        {
            if(checkPrime(i)){
                count++;
            }
            if(count == n)
            {
                System.out.println("This is the nth prime number: "+i);
                break;
            }
            i++;
        }
    }

    public static boolean checkPrime(int number){
        int sqrt = (int) Math.floor(Math.sqrt(number));
        for(int i=2;i<= sqrt;i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
