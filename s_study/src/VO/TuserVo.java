package VO;

public class TuserVo {
	private int tnum;
	private String tid;
	private String tname;
	private String tpw;
	private String temail;
	private int tgender;
	public TuserVo(int tnum, String tid, String tname, String tpw, String temail, int tgender) {
		super();
		this.tnum = tnum;
		this.tid = tid;
		this.tname = tname;
		this.tpw = tpw;
		this.temail = temail;
		this.tgender = tgender;
	}
	public TuserVo(String tid, String tname, String tpw, String temail, int tgender) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tpw = tpw;
		this.temail = temail;
		this.tgender = tgender;
	}
	public int getTnum() {
		return tnum;
	}
	public void setTnum(int tnum) {
		this.tnum = tnum;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTpw() {
		return tpw;
	}
	public void setTpw(String tpw) {
		this.tpw = tpw;
	}
	public String getTemail() {
		return temail;
	}
	public void setTemail(String temail) {
		this.temail = temail;
	}
	public int getTgender() {
		return tgender;
	}
	public void setTgender(int tgender) {
		this.tgender = tgender;
	}
	
	
	
	
	
}
