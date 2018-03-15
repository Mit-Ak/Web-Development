/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27a;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Akarsh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            max=Math.max(max, a[i]);
        }
        Arrays.sort(a);
        for(int i=1,j=0;i<=max && j<n;i++,j++){
           if(a[j]!=i){
               System.out.println(i);
               return;
           }
        }   
         System.out.println(max+1);
    }
}
