package mockito.mockitodemo;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeBusinessMockTest {

    @Test
    public void testFindTheGreatestFromAllData() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 15,3});

        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        int result = businessImpl.findTheFGreatestFromAllData();
        assertEquals(24, result);
    }

}
