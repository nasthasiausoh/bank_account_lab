import org.example.Deposit;
import org.example.Interest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//   Testing methods:
//    Interest - a method to allow the account to pay interest:

public class InterestTest {
    Interest interest;

    @BeforeEach
    public void construct1() {
        interest = new Interest();
    }

    @Test
    public void canInterest() {
        double actual = interest.updatedBalance(100, 0.20);
        double expected = 120;
        assertThat(actual).isEqualTo(expected);

    }
}