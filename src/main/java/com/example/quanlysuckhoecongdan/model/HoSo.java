package com.example.quanlysuckhoecongdan.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "HO_SO")
public class HoSo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maHoSo")
    private int maHoSo;

    @ManyToOne
    @JoinColumn(name = "soCCCD", nullable = false)
    private CongDan soCCCD;

    @ManyToOne
    @JoinColumn(name = "maBenhVien", nullable = false)
    private BenhVien maBenhVien;

    @Column(name = "ngayKham")
    private LocalDate ngayKham;

    @Column(name = "thongTinChuanDoan")
    private String thongTinChuanDoan;

    public HoSo() {};

    public HoSo(int maHoSo, CongDan soCCCD, BenhVien maBenhVien, LocalDate ngayKham, String thongTinChuanDoan) {
        this.maHoSo = maHoSo;
        this.soCCCD = soCCCD;
        this.maBenhVien = maBenhVien;
        this.ngayKham = ngayKham;
        this.thongTinChuanDoan = thongTinChuanDoan;
    }

    public int getMaHoSo() {
        return maHoSo;
    }

    public void setMaHoSo(int maHoSo) {
        this.maHoSo = maHoSo;
    }

    public CongDan getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(CongDan soCCCD) {
        this.soCCCD = soCCCD;
    }

    public BenhVien getMaBenhVien() {
        return maBenhVien;
    }

    public void setMaBenhVien(BenhVien maBenhVien) {
        this.maBenhVien = maBenhVien;
    }

    public LocalDate getNgayKham() {
        return ngayKham;
    }

    public void setNgayKham(LocalDate ngayKham) {
        this.ngayKham = ngayKham;
    }

    public String getThongTinChuanDoan() {
        return thongTinChuanDoan;
    }

    public void setThongTinChuanDoan(String thongTinChuanDoan) {
        this.thongTinChuanDoan = thongTinChuanDoan;
    }
}
