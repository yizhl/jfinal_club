package win.yulongsun.jfinal_club.model;

import com.jfinal.plugin.activerecord.Page;
import win.yulongsun.jfinal_club.model.base.BaseUser;

import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class User extends BaseUser<User> {
    public static final User dao = new User();

    public List<User> findByMobile(String user_mobile) {
        return find("select * from user where mobile=?", user_mobile);
    }

    public Page<User> paginateByCId(String c_id, int page_num, int page_size) {
        return paginate(page_num, page_size, "SELECT *", "FROM `user` WHERE c_id = ? and is_enable !=0 and job_id !=1", c_id);
    }
}
