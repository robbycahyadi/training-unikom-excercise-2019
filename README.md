# Soal praktek

1. Buatlah project dengan springboot untuk membuat aplikasi dengan tema e-commerce (Toko online)
2. Ketentuan minimal system yang harus di handle
    - Master data toko
    - Master data produk
    - Transaksi Penjualan (Flow transaksi bebas)
    - Master pelanggan

# Soal teori

1. Apa fungsi Hibernate ORM dan jelaskan mengapa?

hibernate ORM fungsinya untuk membantu java (dalam hal ini hibernate) dalam menyimpan data agar dapat disimpan di dalam penyimpanan yang permanen. dengan hibernate ORM, konfigurasi data seperti skema dimapping dan diterjemahkan menjadi objek-objek dalam java sehingga memudahkan pengguna
dalam mengakses dan memanipulasi database permanen(seperti mysql,posgresql dll).

 
2. Jelaskan menurut pendapat anda dari beberapa fungsi annotation di hibernate seperti berikut:

    - ```@Entity``` : mendeklarasikan kelas sebagai entity
    
    - ```@Table``` : mendefinisikan table. seperti nama tabel
    - ```@Column``` : mendefinisikan atribut-atribut kolom, seperti nama kolom.
    - ```@OneToOne```: mendefinisikan bahwa objek yang dipilih memiliki hubungan one to one didalam database
    - ```@ManyToOne```: mendefinisikan bahwa objek yang dipilih memiliki hubungan many to one didalam database
    - ```@OneToMany``` : mendefinisikan bahwa objek yang dipilih memiliki hubungan one to many didalam database
    - ```@JoinColumn``` : mendefinisikan bahwa objek yang dipilih merupakan join kolom dari tabel lain di dalam database
    - ```@JoinTable``` : mendefinisikan bahwa objek yang dipilih merupakan join tabel dari tabel lain di dalam database
    - ```@GeneratedValue``` : mendefinisikan bahwa objek yang dipilih dihasilkan otomatis oleh java, dengan konfigurasi tertentu 
3. Jelaskan menurut pendapat anda mengenai Dependency injection di springframework?

dengan dependency injection di spring framework, maka sebuah objek (misal contoh kasus dalam konfigurasi) bersifat lebih general, sehingga dapat digunakan
dengan konfigurasi yang berbeda-beda (dengan injection) tanpa merubah / mengotakatik dependency
4. Jelaskan menurut pendapat anda mengenai container / context di spring framework?

container berfungsi untuk menyediakan struktur, yang dapat diisi value nya secara custom
misal dengan beans. sehingga dengan container, suatu fungsi dapat digunakan berulang dengan value yang dapat
berubah2 tergantung dengan beans nya. sehingga memudahkan dan menyederhanakan kode. misal kita buat 
container untuk konek ke database. dengan container tersebut, kita dapat konfigurasi custom
tergantung dengan beans yang kita definisikan, misal dapat berbeda user password, db name, dll
5. Jelaskan menurut pendapat anda fungsi dari beberapa fitur annotation di spring frameork seperti berikut:
    - ```@ComponentScan``` : untuk memberitahu kode yang akan digunakan dalam component
    - ```@Autowired``` : memasukkan / mengkolaborasikan bean kedalam bean
    - ```@Bean```: objek yang diinstansiasi di dalam container
    - ```@Component```: mendefinisikan bahwa kelas tersebut adalah komponen, yang berfungsi sebagai dependency yang dapat diinject.
    - ```@Repository```: mendefinisikan bahwa kelas tersebut adalah repository, yang berfungsi sebagai penghubung ke dalam database
    - ```@Service``` : mendefinisikan bahwa kelas tersebut adalah servis, yang biasanya diisi dengan logic manipulasi dengan database
    - ```@Controller```: mendefinisikan bahwa kelas tersebut adalah controller, yang 
    - ```@RestController```: mendefinisikan bahwa kelas tersebut adalah controller yang memiliki rest
    - ```@RequestMapping```: mendeklarasikan base url controller tersebut
    - ```@GetMapping```: mendefinisikan url untuk http method get
    - ```@PostMapping```: mendefinisikan url untuk http method post
    - ```@PutMapping```: mendefinisikan url untuk http method put
    - ```@DeleteMapping```mendefinisikan url untuk http method delete

## Cara mengerjakan

- Fork repository ini, kemudian setelah di fork, clone ke local komputer anda.
- Setelah selesai silahkan di push ke repository masing-masing.
- Selamat mengerjakan :) & good luck
