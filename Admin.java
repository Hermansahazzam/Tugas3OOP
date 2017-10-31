class Admin {
	public String kode_adm;
	public String nama_adm;
	public String password;
	public String level_akses;

	public void tambah(){

		System.out.print("Masukan kode : ");
		kode_adm = input.nextLine();
		System.out.print("Masukan nama : ");
		nama_adm = input.nextLine();
		System.out.print("Masukan Password : ");
		password = input.nextLine();
		System.out.print("Jenis Akses : ");
		level_akses = input.nextLine();
				
	}
	public void update(){
		System.out.print("Silahkan masukan kode admin yang akan diupdate: ");
		kode_adm = input.nextLine();	
	}
	public void hapus(){
		System.out.print("Silahkan masukan kode admin yang akan dihapus: ");
		kode_adm = input.nextLine();
	}
	
}