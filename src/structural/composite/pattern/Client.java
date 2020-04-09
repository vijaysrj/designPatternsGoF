package structural.composite.pattern;

public class Client {

	public static void main(String a[]) {

		IndividualEmployee serviceDeveloper1 = new IndividualEmployee("Kavin");

		serviceDeveloper1.setCostToCompany(50000);

		IndividualEmployee serviceDeveloper2 = new IndividualEmployee("Murali");

		serviceDeveloper2.setCostToCompany(60000);

		IndividualEmployee tester1 = new IndividualEmployee("Kiran");

		tester1.setCostToCompany(40000);
		IndividualEmployee tester2 = new IndividualEmployee("Ayisha");

		tester2.setCostToCompany(35000);

		IndividualEmployee uiDeveloper1 = new IndividualEmployee("Vinitha");

		uiDeveloper1.setCostToCompany(70000);
		IndividualEmployee uiDeveloper2 = new IndividualEmployee("Agalya");

		uiDeveloper2.setCostToCompany(85000);

		EmployeeTeam serviceDevelopmentTeam = new EmployeeTeam("Service Development Team");

		serviceDevelopmentTeam.add(serviceDeveloper1);
		serviceDevelopmentTeam.add(serviceDeveloper2);

		EmployeeTeam uiDevelopmentTeam = new EmployeeTeam("UI Development Team");

		uiDevelopmentTeam.add(uiDeveloper1);
		uiDevelopmentTeam.add(uiDeveloper2);

		EmployeeTeam qaTeam = new EmployeeTeam("QA team");

		qaTeam.add(tester1);
		qaTeam.add(tester2);
		
		
		
		EmployeeTeam developmentTeam = new EmployeeTeam("Development Team");
		developmentTeam.add(serviceDevelopmentTeam);
		developmentTeam.add(uiDevelopmentTeam);
		
		
		IndividualEmployee businessAnalyst = new IndividualEmployee("Rama");
		businessAnalyst.setCostToCompany(60000);
		
		EmployeeTeam entireTeam = new EmployeeTeam("Entire team");
		entireTeam.add(developmentTeam);
		entireTeam.add(qaTeam);
		entireTeam.add(businessAnalyst);
		
		
		System.out.println("Total Cost to Company: "+entireTeam.getCostToCompany());

	}

}
