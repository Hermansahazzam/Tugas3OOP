class Barang {
		public String kode_barang;
		public String nama_barang;
		public String harga_barang;
		public String jumlah;
		public String suplier;

		public void tambah(){
			System.out.print("Masukan kode barang   : ");
			kode_barang = input.nextLine();
			System.out.print("Masukan nama barang   : ");
			nama_barang = input.nextLine();
			System.out.print("Masukan harga barang  : ");
			harga_barang = input.nextLine();
			System.out.print("Masukan jumlah barang : ");
			jumlah = input.nextLine();
			System.out.print("Nama Suplier          : ");
			suplier = input.nextLine();
		}
		public void ubah(){
			System.out.print("Silahkan masukan kode barang ayang akan diubah: ");
			kode_barang = input.nextLine();
		}
		public void hapus(){
			System.out.print("Silahkan masukan kode barang ayang akan dihapus: ");
			kode_barang = input.nextLine();
		}
		public void retur(){
			System.out.print("Silahkan masukan kode barang ayang akan diretur: ");
			kode_barang = input.nextLine();
		}
	}