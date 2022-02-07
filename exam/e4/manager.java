package exam.e4;

public class manager extends Employee{

	private static long bonus = 1;

	public manager(int empno, String name, long salary, long bonus){
		super(empno, name, salary);
		manager.bonus = bonus;
	}	
	
	@Override
	public long getSalary() {
	long all = super.getSalary() + bonus;
		return all;
	}

}
