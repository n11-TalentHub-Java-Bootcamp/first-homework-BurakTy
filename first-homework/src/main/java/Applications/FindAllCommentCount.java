package Applications;

import entityService.ProductEntityService;

public class FindAllCommentCount {

    public static void main(String[] args) {


        ProductEntityService productEntityService=new ProductEntityService();

        System.out.println("***************** All Product Comment Count");
        var productCommentCountList=productEntityService.findAllCommentCount();
        for ( var comm: productCommentCountList) {
            System.out.println(comm);
        }

    }
}