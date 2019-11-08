import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class Example2Test {
    private Object exampleObject1 = "Object1";
    private Object exampleObject2 = "Object2";
    private String exampleKey1 = "Key1";
    private String exampleKey2 = "Key2";

    public void testPutMethodCheckSize() {
        Example2.hashMap.put(exampleKey1, exampleObject1);

        assertEquals(Example2.hashMap.size(), 1);
    }

    public void testGetMethod() {
        Example2.hashMap.put(exampleKey1, exampleObject1);

        Object getObject = Example2.hashMap.get(exampleKey1);

        assertEquals(getObject, exampleObject1);
    }


    public void testAddingSameKeyOtherObject() {
        //Given
        Example2.hashMap.put(exampleKey1, exampleObject1);

        //When
        Example2.hashMap.put(exampleKey1, exampleObject2);

        //Then
        assertEquals(Example2.hashMap.get(exampleKey1), exampleObject2);
    }

    public void testClearMethodWithNotEmptyMap() {
        //Given
        Example2.hashMap.put(exampleKey1, exampleObject1);
        Example2.hashMap.put(exampleKey2, exampleObject2);

        //When
        Example2.hashMap.clear();

        //Then
        assertEquals(Example2.hashMap.size(), 0);
    }

    public void testClearMethodWithEmptyMap() {
        //Given

        //When
        Example2.hashMap.clear();

        //Then
        assertEquals(Example2.hashMap.size(), 0);
    }

}