create table master_produk(
  id_produk varchar(64) not null primary key,
  nama varchar(100) not null,
  harga numeric (12) not null default 0,
  deskripsi text
) engine = InnoDB;

insert into master_produk(id_produk, nama, harga, deskripsi) values
('001', 'Aqua', 10000,'Air Mineral'),
('002', 'Indomie', 20000,'Mie Instant');

insert into master_produk(id_produk, nama) values
('003', 'Energen');