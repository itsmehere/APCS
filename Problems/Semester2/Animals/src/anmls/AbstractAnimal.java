package anmls;

import java.util.Date;

public abstract class AbstractAnimal implements Animal{
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Date getBirthday() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public abstract void height();
	
	public int apple() {
		return 0;
	}	
}
