package edu.kis.vh.stacks;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class StackHanoiTest {

    private final int ANY_VALUE = 12;

    @Test
    public void shouldPushElement() throws Exception {
        //given:
        StackHanoi stackHanoi = new StackHanoi();

        //when:
        stackHanoi.push(ANY_VALUE);

        //then:
        assertThat(stackHanoi.pop(),is(ANY_VALUE));
    }

    @Test
    public void shouldReturnProperValueOfRejectedElements() throws Exception {
        //given:
        StackHanoi stackHanoi = new StackHanoi();
        final int EXPECTED_VALUE = 0;

        //when:
        int result = stackHanoi.reportRejected();

        //then:
        assertThat(result, is(EXPECTED_VALUE));
    }
}