package org.allycode.model;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(generator = "UserGen", strategy= GenerationType.SEQUENCE)
    private Long userId;

    @Column
    private String name;

    @Column(unique = true)
    private String email;

    @Column
    private String password;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private UserPreferences preferences;
/*
    @Column
    private Time emotionRemainder;

    @Column
    private Time stepsRemainder;

    @Column
    private Time sleepRemainder;*/

    public User(String name, String email, String password){
        this.name = name;
        this.email= email;
        this.password = password;
        this.preferences = new UserPreferences(this);
    }

    public User() {

    }

    public void setPreferences(int emergencyContact, long emergencyRespirationId,  long emergencyMeditationId) {
        this.preferences.setEmergencyContact(emergencyContact);
        this.preferences.setEmergencyMeditationId(emergencyMeditationId);
        this.preferences.setEmergencyRespirationId(emergencyRespirationId);
    }

    public UserPreferences getPreferences(){
        return this.preferences;
    }
}
