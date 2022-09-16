public class Main
{
    public static void main(String[] args)
    {
        double summerCost = 1234.55;
        double fallCost = 2345.66;
        double winterCost = 3456.77;
        double springCost = 4567.88;
        double totalCost;

        totalCost = summerCost + fallCost + winterCost + springCost;

        System.out.println("The cost for the summer is " + summerCost);
        System.out.println("The cost for the fall is " + fallCost);
        System.out.println("The cost for the winter is " + winterCost);
        System.out.println("The cost for the spring is " + springCost);
        System.out.println("The cost for the year is " + totalCost);
    }
}