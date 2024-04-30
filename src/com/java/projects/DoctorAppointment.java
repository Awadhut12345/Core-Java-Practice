package com.java.projects;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Appointment {
	private String doctorName;
	private Date date;
	private boolean isBooked;
	
	
	 public Appointment(String doctorName, Date date) {
	        this.doctorName = doctorName;
	        this.date = date;
	        this.isBooked = false;
	    }
	 
	  public String getDoctorName() {
	        return doctorName;
	    }

	    public Date getDate() {
	        return date;
	    }

	    public boolean isBooked() {
	        return isBooked;
	    }

	    public void bookAppointment() {
	        this.isBooked = true;
	    }

	    public void cancelAppointment() {
	        this.isBooked = false;
	    }
	 
}


class AppointmentScheduler {
    private List<Appointment> appointments;

    public AppointmentScheduler() {
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
    
    public List<Appointment> getAvailableAppointments() {
        List<Appointment> availableAppointments = new ArrayList<>();
        for (Appointment appointment : appointments) {
            if (!appointment.isBooked()) {
                availableAppointments.add(appointment);
            }
        }
        return availableAppointments;
    }

    public void cancelAppointment(Date date) {
        for (Appointment appointment : appointments) {
            if (appointment.getDate().equals(date)) {
                appointment.cancelAppointment();
                break;
            }
        }
    }
    
}



public class DoctorAppointment {

	 public static void main(String[] args) {
	        AppointmentScheduler scheduler = new AppointmentScheduler();

	        // Adding sample appointments
	        scheduler.addAppointment(new Appointment("Dr. Rawat", new Date(2024, 3, 17, 10, 0))); // Sample date and time
	        scheduler.addAppointment(new Appointment("Dr. Johnson", new Date(2024, 3, 17, 12, 30))); // Sample date and time

	        // Display available appointments
	        List<Appointment> availableAppointments = scheduler.getAvailableAppointments();
	        System.out.println("Available Appointments:");
	        for (Appointment appointment : availableAppointments) {
	            System.out.println(appointment.getDoctorName() + " - " + appointment.getDate()+" ");
	        }

	        // Book an appointment
	        if (!availableAppointments.isEmpty()) {
	            Appointment appointmentToBook = availableAppointments.get(0);
	            appointmentToBook.bookAppointment();
	            System.out.println("Appointment booked with " + appointmentToBook.getDoctorName() + " on " + appointmentToBook.getDate());
	        }

	        // Cancel an appointment
	        Date appointmentDateToCancel = new Date(2024, 3, 17, 9, 0); // Sample date and time
	        scheduler.cancelAppointment(appointmentDateToCancel);
	        System.out.println("Appointment on " + appointmentDateToCancel + " canceled.");

	        // Display updated available appointments
	        availableAppointments = scheduler.getAvailableAppointments();
	        System.out.println("\nUpdated Available Appointments:");
	        for (Appointment appointment : availableAppointments) {
	            System.out.println(appointment.getDoctorName() + " - " + appointment.getDate());
	        }
	    }
}








