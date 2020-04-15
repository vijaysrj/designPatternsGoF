package behavioural.templatemethod.pattern;

public abstract class Validator {

	public void validate() {

		if (isValidationRequired()) {

			doCommonValidation();
			doInputValidation();
			doBusinessRulesValidation();
			doDatabaseValidation();

		}
	}

	private void doCommonValidation() {

		System.out.println("Performing validation common to all forms");

	}

	protected abstract boolean isValidationRequired();

	protected abstract void doDatabaseValidation();

	protected abstract void doBusinessRulesValidation();

	protected abstract void doInputValidation();
}
