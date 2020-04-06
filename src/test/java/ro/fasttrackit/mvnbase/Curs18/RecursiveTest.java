package ro.fasttrackit.mvnbase.Curs18;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.fasttrackit.mvnbase.Recursive;

public class RecursiveTest {

    Recursive recusive;

    @BeforeEach
    void setup() {
        recusive = new Recursive();
    }

    @Test
    @DisplayName("If null Then throw exception exception ")
    void ifNullThenException() {
        Assertions.assertThat(IllegalArgumentException.class, () -> recusive.lenght(null));

    }
}
