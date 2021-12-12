package Applications;

import entityService.ProductEntityService;
import entityService.UserEntityService;

public class FindUserComment {

    public static void main(String[] args) {

        UserEntityService userEntityService=new UserEntityService();
        System.out.println("***************** User All Comments");
        var userCommentList=userEntityService.findUserComment(1L);
        for ( var userComment: userCommentList) {
            System.out.println(userComment);
        }
    }
}