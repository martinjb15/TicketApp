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
public class Student extends Ticket {
    
    
    //variables
    private int studentNo;
    
    public Student(String seatNo, String firstName, String lastName, double ticketPrice, int studentNo){
        super(seatNo, firstName, lastName,ticketPrice);
        this.studentNo = studentNo;
    }
    
    public Student(){
        this("", "", "", 0, 0);    
    }
    
    
    public void setStudentNo(int studentNo){
        this.studentNo = studentNo; 
    }
    
    public double getStudentNo(){
        return studentNo;
    }
    
    @Override
    public String printDetails(){
        return super.printDetails()+"\n"+"Student No: "+studentNo;
    }
}
