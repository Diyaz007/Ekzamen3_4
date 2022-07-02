public class Main {
    public static void main(String[] args) {
        Clothes jeans = new Pants();
        jeans.getRightPocket().AddObject(new Money());
        jeans.getLeftPocket().AddObject(new Coins());
        jeans.getLeftPocket().AddObject(new Key());
        System.out.println(jeans);
    }
}
