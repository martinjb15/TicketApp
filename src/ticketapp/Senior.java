/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketapp;

/**
 *
 * @author Tetsuya
 */
public class Senior extends Ticket {
    
    //variables
    private int age;
    
    public Senior(String seatNo, String firstName,String lastName, double ticketPrice, int age){
        super(seatNo, firstName, lastName, ticketPrice);
        this.age = age;
    }
    
    public Senior(){
        this("", "", "",0, 0);    
    }
    
    
    public void setAge(int age){
        this.age = age; 
    }
    
    public double getAge(){
        return age;
    }
    
    @Override
    public String printDetails(){
        return super.printDetails()+"\n"+"Age: "+age;
    }
}
