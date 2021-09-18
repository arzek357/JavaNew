import com.zolotarev.gbhm.hm1.MethodsFromGb;
import com.zolotarev.gbhm.hm1.exceptions.IncorrectArrayValueException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class MethodsFromGbTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void method1caseInMiddle(){
        Assert.assertTrue(MethodsFromGb.method1(5,6));
    }

    @Test
    public void method1caseLess(){
        Assert.assertFalse(MethodsFromGb.method1(3,3));
    }

    @Test
    public void method1caseMore(){
        Assert.assertFalse(MethodsFromGb.method1(5,19));
    }

    @Test
    public void method1caseOnHighBorder(){
        Assert.assertTrue(MethodsFromGb.method1(10,10));
    }

    @Test
    public void method1caseOnLowBorder(){
        Assert.assertTrue(MethodsFromGb.method1(5,5));
    }

    @Test
    public void method2casePositive(){
        int a =3;
        MethodsFromGb.method2(a);
        Assert.assertEquals("Число "+a+" положительное!\n",outContent.toString());
    }

    @Test
    public void method2caseNegative(){
        int a =-2;
        MethodsFromGb.method2(a);
        Assert.assertEquals("Число "+a+" отрицательное!\n",outContent.toString());
    }

    @Test
    public void method3caseNegative(){
        int a = -2;
        Assert.assertTrue(MethodsFromGb.method3(a));
    }

    @Test
    public void method3casePositive(){
        int a = 2;
        Assert.assertFalse(MethodsFromGb.method3(a));
    }

    @Test
    public void method3caseZero(){
        int a = 0;
        Assert.assertFalse(MethodsFromGb.method3(a));
    }

    @Test
    public void method4case1(){
        String name = "Dima";
        MethodsFromGb.method4(name);
        Assert.assertEquals("Привет, Dima!",outContent.toString());
    }

    @Test
    public void method4case2(){
        String name = "Алиса";
        MethodsFromGb.method4(name);
        Assert.assertEquals("Привет, Алиса!",outContent.toString());
    }

    @Test
    public void method5div1case1(){
        int[] array = {0,1,1,0};
        int[] resultArray = {1,0,0,1};
        Assert.assertArrayEquals(resultArray,MethodsFromGb.method5div1(array));
    }

    @Test(expected = IncorrectArrayValueException.class)
    public void method5div1case2exception(){
        int[] array = {0,1,1,3};
        MethodsFromGb.method5div1(array);
    }

    @Test
    public void method5div2case1(){
        int[] array = {0,1,1,0};
        int[] resultArray = {1,0,0,1};
        Assert.assertArrayEquals(resultArray,MethodsFromGb.method5div1(array));
    }

    @Test(expected = IncorrectArrayValueException.class)
    public void method5div2case2exception(){
        int[] array = {0,1,1,3};
        MethodsFromGb.method5div2(array);
    }

    @Test
    public void method6case1(){
        int[] array = new int[8];
        int[] resultArray = {2,5,8,11,14,17,20,23};
        Assert.assertArrayEquals(resultArray,MethodsFromGb.method6(array));
    }

    @Test
    public void method6case2(){
        int[] array = new int[4];
        int[] resultArray = {2,5,8,11};
        Assert.assertArrayEquals(resultArray,MethodsFromGb.method6(array));
    }

    @Test
    public void method7case1(){
        int[] array = {1,5,3,2,11,4,5,2,4,8,9,1};
        int[] resultArray={2,10,6,4,11,8,10,4,8,8,9,2};
        Assert.assertArrayEquals(resultArray,MethodsFromGb.method7(array));
    }

    @Test
    public void method8case1(){
        int[][] array = new int[5][5];
        int[][] resultArray = {{1,0,0,0,1},{0,1,0,1,0},{0,0,1,0,0},{0,1,0,1,0},{1,0,0,0,1}};
        Assert.assertArrayEquals(resultArray,MethodsFromGb.method8(array));
    }

    @Test
    public void method8case2(){
        int[][] array = new int[3][3];
        int[][] resultArray = {{1,0,1},{0,1,0},{1,0,1}};
        Assert.assertArrayEquals(resultArray,MethodsFromGb.method8(array));
    }

    @Test
    public void method9case1(){
        int[] array = {3,100,11,1,-9,727,9,1,1,1,1,500,500,-1,-1000};
        int[] resultArray = {-1000,727};
        Assert.assertArrayEquals(resultArray,MethodsFromGb.method9(array));
    }

    @Test
    public void method9case2(){
        int[] array = {0,0,0};
        int[] resultArray = {0,0};
        Assert.assertArrayEquals(resultArray,MethodsFromGb.method9(array));
    }

    @Test
    public void method9case3(){
        int[] array = {1,3,-8,-2,2};
        int[] resultArray = {-8,3};
        Assert.assertArrayEquals(resultArray,MethodsFromGb.method9(array));
    }

    @Test
    public void method10case1(){
        int year = 800;
        String result = "Год "+year+" високостный!";
        MethodsFromGb.method10(year);
        Assert.assertEquals(result,outContent.toString());
    }


    @Test
    public void method10case2(){
        int year = 803;
        String result = "Год "+year+" не високостный!";
        MethodsFromGb.method10(year);
        Assert.assertEquals(result,outContent.toString());
    }

    @Test
    public void method10case3(){
        int year = 804;
        String result = "Год "+year+" високостный!";
        MethodsFromGb.method10(year);
        Assert.assertEquals(result,outContent.toString());
    }

    @Test
    public void method10case4(){
        int year = 900;
        String result = "Год "+year+" не високостный!";
        MethodsFromGb.method10(year);
        Assert.assertEquals(result,outContent.toString());
    }

    @Test
    public void method11case1(){
        int[] array = {3,2,1,6};
        Assert.assertTrue(MethodsFromGb.method11(array));
    }
}
