abstract class Employee{
	String name;
	double basic;
	String address;
	Employee(){
		
	}
	Employee(String str,double sal,String addr){
		name=str;
		basic=sal;
		address=addr;
		
	}
	void show(){
		System.out.println("name \t\t\t:"+name);
		System.out.println("Basic \t\t\t"+basic);
		System.out.println("address \t\t\t"+address);
	}
	abstract double totalPay();
	
	double deduction(int leave){
		double lessPay;
		if(leave<=5){
			lessPay=(0.25*basic);
		}
		else
		{
			lessPay=(0.5*basic);
		}
		return lessPay;
	}
}
class Manager extends Employee{
	String department;
	Manager(){
		
	}
	Manager(String str,double sal,String addr,String dept){
		super(str,sal,addr);
		department=dept;
	}
	void show(){
		super.show();
		System.out.println("department \t\t\t"+department);
	}
	double totalPay(){
		double totalAmount=0;
		double houseRentAllowance=(basic*.08);
		double dearnessAllowance=(basic*.3);
		double medicalAllowance=1500;
		totalAmount=basic+houseRentAllowance+dearnessAllowance+medicalAllowance;
		return totalAmount;
	}
}
class Director extends Employee{
	double transportAllowance;
	Director(){
		
	}
	Director(String str, double sal, String addr,double allowance){
		super(str,sal,addr);
		transportAllowance=allowance;
	}
	void show(){
		super.show();
		System.out.println("transport allowance \t\t"+transportAllowance);
	}
	double totalPay(){
		double totalAmount=0;
		double houseRentAllowance=(basic*.20);
		double dearnessAllowance=(basic*0.5);
		double medicalAllowance=4500;
		double entertainmentAllowance=5000;
		totalAmount=basic+houseRentAllowance+dearnessAllowance+medicalAllowance+entertainmentAllowance+transportAllowance;
		return totalAmount;
	}
}
class EmployeePay {
	EmployeePay(){
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mgrObj = new Manager("Henry", 5500.65, "Sydney", "Accounts");
	       double payTotal = mgrObj.totalPay();
	       double less = mgrObj.deduction(5);
	       double netPay = payTotal - less;
	       System.out.println("\nManager Details");
	       System.out.println("===================================");
	       mgrObj.show();
	       System.out.println("Total Pay: \t\t" + payTotal);
	       System.out.println("Net Pay: \t\t" + netPay);
	       Director dirObj = new Director("Stephen", 32400.00, "New York",
	       8000);
	       payTotal = dirObj.totalPay();
	       less = dirObj.deduction(5);
	       netPay = payTotal - less;
	       System.out.println("\n\nDirector Details");
	       System.out.println("============================");
	       dirObj.show();
	       System.out.println("Total Pay: \t\t" + payTotal);
	       System.out.println("Net Pay: \t\t" + netPay);
	}

}
