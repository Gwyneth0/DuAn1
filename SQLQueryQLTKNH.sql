create database QLTKNH;
go
use QLTKNH;
go
create table NhanVien(
	maNV nvarchar(6) primary key,
	hoTen nvarchar(50),
	ngaySinh date,
	soCMND nvarchar(9),
	dienThoai nvarchar(10),
	diaChi nvarchar(255),
	hinh nvarchar(50),
);
go
create table TaiKhoan(
	maNV nvarchar(6) primary key,
	matKhau nvarchar(50),
	vaiTro bit
	foreign key (maNV) references NhanVien(maNV)
);
go
create table KhachHang(
	soCMND nvarchar(9) primary key,
	hoTen nvarchar(255),
	ngaySinh date,
	ngayDK date,
	dienThoai nvarchar(10),
	gmail nvarchar(55),
	diaChi nvarchar(255),
	hinh nvarchar(55)
);
go
create table The(
	soTaiKhoan int primary key identity(1001000000,1),
	soCMND nvarchar(9),
	hoTen nvarchar(255),
	ngayDK date,
	ngayHetHan date,
	soTien float,
	maNV nvarchar(6),
	khoa bit,
	internet bit,
	pin int,
	foreign key (maNV) references NhanVien(maNV),
	foreign key (soCMND) references KhachHang(soCMND)
);
go
create table LoaiDichVu(
	maLoai nvarchar(4) primary key,
	tenLoai nvarchar(50),
);
go
create table NhaCungCap(
	maNCC nvarchar(4) primary key,
	maLoai nvarchar(4),
	tenNCC nvarchar(255),
	soTien float,
	foreign key (maLoai) references LoaiDichVu(maLoai),
	
);
go
create table HoaDonChiTiet(
	maHD int identity(1000,1),
	soTaiKhoan int,
	maNCC nvarchar(4),
	maLoai nvarchar(4),
	tenLoai nvarchar(50),
	tenNCC nvarchar(255),
	hoTen nvarchar(255),
	ngayThanhToan date,
	soTien float,
	noiDung nvarchar(255),
	primary key (soTaiKhoan, maHD),
	foreign key (maLoai) references LoaiDichVu(maLoai),
	foreign key (maNCC) references NhaCungCap(maNCC),
	foreign key (soTaiKhoan) references The(soTaiKhoan),
);
go
insert NhanVien values(N'NV0001', N'Nguyễn Văn Tèo', '12-12-2002', N'012345678', N'0987123456', N'Quận 12, TpHCM', N'teonao.jpg');
go
insert TaiKhoan values( N'NV0001', N'123456',0);
go
insert KhachHang values(N'012345699', N'Nguyễn Văn A', '01-01-2002','08-08-2021',N'0987123444', N'teo@gmail.com', N'Quận 12, TpHCM', N'vana.jpg');
go
insert The values(N'012345699', N'Nguyễn Văn A', '08-08-2021', '08-08-2026', 5000000, N'NV0001',1, 1, 123456);
go
insert LoaiDichVu values(N'TT01', N'Thanh toán hoá đơn nước');
insert LoaiDichVu values(N'TT02', N'Thanh toán hoá đơn điện');
insert LoaiDichVu values(N'NT01', N'Nạp Tiền');
insert LoaiDichVu values(N'RT01', N'Rút Tiền');
go
insert NhaCungCap values(N'N001' ,N'TT01', N'CTy Nước TpHCM Q.12', 50000);
insert NhaCungCap values(N'N002' ,N'TT02', N'CTy Điện Q.1', 100000);
insert NhaCungCap values(N'TNB1' ,N'NT01', N'TN_BANK', 0);
insert NhaCungCap values(N'TNB2' ,N'RT01', N'TN_BANK', 0);


