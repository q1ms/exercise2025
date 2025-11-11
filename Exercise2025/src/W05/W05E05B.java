/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W05;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class W05E05B {
    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in);
        int num,stop=0,count=1,even=0,odd=0,sumeven=0,sumodd=0;
        
        System.out.print("How many numbers ? : ");
        stop = input.nextInt();        
        do{

            System.out.print("Enter a number ("+count+") : ");
            num = input.nextInt();
                        
            if (num%2==0) {
                even+=1;
                sumeven+= num;
            }else if (num%2==1) {
                odd+=1;
                sumodd+= num;
            }
            count++;
        }while(count!=stop+1);
        
        System.out.println("The number is "+num);
        System.out.println("Even : "+even+" Odd : "+odd);
        System.out.println("The sum for even: "+sumeven);
        System.out.println("The sum for odd: "+sumodd);
        
    }
}
