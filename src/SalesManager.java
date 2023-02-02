public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long stat() {
        if (sales.length != 0) {
            long st = 0;
            long max = 0;
            long min = 0;
            for (long sale : sales) {
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
        long arr[]={10, 12, 15, 42, 1};
        SalesManager sm=new SalesManager(arr);
        System.out.println(sm.stat());
    }
}