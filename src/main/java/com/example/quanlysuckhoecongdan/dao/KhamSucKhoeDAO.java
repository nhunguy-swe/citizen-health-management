package com.example.quanlysuckhoecongdan.dao;

import com.example.quanlysuckhoecongdan.model.BenhVien;
import com.example.quanlysuckhoecongdan.model.CongDan;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KhamSucKhoeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public List<CongDan> getAllCongDan() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from CongDan", CongDan.class).getResultList();
    }

    public List<BenhVien> getAllBenhVien() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from BenhVien ", BenhVien.class).getResultList();
    }

    public CongDan getCongDanById(int id) {
        return sessionFactory.getCurrentSession().get(CongDan.class, id);
    }

    public BenhVien getBenhVienById(int id) {
        return sessionFactory.getCurrentSession().get(BenhVien.class, id);
    }

    public void saveCongDan(CongDan congDan) {
        sessionFactory.getCurrentSession().persist(congDan);
    }

    public void saveBenhVien(BenhVien benhVien) {
        sessionFactory.getCurrentSession().persist(benhVien);
    }

    public List<BenhVien> searchBenhVien(String keyword) {
        String hql = "FROM BenhVien WHERE tenBenhVien LIKE :keyword";
        return sessionFactory.getCurrentSession()
                .createQuery(hql, BenhVien.class)
                .setParameter("keyword", "%" + keyword + "%")
                .getResultList();
    }
}
