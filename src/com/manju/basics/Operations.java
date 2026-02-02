package com.manju.basics;

import java.util.Scanner;

public class Operations {
    static void main() {
        Scanner input=new Scanner(System.in);
        int num1= input.nextInt();
        int num2= input.nextInt();
        char operator= input.next().charAt(0);
        System.out.println(oper(num1,num2,operator));


    }
    static int oper(int num1,int num2,char operator){
        int ans=0;
        if(operator=='+'){
            ans=num1+num2;
        }else if (operator=='-'){
            ans=num1-num2;
        }else if (operator=='*'){
            ans=num1*num2;

        }else if (operator=='/'){
            ans=num1/num2;
        }else{
            System.out.println("Invalid ");
        }
    return ans;
    }

}
