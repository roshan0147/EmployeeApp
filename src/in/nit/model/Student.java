package in.nit.model;

public class Student {
	
	
	private Integer sId;
	private String sName;
	private String sAddress;
	private Double sSal;
	private Long sMobile;
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public Double getsSal() {
		return sSal;
	}
	public void setsSal(Double sSal) {
		this.sSal = sSal;
	}
	public Long getsMobile() {
		return sMobile;
	}
	public void setsMobile(Long sMobile) {
		this.sMobile = sMobile;
	}
	public Student(Integer sId, String sName, String sAddress, Double sSal, Long sMobile) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAddress = sAddress;
		this.sSal = sSal;
		this.sMobile = sMobile;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAddress=" + sAddress + ", sSal=" + sSal + ", sMobile="
				+ sMobile + "]";
	}
	
	

}
