import org.example.pages.TextBoxPage;
import org.junit.Test;

public class TestCase {
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    public void test_1() {
        final String name = "Tikhonenko Evgeniy";
        final String email = "tikhonenko@mail.com";
        final String currentAddress = "Pattaya, Thailand, Soi 4, Siam Oriental Plaza";
        final String permanentAddress = "Moscow, Russia, Lenina 26";

        textBoxPage
                .openPage()
                .fillFieldFullName(name)
                .fillFieldEmail(email)
                .fillAreaCurrentAddress(currentAddress)
                .fillAreaPermanentAddress(permanentAddress)
                .clickSubmit()

                .checkLabelFullName("Name:" + name)
                .checkLabelEmail("Email:" + email)
                .checkLabelCurrentAddress("Current Address :" + currentAddress)
                .checkLabelPermanentAddress("Permananet Address :" + permanentAddress);
    }
}
