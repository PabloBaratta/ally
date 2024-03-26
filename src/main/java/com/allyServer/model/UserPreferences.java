package com.allyServer.model;

import javax.persistence.*;
@Entity
public class UserPreferences {

    @Id
    @GeneratedValue(generator = "prefGen", strategy= GenerationType.SEQUENCE)
    private long preferenceId;

    @OneToOne
    @JoinColumn(name = "user_Id", referencedColumnName = "userId")
    private User user;

    @Column
    private int emergencyContact;

    @Column //Foreign Key
    private long emergencyRespirationId;

    @Column //Foreign Key
    private long emergencyMeditationId;

    public UserPreferences(User user){
        this.user = user;
    }

    public UserPreferences() {

    }

    public int getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(int emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public long getEmergencyRespirationId() {
        return emergencyRespirationId;
    }

    public void setEmergencyRespirationId(long emergencyRespirationId) {
        this.emergencyRespirationId = emergencyRespirationId;
    }

    public long getEmergencyMeditationId() {
        return emergencyMeditationId;
    }

    public void setEmergencyMeditationId(long emergencyMeditationId) {
        this.emergencyMeditationId = emergencyMeditationId;
    }
}
