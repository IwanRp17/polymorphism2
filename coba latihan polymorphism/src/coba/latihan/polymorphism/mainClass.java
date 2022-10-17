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
public class mainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hero hero1=new Hero("michael");
        hero1.display();
        HeroFIghter hero2=new HeroFIghter("balmond");
        hero2.display();
        hero2.showoff();
        HeroFIghter hero3=new HeroFIghter("sus");
        hero3.display();
        
        Hero[] kumpulanHero=new Hero[4];
            kumpulanHero[0]=hero1;
            kumpulanHero[1]=hero2;
            kumpulanHero[2]=hero3;
            hero1.attack(hero2);
           
    }
    
}
