package com.example.demo.service;

import com.example.demo.entity.KhachHang;
import com.example.demo.reponsitory.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KhachHangService {
    @Autowired
    private KhachHangRepository khachHangRepository;

    public List<KhachHang> getAll() {
        return khachHangRepository.findAll();
    }

    public KhachHang add(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    public KhachHang update(KhachHang khachHang, Long ma) {
        Optional<KhachHang> khachHangOptional = khachHangRepository.findById(ma);
        return khachHangOptional.map(khachHang1 -> {
            khachHang1.setTen(khachHang.getTen());
            khachHang1.setSdt(khachHang.getSdt());
            khachHang1.setGioiTinh(khachHang.getGioiTinh());
            return khachHangRepository.save(khachHang1);
        }).orElse(null);
    }

    public KhachHang delete(Long ma) {
        Optional<KhachHang> khachHangOptional = khachHangRepository.findById(ma);
        return khachHangOptional.map(khachHang -> {
            khachHangRepository.delete(khachHang);
            return khachHang;
        }).orElse(null);
    }
}
