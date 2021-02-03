package Proje1;

public class Students {
	public Students(String isim,String soyad,String cinsiyet,String durum) {
		this.isim=isim;
		this.soyad=soyad;
		this.cinsiyet=cinsiyet;
		this.durum=durum;
	}
	private String isim;
	private String soyad;
	private String cinsiyet;
	private String durum;
	public String getDurum() {
		return durum;
	}
	public void setDurum(String durum) {
		this.durum = durum;
	}
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
}
