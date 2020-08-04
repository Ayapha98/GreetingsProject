package commands;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetTest {

    @Test
    void shouldTestGreetMethod(){
        Greet greet = new Greet();
        assertEquals( "Hello, Ayapha", greet.greet("Ayapha", "English"));
    }

    @Test
    void shouldTestGreetMethod2(){
        Greet greet = new Greet();
        assertEquals("Please enter a language", greet.greet(null, null));
    }

    @Test
    void shouldTestGreetMethodInSwahili(){
        Greet greet = new Greet();
        assertEquals( "Jambo, Ayapha", greet.greet("Ayapha", "Swahili"));
    }
}