package exam.e4;

public class TestEmp {

	public static void main(String[] args) {
		
		Employee E1 = new Employee(1,"LTS",50000);
		manager E2 = new manager(0,"LTS2",100000,10000);
		
		System.out.printf("員工編號:%d 員工姓名:%s 員工薪水%d%n",E1.getEmpno(),E1.getName(),E1.getSalary());
		System.out.printf("經理編號:%d 經理姓名:%s 經理薪水%d%n",E2.getEmpno(),E2.getName(),E2.getSalary());
		
	}

}
