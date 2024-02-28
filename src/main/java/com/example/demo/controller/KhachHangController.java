package com.example.demo.controller;

import com.example.demo.entity.KhachHang;
import com.example.demo.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/khach-hang")
public class KhachHangController {
    @Autowired
    KhachHangService khachHangService;

    @GetMapping("/hien-thi")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(khachHangService.getAll());
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody KhachHang kh) {
        return ResponseEntity.ok(khachHangService.add(kh));
    }

    @PutMapping("/update/{ma}")
    public ResponseEntity<?> update(@PathVariable Long ma, @RequestBody KhachHang khachHang) {
        return ResponseEntity.ok(khachHangService.update(khachHang, ma));
    }

    @DeleteMapping("/delete/{ma}")
    public ResponseEntity<?> delete(@PathVariable Long ma) {
        return ResponseEntity.ok(khachHangService.delete(ma));
    }

}
