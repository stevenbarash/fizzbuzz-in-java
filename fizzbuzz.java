/*
    Written by Steven Barash
*/

public class fizzbuzz{
    public static void main(String[] args){
        for(int i=1;i<100;i++){  // for loop to iterate from 1-100
            if(i%3==0&&i%5==0){ // checks if the number is divisible by both
                    System.out.println("fizz buzz");
            }
            else if (i%3==0){ // checks if the number is divisible by 3
                System.out.println("fizz");
            }
            else if(i%5==0){ // checks if the number is divisible by 5
                System.out.println("buzz");
            }
            else{ // if none of the above is true, just the number is printed
                System.out.println(i);
            }
        }
    }
}