package com.ferragnez.party;

import java.util.Scanner;

public class BonusCheckGuest {
    public static void main(String[] args) {
        String [] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
       
        System.out.println("Inserisci il tuo nome:");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        sc.close();

        boolean isInvited = false;
     
    // BONUS con il metodo for
        for (int i=0; i < guests.length; i++){
            if (guests[i].replaceAll("\\s+", "").equalsIgnoreCase(userName.replaceAll("\\s+", ""))){
                isInvited = true;
                break;
            }
        }
         if(isInvited){
            System.out.println("Benvenuto alla festa!");
        } else {
            System.out.println("Mi dispiace, non sei invitato.");
        }
    }
    }
    

