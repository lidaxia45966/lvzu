package com.lvzu.dao;

import com.lvzu.common.Page;
import com.lvzu.model.User;

/**
 * User: lianghongbin
 * Date: 13-9-10
 * Time: 下午11:19
 * Description:
 */
public interface FollowerDao extends BaseDao<User> {

    /**
     * 添加一个关注
     * @param userId 添加者ID
     * @param followerId 被关注者ID
     * @return 影响条数
     */
    public int insert(int userId, int followerId);

    /**
     * 删除一个关注
     * @param userId 操作者ID
     * @param followerId 被关注者ID
     * @return 影响条数
     */
    public int delete(int userId, int followerId);

    /**
     * 根据用户ID查找所有该ID的关注者
     * @param userId 用户ID
     * @return 关注者列表
     */
    public Page<User> selectFollowers(Page<User> page, int userId);

    /**
     * 根据关注者ID查找其所关注的用户
     * @param followerId 关注者ID
     * @return 关注列表
     */
    public Page<User> selectUsers(Page<User> page, int followerId);
}
