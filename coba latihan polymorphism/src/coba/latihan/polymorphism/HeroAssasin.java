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
public class HeroAssasin extends Hero{
    String type="assasin";
     
    HeroAssasin(String nama){
    super(nama);
    }
     @Override
    void display(){
        super.display();
          System.out.println("Type\t: "+this.type);
    }
   
}
