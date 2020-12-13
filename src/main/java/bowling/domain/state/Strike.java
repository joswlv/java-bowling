package bowling.domain.state;

import bowling.domain.FallingPinCount;
import java.util.Objects;

public class Strike implements State {

    private static final String STRIKE_MESSAGE = "X  ";
    private final FallingPinCount first;

    public Strike(FallingPinCount first) {
        this.first = first;
    }

    @Override
    public State roll(FallingPinCount fallingPinCount) {
        return this;
    }

    @Override
    public boolean isDone() {
        return true;
    }

    @Override
    public String reportState() {
        return STRIKE_MESSAGE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Strike strike = (Strike) o;
        return Objects.equals(first, strike.first);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first);
    }
}
