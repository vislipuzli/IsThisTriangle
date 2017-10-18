public class IsThisTriangle {



    public static void main(String[] args) {

        Integer getApexX1 = 2;
        Integer getApexY1 = 1;
        Integer getApexX2 = 2;
        Integer getApexY2 = 6;
        Integer getApexX3 = 5;
        Integer getApexY3 = 5;

        Double sideAB = Math.pow(getApexY2 - getApexY1, 2) + Math.pow(getApexX2 - getApexX1, 2);
        Double sideBC = Math.pow(getApexY3 - getApexY2, 2) + Math.pow(getApexX3 - getApexX2, 2);
        Double sideCA = Math.pow(getApexY3 - getApexY1, 2) + Math.pow(getApexX3 - getApexX1, 2);

        if ((sideAB + sideBC) == sideCA || (sideCA + sideBC) == sideAB || (sideAB + sideCA) == sideBC) {
            System.out.println("This is SquareApex Triangle");
        }

        else{
            System.out.println("This isn't SquareApex Triangle");
        }
    }
}
