package day37_exceptions;

import day36_polymorphisim.Circle;

public class TestPizzaObject {
    public static void main(String[] args) {
        Pizza p1 = new Pizza('S', 2, 3);
        Pizza p2 = new Pizza('S', 2,3);


        System.out.println(p1 == p2);//false

        System.out.println(p1.equals(p2));//true
//Original equals method gives false result. That's why we have to override the original equal method


        Object obj = new Pizza('S', 4, 3);
        //upcasting-implicitly casting

        boolean r = obj.equals(p2);
        System.out.println(r);

        double total = ((Pizza)obj).calcCost(); //downcasting - to reach function of Pizza

        System.out.println(total);

       // double area= ((Circle)obj).area();////down casting to reach functions of Circle
//NO ERROR but ClassCastException after run==> no IS A relation between Pizza and Circle (obj referencing to Pizza)

        //System.out.println(area);

    }
}
