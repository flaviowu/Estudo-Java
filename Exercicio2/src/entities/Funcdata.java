package entities;

public class Funcdata {
	
	public String fn;
	public double sb;
	public double i;
	public double p;
	
	public double sl() {
		return sb-i;
	}
	
	public double sa() {
		return (p*sb/100)+sl();
	}

}
