class product
{
    public int product(int x, int y) {
      return 0;
    } 
    public int product(int x, int y,int z) {
        return 0;
    } 
    public double product(double x, double y) {
        return 0.0;
    } 
    
}

class Main{
    public static void main(String[] args) {
        product p = new product();

        p.product(0, 0);

        p.product(0, 0,0);
        
        p.product(0.0, 0.0);
    }
}