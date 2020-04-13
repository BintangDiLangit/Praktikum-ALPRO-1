/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsss;

/**
 *
 * @author BintangDiLangit
 */
public class no2 {
    public static void main(String[] args) {
        System.out.println("menapilkan 1 - 20");
        for (int i = 1; i<=20; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 1; i<=20; i++){
            if (i%2 == 1){
                System.out.println(i+" ganjil");
            } 
        }
        for (int i = 1; i<=20; i++){
            if (i%2 == 0){
                System.out.println(i+" genap");
            } 
    }
}}
