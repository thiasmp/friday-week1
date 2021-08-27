/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dat.friday.week1;

/**
 *
 * @author thias
 */
class User {
    
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    String fname;
    String lname;
    String PW;
    String pn;
    String address;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPW() {
        return PW;
    }

    public void setPW(String PW) {
        this.PW = PW;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(int id, String fname, String lname, String PW, String pn, String address) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.PW = PW;
        this.pn = pn;
        this.address = address;
    }

    @Override
    public String toString() {
        return Integer.toString(id) + " " + fname + " " + lname + " " + PW + " " + pn + " " + address;
    }
    
    
}
