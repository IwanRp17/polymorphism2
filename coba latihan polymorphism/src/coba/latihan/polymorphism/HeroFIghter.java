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
public class HeroFIghter extends Hero{
    String type="fighter";
    
    HeroFIghter(String nama){
    super(nama);
    }
    @Override
    void display(){
        super.display();
          System.out.println("Type\t: "+this.type);
    }
    void showoff(){
     System.out.println("saya hero fighter");
    }
}
