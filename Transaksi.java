class Transaksi {
		public String no_trans;
		public String tgl_trans;
		

		public void membuat(){
			System.out.print("Masukan nomor transaksi   : ");
			no_trans = input.nextLine();
			System.out.print("Masukan tanggal transaksi : ");
			tgl_trans = input.nextLine();
		}
		public void ubah(){
			System.out.print("Silahkan masukan nomor transaksi yang akan diubah: ");
			no_trans = input.nextLine();
		}
		public void hapus(){
			System.out.print("Silahkan masukan nomor transaksi yang akan dihapus: ");
			no_trans = input.nextLine();
		}		
	}