package com.example.quanlysuckhoecongdan.model;

import jakarta.persistence.*;

@Entity
@Table(name = "CONG_DAN")
public class CongDan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "soCCCD")
    private String soCCCD;

    @Column(name = "hoTen")
    private String hoTen;

    @Column(name = "tuoi")
    private String tuoi;

    @Column(name = "email")
    private String email;

    public CongDan() {
    }

    public CongDan( String hoTen, String soCCCD, String tuoi, String email) {
        this.hoTen = hoTen;
        this.soCCCD = soCCCD;
        this.tuoi = tuoi;
        this.email = email;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
