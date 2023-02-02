public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int stat() {
        if (sales.length != 0) {
            int st = 0;
            int max = 0;
            int min = 0;
            for (int sale : sales) {
                if (sale > max) {
                    max = sale;
                }
                if (sale < min) {
                    min = sale;
                }
                st += sale;
            }
            st = (st - max - min) / sales.length;
            return st;
        }
        return 0;
    }

    public static void main(String[] args){
        int arr[]={10, 12, 15, 42, 1};
        SalesManager sm=new SalesManager(arr);
        System.out.println(sm.stat());
    }
}