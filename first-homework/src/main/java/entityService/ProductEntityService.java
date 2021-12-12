package entityService;

import dao.ProductDao;
import dto.ProductCommentCountDto;
import dto.ProductDetailDto;
import dto.ProductCommentDto;
import entity.Product;

import java.util.List;

public class ProductEntityService {

    private ProductDao productDao;

    public ProductEntityService(){
        this.productDao=new ProductDao();
    }

    public List<ProductCommentCountDto> findAllCommentCount(){
        return this.productDao.findAllCommentCount();
    }
    public List<ProductCommentDto> findCommentByProductId(Long productId){
        return this.productDao.findCommentByProductId(productId);
    }


}
