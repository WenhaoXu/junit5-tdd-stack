package com.thoughtworks.tdd;

import com.thoughtworks.tdd.Dependency;
import com.thoughtworks.tdd.HelloWorld;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class HelloWorldTest {

//    @BeforeAll
//    static void initTestEnv() {
//    }
//
//    @BeforeEach
//    void initEveryMethod() {
//    }
//
//
//    @Test
//    @DisplayName("try display name")
//    public void hello_world_test() {
//        //given
//        Dependency dependency = new Dependency();
//        HelloWorld helloWorld = new HelloWorld(dependency);
//
//        //when
//        String actual = helloWorld.beenCalled();
//
//        //then
//        assertThat(actual, is("Leave me alone."));
//    }
//
//    @Test
//    public void should_be_mocked() {
//        //given
//        Dependency dependency = mock(Dependency.class);
//        when(dependency.say()).thenReturn("Hello World");
//        HelloWorld helloWorld = new HelloWorld(dependency);
//
//        //when
//        String actual = helloWorld.beenCalled();
//
//        //then
//        assertThat(actual, is("Hello World"));
//    }

     @Test
    public void should_return_1_when_input_1(){
         int number =1;
         HelloWorld helloWorld=new HelloWorld();
      String result=   helloWorld.fizzBuzzWhizz(number);
         assertThat(result,is("1"));
     }

    @Test
    public void should_return_2_when_input_2(){
        int number =2;
        HelloWorld helloWorld=new HelloWorld();
        String result=   helloWorld.fizzBuzzWhizz(number);
        assertThat(result,is("2"));
    }

    @Test
    public void should_return_Fizz_when_input_3(){
        int number =3;
        HelloWorld helloWorld=new HelloWorld();
        String result=   helloWorld.fizzBuzzWhizz(number);
        assertThat(result,is("Fizz"));
    }
    @Test
    public void should_return_Fizz_when_input_6(){
        int number =6;
        HelloWorld helloWorld=new HelloWorld();
        String result=   helloWorld.fizzBuzzWhizz(number);
        assertThat(result,is("Fizz"));
    }
    @Test
    public void should_return_Buzz_when_input_5(){
        int number =5;
        HelloWorld helloWorld=new HelloWorld();
        String result=   helloWorld.fizzBuzzWhizz(number);
        assertThat(result,is("Buzz"));
    }
    @Test
    public void should_return_FizzBuzz_when_input_15(){
        int number =15;
        HelloWorld helloWorld=new HelloWorld();
        String result=   helloWorld.fizzBuzzWhizz(number);
        assertThat(result,is("FizzBuzz"));
    }

    @Test
    public void should_return_Whizz_when_input_7(){
        int number =7;
        HelloWorld helloWorld=new HelloWorld();
        String result=   helloWorld.fizzBuzzWhizz(number);
        assertThat(result,is("Whizz"));
    }
    @Test
    public void should_return_FizzWhizz_when_input_21(){
        int number =21;
        HelloWorld helloWorld=new HelloWorld();
        String result=   helloWorld.fizzBuzzWhizz(number);
        assertThat(result,is("FizzWhizz"));
    }
    @Test
    public void should_return_BuzzWhizz_when_input_35(){
        int number =35;
        HelloWorld helloWorld=new HelloWorld();
        String result=   helloWorld.fizzBuzzWhizz(number);
        assertThat(result,is("BuzzWhizz"));
    }
    @Test
    public void should_return_FizzBuzzWhizz_when_input_105(){
        int number =105;
        HelloWorld helloWorld=new HelloWorld();
        String result=   helloWorld.fizzBuzzWhizz(number);
        assertThat(result,is("FizzBuzzWhizz"));
    }
}
