package day11.test.p_18;
//18번
public class ShopService {
    private static ShopService service;

    private ShopService(){}
    public static ShopService getInstance() {
        if(service == null) {
            service = new ShopService();
        }
        return service;
    }
}
