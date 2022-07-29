package springIntro;

public class CustomerManager implements ICustomerService{
	private ICustomerDal customerDal;
	/*constructor injection
	 * public CustomerManager(ICustomerDal customerDal) {
		super();
		this.customerDal = customerDal;
	}*/
	
	public ICustomerDal getCustomerDal() {
		return customerDal;
	}

	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	@Override
	public void add() {
		customerDal.add();
	}
}
