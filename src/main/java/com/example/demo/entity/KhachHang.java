package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "KhachHang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaKhachHang")
    private Long maKhachHang;

    @Column(name = "TenKhachHang")
    private String ten;

    @Column(name = "SoDienThoai")
    private String sdt;

    @Column(name = "GioiTinh")
    private Boolean gioiTinh;


}
