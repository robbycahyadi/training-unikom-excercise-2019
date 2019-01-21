create table master_toko(
  id_toko varchar(64) not null primary key,
  nama varchar(100) not null,
  alamat varchar(255),
  kontak varchar(255)
) engine = InnoDB;

insert into master_toko(id_toko, nama, alamat, kontak) values
('001', 'Toko Bagus', 'jl. bagus', 'admin@tokobagus.com'),
('002', 'Toko Pedia', 'jl. pedia', 'admin@tokopedia.com');