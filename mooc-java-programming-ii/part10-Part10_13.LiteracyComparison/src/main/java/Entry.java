/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class Entry implements Comparable<Entry>{
    private String country;
    private String gender;
    private int year;
    private double rate;
    
    public Entry(String gender,String country,int year,double rate){
        this.gender = gender.replace("(%)", "").trim();
        this.country = country.trim();
        this.year = year;
        this.rate = rate;
        
    }

    public String getCountry() {
        return country;
    }

    public String getGender() {
        return gender;
    }

    public int getYear() {
        return year;
    }

    public double getRate() {
        return rate;
    }
    public String toString(){
        return country+" ("+year+"), "+gender+", "+rate;
    }
    
    public int compareTo(Entry entry){
        if (this.rate == entry.rate){
            return 0;
        }
        if (this.rate < entry.rate){
            return -1;
        } else {
            return 1;
        }
        
    }
    
    
}
