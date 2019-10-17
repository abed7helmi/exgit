package tp4;

public class Fraction {
	private double numerateur , denominateur ;

	public Fraction(double numerateur , double denominateur)
	{
		this.denominateur=denominateur;
		this.numerateur=numerateur;

	}

	public Fraction(double numerateur)
	{
		this.denominateur=1.0;
		this.numerateur=numerateur;
	}
	
	public Fraction()
	{
		this.numerateur=0.0;
		this.denominateur=1.0;
	}
	
	public String conversionchaine() {
		
		return this.denominateur+"/"+this.numerateur;
		
		
		
		
	}

    public double getNumerateur(){
        return this.numerateur;
    }

    public double getDenominateur(){
        return this.denominateur;
    }

    public double getDouble(){
        return this.numerateur/this.denominateur;
    }
}
