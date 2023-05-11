package pe.edu.cibertec.appFormularioParteII.model;

 
public class Promedio {
	
	private Integer cl1;
	private Integer cl2;
	private Integer cl3;
	private Integer sp;
	
	
	
	public Promedio(Integer cl1, Integer cl2, Integer cl3, Integer sp) {
		super();
		this.cl1 = cl1;
		this.cl2 = cl2;
		this.cl3 = cl3;
		this.sp = sp;
	}
	public Integer getCl1() {
		return cl1;
	}
	public void setCl1(Integer cl1) {
		this.cl1 = cl1;
	}
	public Integer getCl2() {
		return cl2;
	}
	public void setCl2(Integer cl2) {
		this.cl2 = cl2;
	}
	public Integer getCl3() {
		return cl3;
	}
	public void setCl3(Integer cl3) {
		this.cl3 = cl3;
	}
	public Integer getSp() {
		return sp;
	}
	public void setSp(Integer sp) {
		this.sp = sp;
	}

	public Integer notaFinal() {
		return (cl1 + cl2 + cl3 + sp) / 4;
	}
}
