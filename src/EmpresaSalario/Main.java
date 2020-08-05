package EmpresaSalario;

public class Main {
	
	public static void main(String [] agrs) {
		
		Empleado ofc1 = new Oficinista("1", 500);
		Empleado ofc2 = new Oficinista("2", 500);
		
		Empleado st1 = new SupervisorTecnico("3", 1000, 2);
		Empleado st2 = new SupervisorTecnico("4", 1000, 4);
		
		Empleado gr1 = new Gerente("5", 2000, 2, 100);
		Empleado gr2 = new Gerente("6", 2000, 2, 200);
		
		System.out.println("OFICINISTAS");
		System.out.println("Oficinista 1:" + " " + ofc1.getSalario());
		System.out.println("Oficinista 2:" + " " +ofc2.getSalario());
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("SUPERVISORES TECNICOS");
		System.out.println("Supervisor Tecnico 1:" + " " +st1.getSalario());
		System.out.println("Supervisor Tecnico 2:" + " " +st2.getSalario());
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("GERENTES");
		System.out.println("Gerente 1:" + " " +gr1.getSalario());
		System.out.println("Gerente 2:" + " " +gr2.getSalario());
		
		System.out.println("--------------------------------------------------------------------");
		Empresa empresa = new Empresa();
		empresa.contratar(ofc1);
		empresa.contratar(ofc1);
		empresa.contratar(st1);
		empresa.contratar(st2);
		empresa.contratar(gr1);
		empresa.contratar(gr2);
		
		System.out.println("Total de empleados en la empresa:" + " " + empresa.totalEmpleados());
		System.out.println("Salario total de los trabajadores de la empresa:" + " " +empresa.diaDePago());
		
	}

}
