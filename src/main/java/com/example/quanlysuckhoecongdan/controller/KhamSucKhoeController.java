package com.example.quanlysuckhoecongdan.controller;

import com.example.quanlysuckhoecongdan.model.BenhVien;
import com.example.quanlysuckhoecongdan.model.CongDan;
import com.example.quanlysuckhoecongdan.model.HoSo;
import com.example.quanlysuckhoecongdan.service.KhamSucKhoeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class KhamSucKhoeController {

    @Autowired
    private KhamSucKhoeService khamSucKhoeService;

    @GetMapping
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/ho-so/add")
    public String showFormAdd(Model model) {
        model.addAttribute("HoSo", new HoSo());
        model.addAttribute("danhSachCongDan", khamSucKhoeService.getAllCongDan());
        model.addAttribute("danhSachBenhVien", khamSucKhoeService.getAllBenhVien());
        return "form-ho-so";
    }

    @GetMapping("/cong-dan/add")
    public String showAddCongDanForm(Model model) {
        model.addAttribute("congDan", new CongDan());
        return "form-cong-dan";
    }


    @PostMapping("/cong-dan/save")
    public String saveCongDan(@ModelAttribute("congDan") CongDan congDan) {
        khamSucKhoeService.saveCongDan(congDan);
        return "redirect:/index";
    }

    @GetMapping("/benh-vien/new")
    public String showBenhVienForm(Model model) {
        model.addAttribute("benhVien", new BenhVien());
        return "form-benh-vien";
    }

    @GetMapping("/benh-vien/add")
    public String showAddBenhVienForm(Model model) {
        model.addAttribute("benhVien", new BenhVien());
        return "form-benh-vien";
    }

    @PostMapping("/benh-vien/save")
    public String saveBenhVien(@ModelAttribute("benhVien") BenhVien benhVien) {
        khamSucKhoeService.saveBenhVien(benhVien);
        return "redirect:/benh-vien/search";
    }

    @GetMapping("/benh-vien/search")
    public String searchTour(@RequestParam(value = "keyword", required = false) String keyword, Model model) {
        List<BenhVien> dsBenhVien;
        if (keyword != null && !keyword.trim().isEmpty()) {
            dsBenhVien = khamSucKhoeService.searchBenhVien(keyword);
        } else {
            dsBenhVien = khamSucKhoeService.getAllBenhVien();
        }
        model.addAttribute("dsBenhVien", dsBenhVien);
        model.addAttribute("keyword", keyword);
        return "search-benh-vien";
    }
}
