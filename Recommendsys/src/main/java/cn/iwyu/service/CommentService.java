package cn.iwyu.service;/**
 * Created by Chester on 30/9/2020.
 */

import cn.iwyu.domain.Comment;
import cn.iwyu.domain.CommentCustom;

import java.util.List;

/**
 * @InterfaceName CommentService
 * @Description
 * @Author XiaoMao
 * @Date 30/9/2020 上午10:00
 * @Version 1.0
 **/

public interface CommentService {
    //添加评论
    public void save(Comment comment);
    //查询全部评论
    public List<CommentCustom> findAll();
    //通过用户id查询评论
    public List<CommentCustom> findByUserId(Integer userId);
    //通过餐馆id查询评论
    public List<CommentCustom> findByResId(Integer resId);
    //修改评论
    public int update(Comment comment);
    //删除评论
    public int delete(Integer commId);
}
