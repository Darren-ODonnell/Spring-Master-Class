package mockito.mockitodemo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockAnnotationsTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl businessImpl;


    @Test
    public void testFindTheGreatestFromAllData() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 15,3});
        assertEquals(24, businessImpl.findTheFGreatestFromAllData());
    }

}