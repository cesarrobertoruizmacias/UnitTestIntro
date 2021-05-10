package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    //Given_Then_Thas

    @Test
    public void whenANewlistIsCreated_ThenlistIsEmpty(){
        // Given


        // When
        ArrayList<Integer> lista = new ArrayList<>();
        //Then:
        // Aserciones -> asserts
        assertEquals( 0 , lista.getSize());
    }
}
