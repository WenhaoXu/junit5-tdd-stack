package com.thoughtworks.tdd;

/**
 * Created by twer on 3/28/14.
 */
public class HelloWorld {
//    private Dependency dependency;
//
//    public HelloWorld(Dependency dependency) {
//
//        this.dependency = dependency;
//    }
//    public String beenCalled() {
//        return dependency.say();
//    }
     public String fizzBuzzWhizz(int number){
         StringBuffer result = new StringBuffer();
         if(String.valueOf(number).contains("3")){
             return "Fizz";
         }
         if(number % 3 == 0){
              result.append("Fizz");
         }
         if(number % 5 == 0){
             result.append("Buzz");
         }
         if(number % 7 == 0){
             result.append("Whizz");
         }

         return "".equals(result.toString())? String.valueOf(number):result.toString();
     }
}
