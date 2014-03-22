package maxPointsOnALine;

/**
 * Created by shaojie on 14-3-22.
 * y = kx+ c
 * <p/>
 * y1 = k(x1) + c;
 * y2 = k(x2) + c;
 * <p/>
 * a = x2- x1;
 * b = y2 - y1;
 * k = b/a;
 * <p/>
 * c = y1 - b/a*(x1)
 * ca  = y1*a - b*(x1);
 * <p/>
 * y(n)*a = b*x(n) + c;
 */
public class Solution {

    public int maxPoints(Point[] points) {
        if (points.length < 3) {
            return points.length;
        }
        int count = 0;
        int max = 0;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + i; j < points.length; j++) {
                int sign = 0;
                int a = 0;
                int b = 0;
                int c = 0;
                if (points[i].x == points[j].x) {
                    sign = 1;
                } else {
                    a = points[j].x - points[i].x;
                    b = points[j].y - points[i].y;
                    c = a * points[i].y - b * points[i].x;
                }
                int len = 0;
                for (int k = 0; k < points.length; k++) {
                    if (0 == sign && a * points[k].y == c + b * points[k].x || (1 == sign && points[k].x == points[j].x)) {
                        len++;
                    }
                }
                if (len > max) {
                    max = len;
                }
            }
        }
        return max;
    }
}


class Point {
    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }
}
