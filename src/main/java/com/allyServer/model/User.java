package com.allyServer.model;

import javax.persistence.*;

import com.google.gson.Gson;

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

    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPreferences(UserPreferences preferences) {
        this.preferences = preferences;
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


    public static User fromJson(String json) {
        final Gson gson = new Gson();
        return gson.fromJson(json, User.class);
    }

    public String asJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

}

