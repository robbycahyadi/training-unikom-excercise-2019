create table master_pelanggan(
  id_pelanggan varchar(64) not null primary key,
  nama varchar(100) not null,
  alamat varchar(255),
  kontak varchar(255)
) engine = InnoDB;

insert into master_pelanggan(id_pelanggan, nama, alamat, kontak) values
('001', 'Asep Sunandar', 'Garut', 'asep@gmail.com'),
('002', 'Beni Budiman', 'Tasik', 'bagus');