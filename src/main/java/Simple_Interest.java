
public class Simple_Interest extends Interest{
	public Simple_Interest(double principle,double time,double rate)
	{
		super(principle,time,rate);
	}
	public double calculate_interest ()
    {
        return (principle*time*rate_of_interest)/100;
    }
}
