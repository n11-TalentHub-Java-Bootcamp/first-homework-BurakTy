package Applications;

import entityService.ProductEntityService;

public class FindCommentByProductId {

    public static void main(String[] args) {


        ProductEntityService productEntityService=new ProductEntityService();

        System.out.println("***************** Product, Comment and User ");
        var productList=productEntityService.findCommentByProductId(2L);
        for ( var comm: productList) {
            System.out.println(comm);
        }

    }
}