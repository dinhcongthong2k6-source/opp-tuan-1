package oop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		CongNhan cn1=new CongNhan("CN1", "Ngo", "Kien", 199);
		CongNhan cn2=new CongNhan("CN2", "Nguyen", "Kha", 699);
		CongNhan cn3=new CongNhan("CN3", "Hoang", "Minh", 219);
		CongNhan cn4=new CongNhan("CN4", "Vo", "Hung", 299);
		CongNhan cn5=new CongNhan("CN5", "Le", "Nhu", 399);
		DanhSachCongNhan qlcn=new DanhSachCongNhan();
		qlcn.themCongNhan(cn1);
		qlcn.themCongNhan(cn2);
		qlcn.themCongNhan(cn3);
		qlcn.themCongNhan(cn4);
		qlcn.themCongNhan(cn5);
		
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Chon\n"
				+ "1: Khoi tao phan tu\n"
				+ "2: Them Cong Nhan\n"
				+ "3: Xuat danh sach cong nhan\n"
				+ "4: Tinh luong CN\n"
				+ "5: Xuat danh sach cong nhan lam tren 200 san pham\n"
				+ "6: Sap xep cong nhan\n"
				+ "7: Tinh so luong nv \n"
				+ "0: Thoat");
		do {
			n=sc.nextInt();
			sc.nextLine();
			System.out.println("Chon\n"
					+ "1: Khoi tao phan tu\n"
					+ "2: Them Cong Nhan\n"
					+ "3: Xuat danh sach cong nhan\n"
					+ "4: Tinh luong CN\n"
					+ "5: Xuat danh sach cong nhan lam tren 200 san pham\n"
					+ "6: Sap xep cong nhan\n"
					+ "7: Tinh so luong nv \n"
					+ "0: Thoat");
			switch (n) {
				case 1:{
					System.out.println("Nhap so phan tu: ");
					int k;
					k=sc.nextInt();
					qlcn.taoPhanTu(k);
					sc.nextLine();
					break;
				}
				
				case 2:{
					System.out.println("Nhap ma cong nhan: " );
					String ma=sc.nextLine();
					System.out.println("Nhap ho cong nhan: " );
					String ho=sc.nextLine();
					System.out.println("Nhap ten cong nhan: " );
					String ten=sc.nextLine();
					System.out.println("Nhap so san pham cong nhan: " );
					int sp=sc.nextInt();
					CongNhan cn=new CongNhan(ma, ho, ten, sp);
					qlcn.themCongNhan(cn);
					System.out.println("Da them!");
					break;
				}
				case 3:{
					qlcn.xuatNhanVien();
					break;
				}
				case 4:{
					qlcn.tinhLuong();
					System.out.println("Da tinh luong");
					break;
				}
				case 5:{
					System.out.println("Danh sach nhan vien lam tren 200 sp:");
					qlcn.xuatCN200SP();
					break;
				}
				case 6:{
					qlcn.sapXepGiamDan();
					System.out.println("Da sap xep");
					break;
				}
				case 7:{
					System.out.println("So luong cong nhan trong danh sach: ");
					qlcn.soLuongNV();
					break;
				}
				
				default:
					throw new Exception("Khong co so");
			}
		}while(n!=0);
	}
}
