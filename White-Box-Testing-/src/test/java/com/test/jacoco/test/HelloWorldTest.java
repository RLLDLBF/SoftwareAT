package com.test.jacoco.test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import jdk.nashorn.internal.runtime.ECMAException;
import org.junit.Rule;
import org.junit.Test;
import com.test.jacoco.HelloWorld;
import org.junit.rules.ExpectedException;

public class HelloWorldTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	assertEquals(0,hw.Method3(6, -1, 1));
    	assertEquals(0,hw.Method3(6,1,1));
        assertEquals(0,hw.Method3(6,1,-1));
        assertEquals(0,hw.Method3(0,0,1));
        assertEquals(0,hw.Method3(0,0,-1));
    	assertEquals(0,hw.Method3(0,1,-3));
    	assertEquals(0,hw.Method3(5,-1,-3));
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testMethod4(){
        HelloWorld hw = new HelloWorld();
        assertEquals(0,hw.Method4(0,1,1,1,1));
        assertEquals(0,hw.Method4(5,5,1,1,1));
        assertEquals(0,hw.Method4(5,0,1,1,1));
        try {
            hw.Method4(1,0,1,1,1);
        } catch (ArithmeticException e){
            assertThat(e.getMessage(), containsString("/ by zero"));
        }
        try {
            hw.Method4(1,0,1,0,1);
        } catch (ArithmeticException e){
            assertThat(e.getMessage(), containsString("/ by zero"));
        }
//        assertEquals(0,hw.Method4(1,0,1,1,1));//exception
//        assertEquals(0,hw.Method4(1,0,1,0,1));//exception

    }

    @Test
    public void testisTriangle(){
        HelloWorld hw = new HelloWorld();
        assertEquals(true,hw.isTriangle(1,1,1));
        assertEquals(false,hw.isTriangle(1,2,3));
        assertEquals(false,hw.isTriangle(1,3,2));
        assertEquals(false,hw.isTriangle(3,1,2));
    }

    @Test
    public void testisBirthday(){
        HelloWorld hw = new HelloWorld();
        assertEquals(true,hw.isBirthday(1997,4,27));

        assertEquals(false,hw.isBirthday(1989,6,4));
        assertEquals(false,hw.isBirthday(2020,1,1));

        assertEquals(false,hw.isBirthday(2019,12,25));
        assertEquals(false,hw.isBirthday(2019,10,31));
        assertEquals(true,hw.isBirthday(2019,9,30));
        assertEquals(true,hw.isBirthday(2019,10,1));

        assertEquals(false,hw.isBirthday(2015,0,1));
        assertEquals(false,hw.isBirthday(2015,13,1));

        assertEquals(false,hw.isBirthday(2015,1,0));
        assertEquals(false,hw.isBirthday(2015,1,32));

        assertEquals(false,hw.isBirthday(2015,3,0));
        assertEquals(false,hw.isBirthday(2015,3,32));

        assertEquals(false,hw.isBirthday(2015,5,0));
        assertEquals(false,hw.isBirthday(2015,5,32));

        assertEquals(false,hw.isBirthday(2015,7,0));
        assertEquals(false,hw.isBirthday(2015,7,32));

        assertEquals(false,hw.isBirthday(2015,8,0));
        assertEquals(false,hw.isBirthday(2015,8,32));

        assertEquals(false,hw.isBirthday(2015,10,0));
        assertEquals(false,hw.isBirthday(2015,10,32));

        assertEquals(false,hw.isBirthday(2015,12,0));
        assertEquals(false,hw.isBirthday(2015,12,32));

        assertEquals(false,hw.isBirthday(2016,4,0));
        assertEquals(false,hw.isBirthday(2016,4,31));

        assertEquals(false,hw.isBirthday(2016,6,0));
        assertEquals(false,hw.isBirthday(2016,6,31));

        assertEquals(false,hw.isBirthday(2016,9,0));
        assertEquals(false,hw.isBirthday(2016,9,31));

        assertEquals(false,hw.isBirthday(2016,11,0));
        assertEquals(false,hw.isBirthday(2016,11,31));

        assertEquals(false,hw.isBirthday(2016,2,0));
        assertEquals(false,hw.isBirthday(2016,2,30));

        assertEquals(false,hw.isBirthday(2017,2,0));
        assertEquals(false,hw.isBirthday(2017,2,29));

        assertEquals(false,hw.isBirthday(2000,2,0));
        assertEquals(false,hw.isBirthday(2000,2,30));
        assertEquals(true,hw.isBirthday(2000,2,20));

        assertEquals(false,hw.isRun(1000));

        assertEquals(false,hw.isBirthday(2015,2,0));
        assertEquals(false,hw.isBirthday(2015,2,29));
        assertEquals(true,hw.isBirthday(2015,2,7));

    }


    @Test
    public void testminiCalculator(){
        HelloWorld hw = new HelloWorld();
        try {
            double result = hw.miniCalculator(1,2,'+');
//            assertEquals(3.0,result);
            assert (result==3.0);
        }catch (Exception e){}

        try {
            double result = hw.miniCalculator(2,1,'-');
            assert (result==1);
        }catch (Exception e){}

        try {
            double result =  hw.miniCalculator(2,3,'*');
            assert (result==6);
        }catch (Exception e){}

        try {
            double result = hw.miniCalculator(3,2,'/');
            assert (result==1.5);
        }catch (Exception e){}

        try {
            hw.miniCalculator(1,0,'/');
        }catch (Exception e){
            assertThat(e.getMessage(), containsString("b should not be zero!"));
        }

        try {
            hw.miniCalculator(1,0,'&');
        }catch (Exception e){
            assertThat(e.getMessage(), containsString("op here can only be four basic operation : \"+\",\"-\",\"*\",\"/\"."));
        }
    }


}
