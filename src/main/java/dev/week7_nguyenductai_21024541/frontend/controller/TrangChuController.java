package dev.week7_nguyenductai_21024541.frontend.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class TrangChuController {
    @GetMapping("/home")
    public String directToHome() {
        return "index";
    }
    @GetMapping("/admin")
    public String directToAdminManagement() {
        return "admin/homepage";
    }
}
