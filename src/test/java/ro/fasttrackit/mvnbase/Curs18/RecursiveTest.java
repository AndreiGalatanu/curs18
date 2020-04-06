package ro.fasttrackit.mvnbase.Curs18;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.fasttrackit.mvnbase.Recursive;

import static org.assertj.core.api.Assertions.assertThat;

public class RecursiveTest {

    Recursive recusive;

    @BeforeEach
    void setup() {
        recusive = new Recursive();
    }

    @Test
    @DisplayName("If null Then throw exception exception ")
    void ifNullThenException() {
        var exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, ()->recusive.length(null));
        Assertions.assertThat(exception.getMessage()).isEqualTo("word cannot be null");

    }


}
