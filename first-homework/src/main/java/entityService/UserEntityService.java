package entityService;

import dao.CategoryDao;
import dao.UserDao;
import dto.UserCommentDto;
import entity.Category;

import java.util.List;

public class UserEntityService {

    private UserDao userDao;
    public UserEntityService() {
        this.userDao=new UserDao();
    }

    public List<UserCommentDto> findUserComment(Long userId){
       return userDao.findUserCommentDto(userId);
    }
}
