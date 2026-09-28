package com.example.quanlysuckhoecongdan.service;

import com.example.quanlysuckhoecongdan.dao.KhamSucKhoeDAO;
import com.example.quanlysuckhoecongdan.model.BenhVien;
import com.example.quanlysuckhoecongdan.model.CongDan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class KhamSucKhoeService {

    @Autowired
    private KhamSucKhoeDAO khamSucKhoeDAO;

    public List<CongDan> getAllCongDan() { return khamSucKhoeDAO.getAllCongDan(); }
    public List<BenhVien> getAllBenhVien() { return khamSucKhoeDAO.getAllBenhVien(); }

    public void saveCongDan(CongDan congDan) {
        khamSucKhoeDAO.saveCongDan(congDan);
    }
    public void saveBenhVien(BenhVien benhVien) {
        khamSucKhoeDAO.saveBenhVien(benhVien);
    }

    public List<BenhVien> searchBenhVien(String keyword) {
        return khamSucKhoeDAO.searchBenhVien(keyword);
    }
}
