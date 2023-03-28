import org.example.BankAccount;
import org.example.Deposit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("Natasha", "Usoh", "29/05/2000");
    }

    //    Testing getters and setters:
    @Test
    public void getterFirstName() {
        String actual = bankAccount.getFirstName();
        String expected = "Natasha";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void setterFirstName() {
        bankAccount.setFirstName("Anna");
        String actual = bankAccount.getFirstName();
        String expected = "Anna";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void getterLastName() {
        String actual = bankAccount.getLastName();
        String expected = "Usoh";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void setterLastName() {
        bankAccount.setLastName("Henderson");
        String actual = bankAccount.getLastName();
        String expected = "Henderson";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void getterDateOfBirth() {
        String actual = bankAccount.getDateOfBirth();
        String expected = "29/05/2000";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void setterDateOfBirth() {
        bankAccount.setDateOfBirth("30/05/2000");
        String actual = bankAccount.getDateOfBirth();
        String expected = "30/05/2000";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void getterAccountNumber() {
        int actual = bankAccount.getAccountNumber();
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void setterAccountNumber() {
        bankAccount.setAccountNumber(1000);
        int actual = bankAccount.getAccountNumber();
        int expected = 1000;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void getterBalance() {
        bankAccount.setBalance(1500);
        double actual = bankAccount.getBalance();
        double expected = 1500;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void setterBalance() {
        bankAccount.setBalance(1500);
        double actual = bankAccount.getBalance();
        double expected = 1500;
        assertThat(actual).isEqualTo(expected);

    }
}

