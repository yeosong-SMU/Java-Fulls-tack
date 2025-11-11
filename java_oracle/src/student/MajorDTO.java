package student;

public class MajorDTO {
	private int majorno;
	private String mname;

	public int getMajorno() {
		return majorno;
	}

	public void setMajorno(int majorno) {
		this.majorno = majorno;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	@Override
	public String toString() {
		return "MajorDTO [majorno=" + majorno + ", mname=" + mname + "]";
	}

	public MajorDTO(int majorno, String mname) {
		super();
		this.majorno = majorno;
		this.mname = mname;
	}

	public MajorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
}
