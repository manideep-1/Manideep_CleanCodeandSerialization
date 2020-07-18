
public class Compound_Interest extends Interest{
	public Compound_Interest(double principle,double time,double rate_of_interest)
    {
        super(principle,time,rate_of_interest);
    }
    public double calculate_compound_interest()
    {
        return (principle+Math.pow((1+rate_of_interest),time));
    }

}
