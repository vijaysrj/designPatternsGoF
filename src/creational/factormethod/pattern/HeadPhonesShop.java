package creational.factormethod.pattern;

public interface HeadPhonesShop {

	HeadPhones createHeadPhone();

	default void sellHeadPhone() {

		HeadPhones headPhone = createHeadPhone();

		System.out.println("Rate of HeadPhone" + headPhone.getRate());

		System.out.println("Packing and Delivering..");

	}

}
