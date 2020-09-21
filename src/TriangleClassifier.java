public class TriangleClassifier {
    public static String triangularClassification(int edgeA, int edgeB, int edgeC) {
        String result = "";
        if (edgeA == edgeB) {
            if (edgeA == edgeC) {
                result = "tam giac deu";
            } else result = "tam giac can";
        } else if (isTriangle(edgeA, edgeB, edgeC)) {
            result = "tam giac thuong";
        } else result = "khong phai la tam giac";
        return result;
    }

    public static boolean isTriangle(int edgeA, int edgeB, int edgeC) {
        boolean result = false;
        if (edgeA > 0 && edgeB > 0 && edgeC > 0) {
            result = (edgeA + edgeB > edgeC) && ((edgeA + edgeC) > edgeB) && ((edgeB + edgeC) > edgeA);
        }
        return result;

    }

}
