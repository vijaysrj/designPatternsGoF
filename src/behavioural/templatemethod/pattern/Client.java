package behavioural.templatemethod.pattern;

public class Client {

	public static void main(String a[]) {

		Validator productValidator = new ProductFormValidator();
		productValidator.validate();

		System.out.println();
		
		
		Validator userValidator = new UserFormValidator();
		userValidator.validate();

	}
}
