/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse310_assingment;

/**
 *
 * @author HP-NPC
 */
public class sec_data {
    private String Name ;
    private int SID ;
    
    public sec_data (String r , int u ){
    this.Name = r;
    this.SID = u;
    
    }
    
    public String getName(){
   return Name;
    
    }
    
    
     public int getSID(){
   return SID;
    
    }
    
    
    
}
