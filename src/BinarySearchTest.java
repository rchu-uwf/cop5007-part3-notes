import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    @Test
    @DisplayName("Test BinarySearch with integers.")
    void test() {
        Integer[] list = {12, 13, 19, 23, 39, 498, 583, 679, 1001, 1003};

        int index = BinarySearch.getIndex(list, 0, list.length-1, 12);
        assertEquals(0,index);

        index = BinarySearch.getIndex(list, 0, list.length-1, 39);
        assertEquals(4,index);

        index = BinarySearch.getIndex(list, 0, list.length-1, 1003);
        assertEquals(9,index);

        index = BinarySearch.getIndex(list, 0, list.length-1, 999);
        assertEquals(-1,index);
    }

    @Test
    @DisplayName("Test BinarySearch with strings.")
    void test2() {
        String[] list = {"ambrosia", "cosmic crisp", "fuji", "golden delicious", "granny smith", "honey crisp","red delicous", "rome"};

        int index = BinarySearch.getIndex(list, 0, list.length-1, "granny smith");
        assertEquals(4,index);

        index = BinarySearch.getIndex(list, 0, list.length-1, "black");
        assertEquals(-1,index);
    }

}