import org.example.Deposit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//   Testing methods:
//    Deposit:

public class DepositTest {
    Deposit deposit;

    @BeforeEach
    public void construct() {
        deposit = new Deposit();
    }

    @Test
    public void canDeposit() {
        double actual = deposit.updatedBalance(10.1, 90);
        double expected = 100.1;
        assertThat(actual).isEqualTo(expected);

    }
}