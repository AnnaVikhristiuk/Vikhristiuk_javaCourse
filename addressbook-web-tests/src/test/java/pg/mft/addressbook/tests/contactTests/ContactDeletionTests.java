package pg.mft.addressbook.tests.contactTests;

import org.testng.annotations.Test;
import pg.mft.addressbook.model.ContactData;
import pg.mft.addressbook.tests.TestBase;


public class ContactDeletionTests extends TestBase {


    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().goToHomePage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getNavigationHelper().goToContactCreationPage();
            app.getContactHelper().createContact(new ContactData("Иван", "Иванович", "Иванов", "ivanov", "Test", "Test", "Test", "324516", "789876", "879865", "453231", "test@test.ru", "test@test.ru", "test@test.ru", "http://test.ru", "6", "7", "1972", null, "Test", "Test", "Test"), true);
            app.getNavigationHelper().goToHomePage();
        }
        app.getContactHelper().selectContacts();
        app.getContactHelper().deleteSelectedContacts();
        app.getNavigationHelper().goToHomePage();
    }

}
