public class ProdTest{
    public static void main(String[] args) {
        Product product = new Product()
                              .new Builder()
                              .setCPU("12 cores")
                              .setRam("32GB")
                              .setGraphicsCard("3050RTX")
                              .build();
    }
}


class Product {
    private String cpu;
    private String ram;
    private String graphicsCard;
    
    public class Builder{
        
        Product product;

        public Builder(Product product){
            this.product = product;
        }
        
        public Builder(){
            this.product = new Product();
        }
        
        public Builder setCPU(String cpu){
            product.cpu = cpu;
            return new Builder(product);
        }
        
        public Builder setRam(String ram){
            product.ram = ram;
            return new Builder(product);
        }
        
        public Builder setGraphicsCard(String graphicsCard){
            product.graphicsCard = graphicsCard;
            return new Builder(product);
        }
        
        public Product build(){
            return product;
        }
        
    }
    
}
