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
public class Adult extends Ticket {
    
    //variables
    
    public Adult(String seatNo,String firstName, String lastName, double ticketPrice){
        super(seatNo, firstName, lastName, ticketPrice);
    }
    
    public Adult(){
        this("", "", "", 0);    
    }
    
    @Override
    public String printDetails(){
        return super.printDetails();
    }
}
