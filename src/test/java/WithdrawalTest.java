import org.example.Deposit;
import org.example.Withdrawal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

    //   Testing methods:
//    Withdrawal:

    public class WithdrawalTest {
        Withdrawal withdrawal;

        @BeforeEach
        public void construct1() {
            withdrawal = new Withdrawal();
        }

        @Test
        public void canWithdraw() {
            int actual = withdrawal.updatedBalance(10, 90);
            int expected = -80;
            assertThat(actual).isEqualTo(expected);

        }
}

