package com.zolotarev.gbhm.hm1;

import com.zolotarev.gbhm.hm1.exceptions.IncorrectArrayValueException;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;

public class MethodsFromGb {
    //    Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean method1(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void method2(int a) {
        if (a < 0) {
            System.out.println("Число " + a + " отрицательное!");
        } else {
            System.out.println("Число " + a + " положительное!");
        }
    }

    public static boolean method3(int a) {
        return a<0;
    }

    public static void method4(String name){
        System.out.printf("Привет, %s!",name);
    }

    public static int[] method5div1(int[] arr){
        return Arrays.stream(arr).map(operand -> {
            if (operand==0){
                operand=1;
            }
            else if (operand==1){
                operand=0;
            }
            else {
                throw new IncorrectArrayValueException("0 and 1 values only!");
            }
            return operand;
        }).toArray();
    }

    public static int[] method5div2(int[] arr){
        for (int i =0;i<arr.length;i++){
            if (arr[i]==0){
                arr[i]=1;
            }
            else if (arr[i]==1) {
                arr[i]=0;
            }
            else {
                throw new IncorrectArrayValueException("0 and 1 values only!");
            }
        }
        return arr;
    }

    public static int[] method6(int[] arr){
        for (int i =0;i<arr.length;i++){
            arr[i]=2+3*i;
        }
        return arr;
    }

    public static int[] method7(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (arr[i]<6){
                arr[i]*=2;
            }
        }
        return arr;
    }

    public static int[][] method8(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(i==j||i+j==arr.length-1){
                    arr[i][j]=1;
                }
                else {
                    arr[i][j]=0;
                }
            }
        }
        return arr;
    }

    public static int[] method9(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        return new int[]{min,max};
    }

    public static void method10(int year){
        if ((year%4==0&&year%100!=0)||year%400==0){
            System.out.printf("Год %d високостный!",year);
        }
        else {
            System.out.printf("Год %d не високостный!",year);
        }
    }

    public static boolean method11(int[] arr){
        int firstSum = Arrays.stream(arr).sum();
        int secondSum=0;
        for (int i=0;i<arr.length;i++){
            firstSum-=arr[i];
            secondSum+=arr[i];
            if (firstSum==secondSum&&i!=arr.length-1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int[] arr = new int[100000000];
//        for (int i =0;i<arr.length;i++) {
//            arr[i] = (int) Math.round(Math.random());
//        }
//        long m = System.currentTimeMillis();
//        method5div1(arr);
//        System.out.println(System.currentTimeMillis()-m);
//        long n = System.currentTimeMillis();
//        method5div2(arr);
//        System.out.println(System.currentTimeMillis()-n);
    }
}
