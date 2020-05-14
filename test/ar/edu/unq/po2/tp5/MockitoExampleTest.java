package ar.edu.unq.po2.tp5;

 import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
//import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

//@ExtendWith(MockitoExtension.class)
public class MockitoExampleTest {
    List mockedList = new ArrayList();

    //@Mock
    //private List list;

    @Test
    public void shouldFailIfI_Enable_Mockito() {
        mockedList.add("in");
        mockedList.clear();
//        verify(mockedList).add("in");
//        verify(mockedList).clear();
        //list.add(100);
        assertTrue(true);
    }

}
