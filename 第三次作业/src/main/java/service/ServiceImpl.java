package service;

public class ServiceImpl implements Service {

	@Override
	public void insert() {
		System.out.println("²åÈë");
	}

	@Override
	public void delete() {
		System.out.println("É¾³ı");
	}

	@Override
	public void update() {
		System.out.println("ĞŞ¸Ä");
	}

	@Override
	public void find() {
		int i = 1 / 0;
		System.out.println("²éÕÒ");
	}

}
