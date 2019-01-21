create table master_transaksi
(
  id_transaksi varchar(64) not null primary key,
  tanggal_transaksi timestamp not null default now(),
  id_toko varchar(64) not null,
  id_pelanggan varchar(64) not null,
  total_harga numeric (12) not null default 0
) engine = InnoDB;

create table detail_transaksi
(
  id_detail_transaksi varchar(64) not null primary key,
  id_transaksi varchar(64) not null,
  id_produk varchar(64) not null,
  jumlah_produk int
) engine = InnoDB;

alter table master_transaksi
  add constraint fk_transaksi_pelanggan foreign key (id_pelanggan)
    references master_pelanggan (id_pelanggan) on update cascade on delete restrict;

alter table master_transaksi
  add constraint fk_transaksi_toko foreign key (id_toko)
    references master_toko (id_toko) on update cascade on delete restrict;

alter table detail_transaksi
  add constraint fk_detail_transaksi_transaksi foreign key (id_transaksi)
    references master_transaksi (id_transaksi) on update cascade on delete restrict;

alter table detail_transaksi
  add constraint fk_detail_transaksi_produk foreign key (id_produk)
    references master_produk (id_produk) on update cascade on delete restrict;