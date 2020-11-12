package cl.ulagos.hotel;

/**
 * Record details of a diary appointment.
 * 
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */

public class Appointment
{
    // The reason for the appointment.
    private String description;
    // The length (in hours) of the appointment.
    private double duration;

    /**
     * Create an appointment with a given duration.
     * @param description The reason for the appointment.
     * @param duration The length of the appointment in hours.
     */
    public Appointment(String description, double duration)
    {
        this.description = description;
        this.duration = duration;
    }

    /**
     * @return The description of the appointment.
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * @return The duration (in hours) of the appointment.
     */
    public double getDuration()
    {
        return duration;
    }
}
