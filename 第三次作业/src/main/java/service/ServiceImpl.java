package service;

public class ServiceImpl implements Service {

	@Override
	public void insert() {
		System.out.println("����");
	}

	@Override
	public void delete() {
		System.out.println("ɾ��");
	}

	@Override
	public void update() {
		System.out.println("�޸�");
	}

	@Override
	public void find() {
		int i = 1 / 0;
		System.out.println("����");
	}

}
