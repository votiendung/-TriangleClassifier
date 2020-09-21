import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("2,2,2")
    void testTriangularClassification1() {
        int edgeA = 2;
        int edgeB = 2;
        int edgeC = 2;
        String expected = "tam giac deu";
        String result = TriangleClassifier.triangularClassification(edgeA, edgeB, edgeC);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("2,2,3")
    void testTriangularClassification2() {
        int edgeA = 2;
        int edgeB = 2;
        int edgeC = 3;
        String expected = "tam giac can";
        String result = TriangleClassifier.triangularClassification(edgeA, edgeB, edgeC);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("3,4,5")
    void testTriangularClassification3() {
        int edgeA = 3;
        int edgeB = 4;
        int edgeC = 5;
        String expected = "tam giac thuong";
        String result = TriangleClassifier.triangularClassification(edgeA, edgeB, edgeC);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("8,2,3")
    void testTriangularClassification4() {
        int edgeA = 8;
        int edgeB = 2;
        int edgeC = 3;
        String expected = "khong phai la tam giac";
        String result = TriangleClassifier.triangularClassification(edgeA, edgeB, edgeC);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("-1,2,1")
    void testTriangularClassification5() {
        int edgeA = -1;
        int edgeB = 2;
        int edgeC = 1;
        String expected = "khong phai la tam giac";
        String result = TriangleClassifier.triangularClassification(edgeA, edgeB, edgeC);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("0,2,1")
    void testTriangularClassification6() {
        int edgeA = 0;
        int edgeB = 2;
        int edgeC = 1;
        String expected = "khong phai la tam giac";
        String result = TriangleClassifier.triangularClassification(edgeA, edgeB, edgeC);
        assertEquals(expected, result);
    }


}