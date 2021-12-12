package dao;

import base.BaseDao;
import dto.ProductCommentCountDto;
import dto.ProductCommentDto;
import dto.ProductDetailDto;
import dto.UserCommentDto;
import entity.Product;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.List;

public class UserDao extends BaseDao {

//     Ödev  -4 Kullanıcı ve yapmış olduğu yorumları döndüren metot
    public List<UserCommentDto> findUserCommentDto(Long userId) {
        String sql = " select " +
                " new dto.UserCommentDto(comment.user.id, comment.user.firstName , comment.user.lastName ,comment.product.name," +
                "comment.comment,comment.commentDate ) " +
                " from ProductComment comment " +
                "where comment.user.id =:userId" ;

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("userId",userId);

        return query.list();
    }
}
