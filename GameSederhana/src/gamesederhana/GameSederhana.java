package gamesederhana;

import java.util.Scanner;

public class GameSederhana {

    public static void main(String[] args) {
        int player[] = {1, 100, 19, 10, 5}; //lvl,health,exp,attack,deffend
        int health[] = {100, 120, 140, 160, 180, 200};
        int exp[] = {20, 50, 100, 150, 200, 250};
        int monster[][] = {{20, 10, 3, 2}, {50, 15, 7, 5}, {70, 20, 14, 13}, {100, 27, 19, 25}};//HP,ATK,DEF,EXP
        Scanner input = new Scanner(System.in);

        int x = 1;
        while (x != 0) {

            int i = player[0];
            System.out.println("-----------------------------");
            System.out.println("Lvl:    " + player[0]);
            System.out.println("Health: " + player[1] + "/" + health[i - 1]);
            System.out.println("EXP:    " + player[2] + "/" + exp[i - 1]);
            System.out.println("ATK:    " + player[3]);
            System.out.println("DEF:    " + player[4]);
            System.out.println("-----------------------------");
            System.out.println("1. Cari Musuh");
            System.out.println("2. Heal");
            System.out.println("3. Keluar");
            int a = 1;
            int b = 0;
            while (a != 0) {
                System.out.print("Masukan Pilihan: ");
                b = input.nextInt();
                if (b == 1 || b == 2 || b == 3) {
                    a = 0;
                } else {
                    System.out.println("Masukan Inputan Dengan Benar");
                }
            }
            if (b == 1) {
                System.out.println("");
                System.out.println("===========================================");
                System.out.println("1. Kodok - ATK 10 DEF 3 EXP 2");
                System.out.println("2. Ubur - ubur ATK 15 DEF 7 EXP 5");
                System.out.println("3. Beruang Laut - ATK 20 DEF 14 EXP 13");
                System.out.println("4. Cacing Besar Alaska ATK 27 DEF 19 EXP 25");
                System.out.println("===========================================");
                System.out.print("Pilih Musuh yang akan dilawan: ");
                int pilM = input.nextInt();
                int eHP = monster[pilM - 1][0];
                a = 1;

                System.out.println("Musuh ditemukan!!");
                while (a != 0) {
                    if (a != 0) {
                        System.out.println("------------------------");
                        System.out.println("Player");
                        System.out.println("HP: " + player[1] + "/" + health[i - 1]);
                        System.out.println("Enemy");
                        System.out.println("HP: " + eHP + "/" + monster[pilM - 1][0]);
                        System.out.println("------------------------");
                        System.out.println("1. Serang");
                        System.out.println("2. Kabur");
                        System.out.print("Masukan Pilihan: ");
                        int pil = input.nextInt();
                        if (pil == 1) {
                            player[1] -= (monster[pilM - 1][1] - player[4]);
                            eHP -= (player[3] - monster[pilM - 1][3]);
                            if (eHP <= 0) {
                                a = 0;
                                player[2] += monster[pilM - 1][3];
                                if (player[2] > exp[player[0]-1]) {
                                    player[0] += 1;
                                    player[2] = 0;
                                    player[1] = health[player[0]-1];
                                    player[3] +=5;
                                    player[4] +=5;
                                } else {

                                }
                            } else if (player[1] <= 0) {
                                a = 0;
                                player[1] = 1;
                            }
                        } else if (pil == 2) {
                            a = 0;
                        } else {
                            System.out.println("Masukan Pilihan Yang Benar");
                        }
                    } else {
                        System.out.println("");
                    }
                }
            } else if (b == 2) {
                player[1] = health[i - 1];
            } else {
                x = 0;
            }
        }

    }

}
