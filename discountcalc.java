public class discountcalc {
    public static void main(String[] args) {
        double originalPrice = 1000.0;
        double discountPercentage = 15.0;

        double discountAmount = (discountPercentage / 100) * originalPrice;
        double finalPrice = originalPrice - discountAmount;

        System.out.println("Original Price: $" + originalPrice);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Final Price after Discount: $" + finalPrice);
    }
}
