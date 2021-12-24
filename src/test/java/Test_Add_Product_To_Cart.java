import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Add_Product_To_Cart extends BaseTest{

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    ControlPage controlPage;

    @Test
    @Order(1)
    public void control_product(){
        controlPage = new ControlPage(driver);
        controlPage.control();

        Assertions.assertTrue(controlPage.isOnControlPage(),
                "Hesabim sayfasinda degiliz");
    }
    @Test
    @Order(2)
    public void search_product(){
    homePage = new HomePage(driver);
    productsPage = new ProductsPage(driver);

    homePage.searchBox().search("pantolan");
    Assertions.assertTrue(productsPage.isOnProductPage(),
           "Urunler Sayfasinda degiliz" );
    }
    @Test
    @Order(3)
    public void select_product(){
    productDetailPage = new ProductDetailPage(driver);
    productsPage.selectProduct(1);
    Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
            "Urun detayi sayfasinda degiliz");
    }
    @Test
    @Order(4)
    public void add_product_to_cart(){

    productDetailPage.addToCart();
    Assertions.assertTrue(homePage.isProductCountUp(),
            "Urun sayisi deyismedi");
    }
    @Test
    @Order(5)
    public void go_to_cart(){
    cartPage = new CartPage(driver);
    homePage.goToCart();
    Assertions.assertTrue(cartPage.checkIfProductAdded(),
                "Urun sepete eklenmedi!");

    }
}
