package mockito.mockitodemo;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeBusinessStubTest {

    @Test
    public void testFindTheGreatestFromAllData() {
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
        int result = businessImpl.findTheFGreatestFromAllData();
        assertEquals(24, result);
    }

}
class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData(){
        return new int[]{24,6,15};
    }
}
