package behavioural.templatemethod.pattern;

public class UserFormValidator extends Validator {

	@Override
	protected void doDatabaseValidation() {

		System.out.println("Doing database validation for User");
	}

	@Override
	protected void doBusinessRulesValidation() {

		System.out.println("Doing business rules validation for User");
	}

	@Override
	protected void doInputValidation() {

		System.out.println("Doing input validation for User");
	}

	@Override
	protected boolean isValidationRequired() {
		
		return true;
	}

}
