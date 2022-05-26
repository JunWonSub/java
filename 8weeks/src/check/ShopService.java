package check;

public class ShopService {
	private ShopService() {}
	private static ShopService shopservice = new ShopService();
	public static ShopService getInstance() {
		return shopservice;
	}
}
