	class Laporan {
		public String no_lap;
		public String tgl_lap;
		public String jenis_lap;
		public void cetak(){
			this.no_lap = "90786";
			this.tgl_lap = "23 november";
			this.jenis_lap = "keuangan";
			System.out.println(no_lap);
			System.out.println(tgl_lap);
			System.out.println(jenis_lap);
		}
		public void ubah_lap(){
			System.out.print("Masukan nomor laporanyang akan diubah : ");
			no_lap = input.nextLine();
				
		}
		public void hapus_lap(){
			System.out.print("Masukan nomor laporanyang akan diubah : ");
			no_lap = input.nextLine();
		}
		
	}
	
	
	