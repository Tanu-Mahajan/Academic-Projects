/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tanujamahajan
 */
public class Patient {
    
    private String PatientID;
    private String PrimaryDoctor;
    private String DateOfLastVisitToDoctor;
    private String DateOfNextAppointment;
    private String Allergies;

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    public String getPrimaryDoctor() {
        return PrimaryDoctor;
    }

    public void setPrimaryDoctor(String PrimaryDoctor) {
        this.PrimaryDoctor = PrimaryDoctor;
    }

    public String getDateOfLastVisitToDoctor() {
        return DateOfLastVisitToDoctor;
    }

    public void setDateOfLastVisitToDoctor(String DateOfLastVisitToDoctor) {
        this.DateOfLastVisitToDoctor = DateOfLastVisitToDoctor;
    }

    public String getDateOfNextAppointment() {
        return DateOfNextAppointment;
    }

    public void setDateOfNextAppointment(String DateOfNextAppointment) {
        this.DateOfNextAppointment = DateOfNextAppointment;
    }

    public String getAllergies() {
        return Allergies;
    }

    public void setAllergies(String Allergies) {
        this.Allergies = Allergies;
    }
    
    
    
}
