package pe.edu.cibertec.appFormularioParteII.model;

public class Alumno {

	private String codalumno;
	private String nomalumno;
	private String apealumno;
	private String genalumno;

	public Alumno(String codalumno, String nomalumno, String apealumno, String genalumno) {
		super();
		this.codalumno = codalumno;
		this.nomalumno = nomalumno;
		this.apealumno = apealumno;
		this.genalumno = genalumno;
	}

	public String getCodalumno() {
		return codalumno;
	}

	public void setCodalumno(String codalumno) {
		this.codalumno = codalumno;
	}

	public String getNomalumno() {
		return nomalumno;
	}

	public void setNomalumno(String nomalumno) {
		this.nomalumno = nomalumno;
	}

	public String getApealumno() {
		return apealumno;
	}

	public void setApealumno(String apealumno) {
		this.apealumno = apealumno;
	}

	public String getGenalumno() {
		return genalumno;
	}

	public void setGenalumno(String genalumno) {
		this.genalumno = genalumno;
	}

}
