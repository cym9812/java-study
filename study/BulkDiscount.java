package study;

public class BulkDiscount extends DiscountBasic {
    private int number;
    private double discount;
    public BulkDiscount(int number, double discount){
        this.number = number;
        this.discount = discount;
    }

    @Override
    public double getDiscount(int count, double itemCost) {
        double result;
        if (count >= number){
            result = itemCost * count * discount / 100;
        }else {
            result = 0.0;
        }
        return result;
    }
}
