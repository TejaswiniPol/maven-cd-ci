package com.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CovidData {
    String uid;
    String combined_name;
    int population;
    Date date;
    int confirmed;
    int deaths;
    int confirmed_daily;
    int death_daily;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCombined_name() {
        return combined_name;
    }

    public void setCombined_name(String combined_name) {
        this.combined_name = combined_name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getConfirmed_daily() {
        return confirmed_daily;
    }

    public void setConfirmed_daily(int confirmed_daily) {
        this.confirmed_daily = confirmed_daily;
    }

    public int getDeath_daily() {
        return death_daily;
    }

    public void setDeath_daily(int death_daily) {
        this.death_daily = death_daily;
    }

    @Override
    public String toString() {
        return "CovidData{" +
                "location='" + combined_name + '\'' +
                ", confirmed='" + confirmed + '\'' +
                ", deaths=" + deaths +
                '}';
    }
}
