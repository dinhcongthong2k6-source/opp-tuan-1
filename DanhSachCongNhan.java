package oop;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachCongNhan {
	ArrayList<CongNhan> dscn;
	public DanhSachCongNhan() {
		dscn=new ArrayList<CongNhan>();
	}
	
	public void taoPhanTu(int n) {
		for(int i=0;i<n;i++) {
			dscn.add(i, null);
		}
	}
	public void xuatPT() {
		dscn.size();
	}
	public void themCongNhan(CongNhan cn) {
		for (CongNhan congNhan : dscn) {
			if(cn.getMaCN().contains(congNhan.getMaCN())) {
				System.out.println("Ma cong nhan them khong duoc trung!");
				return;
			}
		}
		dscn.add(cn);
	}
	public void xuatNhanVien() {
		for (CongNhan congNhan : dscn) {
			System.out.println(congNhan);
		}
	}
	public int soLuongNV() {
		int m=0;
		for (CongNhan congNhan : dscn) {
			m++;
		}
		return m;
	}
	public void tinhLuong() {
		
		double donGia;
		for (CongNhan congNhan : dscn) {
			if(congNhan.getMaSoSP()<=199) {
				donGia=0.5;
			}
			else if(congNhan.getMaSoSP()>=200&&congNhan.getMaSoSP()<=399) {
				donGia=0.55;
			}
			else if(congNhan.getMaSoSP()>=400&&congNhan.getMaSoSP()<=599){
				donGia=0.6;
			}
			else {
				donGia=0.65;
			}
			congNhan.luong=congNhan.getMaSoSP()*donGia;
		}	
	}
	public void xuatCN200SP() {
		for (CongNhan congNhan : dscn) {
			if(congNhan.getMaSoSP()>=200) {
				System.out.println(congNhan);
			}
		}
	}
	public void sapXepGiamDan() {
		dscn.sort(Comparator.comparing(CongNhan::getMaSoSP).reversed());
	}
}
