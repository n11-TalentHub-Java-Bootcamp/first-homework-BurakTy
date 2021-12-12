package dao;

import base.BaseDao;
import dto.ProductCommentCountDto;
import dto.ProductDetailDto;
import dto.ProductCommentDto;
import entity.Product;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.List;

public class ProductDao extends BaseDao {

//     Ödev  -2 Ürün Yorumlarını Dto olarak Döndüren Metot
    public List<ProductCommentDto> findCommentByProductId(Long productId) {
        String sql = " select " +
                " new dto.ProductCommentDto( comment.product.name,comment.product.category.name,comment.product.price," +
                "comment.user.firstName,comment.user.lastName,comment.user.phone,comment.comment,comment.commentDate) " +
                " from ProductComment comment "+
                " where comment.product.id = :productId ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("productId", productId);

        return query.list();
    }


//     Ödev  -3 Ürünler ve Yorum Sayıları
    public List<ProductCommentCountDto> findAllCommentCount() {
        String sql = " select " +
                " new dto.ProductCommentCountDto(product.id,product.name,product.price,count(comment)) " +
                " from Product product " +
                " left join ProductComment comment on comment.product.id=product.id " +
                "group by product.id";

        Query query = getCurrentSession().createQuery(sql);

        return query.list();
    }
}
