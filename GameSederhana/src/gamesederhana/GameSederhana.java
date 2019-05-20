/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesederhana;

import java.util.Scanner;
public class GameSederhana {

    public static void main(String[] args) {
        int player[] = {1,100,0,10,5}; //lvl,health,exp,attack,deffend
        int health[] = {100,120,140,160,180,200};
        int exp[] = {20,50,100,150,200,250};
        Scanner input = new Scanner(System.in);
        
        int x = 1;
        while(x!=0){
            int i = player[0];
            System.out.println("-----------------------------");
            System.out.println("Lvl:    "+player[0]);
            System.out.println("Health: "+player[1]+"/"+health[i-1]);
            System.out.println("EXP:    "+player[2]+"/"+exp[i-1]);
            System.out.println("ATK:    "+player[3]);
            System.out.println("DEF:    "+player[4]);
            System.out.println("-----------------------------");
            System.out.println("1. Cari Musuh");
            System.out.println("2. Heal");
            System.out.println("3. Keluar");
            int a=1;
            int b = 0;
            while(a!=0){
                System.out.print("Masukan Pilihan: ");
                b= input.nextInt();
                if(b==1||b==2||b==3){
                    a=0;
                }else{
                    System.out.println("Masukan Inputan Dengan Benar");
                }
            }
            if(b==1){
                int eHP = 30;
                a =1;
                
                System.out.println("Musuh ditemukan!!");
                while(a!=0){
                    if(a!=0){
                        System.out.println("------------------------");
                        System.out.println("Player");
                        System.out.println("HP: "+player[1]+"/"+health[i-1]);
                        System.out.println("Enemy");
                        System.out.println("HP: "+eHP+"/"+30);
                        System.out.println("------------------------");
                        System.out.println("1. Serang");
                        System.out.println("2. Kabur");
                        System.out.print("Masukan Pilihan: ");
                        int pil = input.nextInt();
                        if(pil==1){
                            player[1] -= (10-player[4]);
                            eHP -=11;
                            if(eHP<=0){
                                a=0;
                                player[2]+=2;
                            }else if(player[1]<=0){
                                a=0;
                                player[1]=1;
                            }
                        }else if(pil==2){
                            a=0;
                        }
                    }else{
                        
                    }
                }
            }else if(b==2){
                player[1]=health[i-1];
            }else{
                x=0;
            }
        }
        
    }
    
}
