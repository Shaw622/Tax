package sample;

public class Tax {

    public static void main(String[] args) {
        int price = 1000;
        int tax;
        tax = taxCal(price);

        int all = price + tax;

        System.out.println(price + "円の商品の税込価格は"+ all +"（消費税は"+ tax +"円）です。");
    }

    public static int taxCal(double price) {
        double tax = price * 0.08;
        return (int)tax;
    }

}
