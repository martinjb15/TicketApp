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
public class Ticket {
    
    protected String seatNo;
    protected String firstName;
    protected String lastName;
    protected double ticketPrice;  
    
    public Ticket(String seatNo, String firstName,String lastName, double ticketPrice){
        this.seatNo = seatNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ticketPrice = ticketPrice;
    }
    
    public Ticket(){
        this("", "", "",0); 
    }    
    
    public void setSeatNo (String seatNo){
        this.seatNo = seatNo; 
    }
    
    public void setFirstName (String firstName){
        this.firstName = firstName;        
    }
    
    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    public void setTicketPrice (double ticketPrice){
        this.ticketPrice = ticketPrice; 
    }
    
    public String getSeatNo(){
        return seatNo;
    }
    
    public String getFirstName(){
        return firstName;                
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public double getTicketPrice(){
        return ticketPrice;
    }
    
    public String printDetails(){
        return "Name: "+lastName+", "+firstName+" "+"\n"+"Ticket price: "+ticketPrice+" "+"\n"+"Seat no: "+seatNo+" ";
    }
}
