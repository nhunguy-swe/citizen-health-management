package com.example.quanlysuckhoecongdan.model;

import jakarta.persistence.*;

@Entity
@Table(name = "BENH_VIEN")
public class BenhVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maBenhVien")
    private int maBenhVien;

    @Column(name = "tenBenhVien")
    private String tenBenhVien;

    @Column(name = "capBenhVien")
    private String capBenhVien;

    public BenhVien() {
    }

    public BenhVien(int maBenhVien, String tenBenhVien, String capBenhVien) {
        this.maBenhVien = maBenhVien;
        this.tenBenhVien = tenBenhVien;
        this.capBenhVien = capBenhVien;
    }

    public int getMaBenhVien() {
        return maBenhVien;
    }

    public void setMaBenhVien(int maBenhVien) {
        this.maBenhVien = maBenhVien;
    }

    public String getTenBenhVien() {
        return tenBenhVien;
    }

    public void setTenBenhVien(String tenBenhVien) {
        this.tenBenhVien = tenBenhVien;
    }

    public String getCapBenhVien() {
        return capBenhVien;
    }

    public void setCapBenhVien(String capBenhVien) {
        this.capBenhVien = capBenhVien;
    }
}
