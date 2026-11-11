package oop;

public class CongNhan {
	private String maCN;
	private String mHo;
	private String mTen;
	private int maSoSP;
	public double luong;
	public String getMaCN() {
		return maCN;
	}
	public void setMaCN(String maCN) {
		this.maCN = maCN;
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public int getMaSoSP() {
		return maSoSP;
	}
	public void setMaSoSP(int maSoSP) throws Exception {
		if(maSoSP>0) {
			this.maSoSP = maSoSP;
		}
		else {
			throw new Exception("so san pham phai lon hon 0");
		}
	}
	public CongNhan(String maCN, String mHo, String mTen, int maSoSP) throws Exception {
		super();
		this.maCN = maCN;
		this.mHo = mHo;
		this.mTen = mTen;
		setMaSoSP(maSoSP);
	}
	public CongNhan(String maCN) {
		super();
		this.maCN = maCN;
	}
	
	@Override
	public String toString() {
		return "CongNhan [maCN=" + maCN + ", mHo=" + mHo + ", mTen=" + mTen + ", maSoSP=" + maSoSP + ", Luong: "+luong;
	}
	
}
