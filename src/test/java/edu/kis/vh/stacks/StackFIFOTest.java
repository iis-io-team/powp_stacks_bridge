package edu.kis.vh.stacks;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class StackFIFOTest {

    final private int ANY_VALUE = 12;

    @Test
    public void shouldPopElement() throws Exception {
        //given:
        final StackFIFO stackFIFO = new StackFIFO();
        stackFIFO.push(ANY_VALUE);

        //when:
        int result = stackFIFO.pop();

        //then:
        assertThat(result, is(ANY_VALUE));
    }

    @Test
    public void shouldStackBeEmptyAfterPop() throws Exception {
        //given:
        final StackFIFO stackFIFO = new StackFIFO();
        stackFIFO.push(ANY_VALUE);

        //when:
        stackFIFO.pop();

        //then:
        assertThat(stackFIFO.isEmpty(),is(true));
    }
}