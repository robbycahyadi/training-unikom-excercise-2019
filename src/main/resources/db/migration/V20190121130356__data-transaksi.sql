insert into master_transaksi(id_transaksi, id_toko, id_pelanggan, total_harga) values
('001', '001','001', '30000'),
('002', '002','002', '40000');

insert into transaksi_detail(id_transaksi_detail, id_transaksi, id_produk, jumlah_produk) values
('001', '001', '001', 1),
('002', '001', '002', 1),
('003', '002', '001', 2),
('004', '002', '002', 1);