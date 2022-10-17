/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.latihan.polymorphism;

/**
 *
 * @author ngend
 */
public class Hero {
    String nama;
    
    Hero(String nama){
    this.nama=nama;
    }
    
    void display(){
            System.out.println("\nnama\t: "+ this.nama);
    }
    void attack(Hero enemy){
    System.out.println(this.nama+" menyerang "+enemy.nama);
    }
}
