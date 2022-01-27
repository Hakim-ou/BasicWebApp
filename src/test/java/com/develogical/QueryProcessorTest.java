package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutImperial() throws Exception {
        assertThat(queryProcessor.process("Imperial"),
                containsString("university"));
    }

    @Test
    public void knowsAboutUK() throws Exception {
        assertThat(queryProcessor.process("your name"),
                containsString("Kimadil"));
    }

    @Test
    public void knowsLargest1() throws Exception {
        assertThat(queryProcessor.process("largest number"),
                containsString("825"));
    }

    @Test
    public void knows9Plus14() throws Exception {
        assertThat(queryProcessor.process("9 plus 14"),
                containsString("23"));
    }

    @Test
    public void knows13Plus13() throws Exception {
        assertThat(queryProcessor.process("13 plus 13"),
                containsString("26"));
    }

    @Test
    public void knowsPlus3() throws Exception {
        assertThat(queryProcessor.process("4 plus 18"),
                containsString("22"));
    }

    @Test
    public void knowsLargest2() throws Exception {
        assertThat(queryProcessor.process("largest: 627, 72, 66, 71"),
                containsString("627"));
    }

    @Test
    public void knowsLargest3() throws Exception {
        assertThat(queryProcessor.process("largest: 208, 631, 51, 81"),
                containsString("631"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }
}
