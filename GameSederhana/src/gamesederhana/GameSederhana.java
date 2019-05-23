package gamesederhana;

import java.util.Scanner;
import java.util.Random;

public class GameSederhana {

    public static void main(String[] args) {
        int player[] = {1, 100, 0, 10, 5, 0, 0}; //lvl,health,exp,attack,deffend,weapon,armor
        int health[] = {100, 120, 140, 160, 180, 200};
        int exp[] = {20, 50, 100, 150, 200, 250};
        int monster[][] = {{20, 10, 3, 2}, {50, 15, 7, 10}, {70, 20, 14, 13}, {100, 27, 19, 25}};//HP,ATK,DEF,EXP
        int weapon[][] = {{0, 0}, {5, 0}, {10, 0}, {15, 0}};//dmg,def
        int armor[][] = {{0, 0, 0}, {0, 5,}, {0, 10}, {0, 15}};//dmg,def
        int iWeapon[] = {0, 0, 0};
        int iArmor[] = {0, 0, 0};
        String monsterName[] = {"Kodok", "Ubur - Ubur", "Beruang Laut", "Cacing Besar Alaska"};
        Scanner input = new Scanner(System.in);

        int x = 1;
        while (x != 0) {

            int i = player[0];
            System.out.println("-----------------------------");
            System.out.println("Lvl:    " + player[0]);
            System.out.println("Health: " + player[1] + "/" + health[i - 1]);
            System.out.println("EXP:    " + player[2] + "/" + exp[i - 1]);
            System.out.println("ATK:    " + (player[3] + weapon[player[5]][0]));
            System.out.println("DEF:    " + (player[4] + armor[player[6]][1]));
            System.out.println("-----------------------------");
            System.out.println("1. Cari Musuh");
            System.out.println("2. Heal");
            System.out.println("3. Pakai Weapon dan armor");
            System.out.println("4. Keluar");
            int a = 1;
            int b = 0;
            while (a != 0) {
                System.out.print("Masukan Pilihan: ");
                b = input.nextInt();
                if (b == 1 || b == 2 || b == 3 || b == 4) {
                    a = 0;
                } else {
                    System.out.println("Masukan Inputan Dengan Benar");
                }
            }
            if (b == 1) {
                System.out.println("");
                System.out.println("==================Monster==================");
                System.out.println("1. Kodok - ATK 10 DEF 3 EXP 2");
                System.out.println("2. Ubur - ubur ATK 15 DEF 7 EXP 5");
                System.out.println("3. Beruang Laut - ATK 20 DEF 14 EXP 13");
                System.out.println("4. Cacing Besar Alaska ATK 27 DEF 19 EXP 25");
                System.out.println("===========================================");
                System.out.print("Pilih Musuh yang akan dilawan: ");
                int pilM = input.nextInt();
                int eHP = monster[pilM - 1][0];
                a = 1;

                System.out.println("");
                System.out.println("Musuh ditemukan!!");
                while (a != 0) {
                    if (a != 0) {
                        System.out.println("------------------------");
                        System.out.println("Player");
                        System.out.println("HP: " + player[1] + "/" + health[i - 1]);
                        System.out.println(monsterName[pilM - 1]);
                        System.out.println("HP: " + eHP + "/" + monster[pilM - 1][0]);
                        System.out.println("------------------------");
                        System.out.println("1. Serang");
                        System.out.println("2. Kabur");
                        System.out.print("Masukan Pilihan: ");
                        int pil = input.nextInt();
                        System.out.println("");
                        if (pil == 1) {
                            if ((monster[pilM - 1][1] - (player[4] + armor[player[6]][1])) >= 0) {
                                player[1] -= (monster[pilM - 1][1] - (player[4] + armor[player[6]][1]));
                            } else {

                            }
                            
                            int c =(monster[pilM - 1][1] - (player[4] + armor[player[6]][1]));
                            eHP -= ((player[3] + weapon[player[5]][0]) - monster[pilM - 1][2]);
                            System.out.print("Musuh -" + ((player[3] + weapon[player[5]][0]) - monster[pilM - 1][2]) + " HP Player -"); if(c>=0){System.out.print(c);}else{System.out.print("0");} System.out.println(" HP"); 
                            if (eHP <= 0) {
                                System.out.println(monsterName[pilM - 1] + " berhasil dibunuh. +" + monster[pilM - 1][3] + " exp.");
                                a = 0;
                                player[2] += monster[pilM - 1][3];
                                if (player[2] > exp[player[0] - 1]) {
                                    if (player[0] < exp.length) {
                                        player[0] += 1;
                                        player[2] = 0;
                                        player[1] = health[player[0] - 1];
                                        player[3] += 5;
                                        player[4] += 5;
                                    } else {
                                        player[2] = exp[player[0] - 1];
                                    }

                                } else {

                                }
                                Random rand = new Random();
                                double v = rand.nextDouble();
                                if (monster[pilM - 1][0] == 20) {
                                    
                                    
                                    System.out.println(v);
                                    if (v <= 0.3) {
                                        int wa = (int) (Math.random() * 2) + 1;
                                        System.out.println("wa: " + wa);
                                        if (wa == 1) {
                                            iWeapon[0] = 1;
                                            System.out.println("Anda mendapat weapon A!!!");
                                        } else if (wa == 2) {
                                            iArmor[0] = 1;
                                            System.out.println("Anda mendapat armor A!!!");
                                        }
                                    } else {

                                    }
                                } else if (monster[pilM - 1][0] == 50) {
                                    
                                    System.out.println(v);
                                    if (v <= 0.2) {
                                        int wa = (int) (Math.random() * 2) + 1;
                                        System.out.println("wa: " + wa);
                                        if (wa == 1) {
                                            iWeapon[1] = 1;
                                            System.out.println("Anda mendapat weapon B!!!");
                                        } else if (wa == 2) {
                                            iArmor[1] = 1;
                                            System.out.println("Anda mendapat armor B!!!");
                                        }
                                    }
                                } else if (monster[pilM - 1][0] == 70) {
                                    System.out.println(v);
                                    if (v <= 0.1) {
                                        int wa = (int) (Math.random() * 2) + 1;
                                        System.out.println("wa: " + wa);
                                        if (wa == 1) {
                                            iWeapon[0] = 1;
                                            System.out.println("Anda mendapat weapon C!!!");
                                        } else if (wa == 2) {
                                            iArmor[0] = 1;
                                            System.out.println("Anda mendapat armor C!!!");
                                        }
                                    }
                                } else if (monster[pilM - 1][0] == 100) {
                                    System.out.println(v);
                                    if (Math.random() <= 0.2) {
                                        int wa = (int) (Math.random() * 2) + 1;
                                        System.out.println("wa: " + wa);
                                        if (wa == 1) {
                                            iWeapon[0] = 1;
                                            System.out.println("Anda mendapat weapon C!!!");
                                        } else if (wa == 2) {
                                            iArmor[0] = 1;
                                            System.out.println("Anda mendapat armor C!!!");
                                        }
                                    }
                                }
                            } else if (player[1] <= 0) {
                                a = 0;
                                player[1] = 1;
                            }
                        } else if (pil == 2) {
                            a = 0;
                        } else {
                            System.out.println("");
                            System.out.println("Masukan Pilihan Yang Benar");
                        }
                    } else {
                        System.out.println("");
                    }
                }
            } else if (b == 2) {
                System.out.println("");
                System.out.println("HP +" + (health[i - 1] - player[1]));
                player[1] = health[i - 1];
            } else if (b == 3) {
                System.out.println("");
                System.out.println("------------------------------------");
                System.out.println("Weapon");
                System.out.println("1. Weapon A: " + iWeapon[0]);
                System.out.println("2. Weapon B: " + iWeapon[1]);
                System.out.println("3. Weapon C: " + iWeapon[2]);
                System.out.println("");
                System.out.println("Armor");
                System.out.println("4. Armor A: " + iArmor[0]);
                System.out.println("5. Armor B: " + iArmor[1]);
                System.out.println("6. Armor C: " + iArmor[2]);
                System.out.println("--------------------------------------");
                System.out.print("Pilih Equip: ");
                int pilEquip = input.nextInt();
                if (pilEquip >= 1 && pilEquip <= 3) {
                    if (iWeapon[pilEquip - 1] != 0) {
                        player[5] = pilEquip;
                    } else {
                        System.out.println("Anda tidak memiliki senjata tersebut.");
                    }
                } else if (pilEquip >= 4 && pilEquip <= 6) {
                    if (iArmor[pilEquip - 4] != 0) {
                        player[6] = (pilEquip - 3);
                    } else {
                        System.out.println("Anda tidak memiliki Armor tersebut.");
                    }
                }
            } else {
                System.out.println("");
                System.out.println("Game Shutdown!!");
                x = 0;
            }
        }

    }

}
