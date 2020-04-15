package behavioural.templatemethod.pattern;

public class ProductFormValidator extends Validator {

	@Override
	protected void doDatabaseValidation() {

		System.out.println("Performing database validation for Product");

	}

	@Override
	protected void doBusinessRulesValidation() {

		System.out.println("Performing business rules validation for Product");

	}

	@Override
	protected void doInputValidation() {

		System.out.println("Performing input validation for Product");
	}

	@Override
	protected boolean isValidationRequired() {
		
		return true;
	}

}
