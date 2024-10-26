import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalysisTest {

    @Test
    void testAnalyze() {
        Analysis a = new Analysis();
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {-2,-1,3,4,5};
        int[] arr3 = {-6,-5,-4,-3,-2};
        int[] arr4 = {0,1};
        int[] arr5 = {2};
        int[] arr6 = {};

        assertArrayEquals(new int[]{1, 4, 9, 16, 25}, a.analyze(arr1));
        assertArrayEquals(new int[]{1, 4, 9, 16, 25}, a.analyze(arr2));
        assertArrayEquals(new int[]{4, 9, 16, 25, 36}, a.analyze(arr3));
        assertArrayEquals(new int[]{0, 1}, a.analyze(arr4));
        assertArrayEquals(new int[]{4}, a.analyze(arr5));
        assertArrayEquals(new int[]{}, a.analyze(arr6));
    }
}