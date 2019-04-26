package com.iiit.action.springcloud.eshop.auth.dao;


import com.iiit.action.springcloud.eshop.common.entity.Member;

/**
 * 〈用户Dao〉
 *
 * @author rengang
 * @create 2018/12/13
 * @since 1.0.0
 */
public interface MemberDao {

    /**
     * 根据会员名查找会员
     * @param memberName 会员名
     * @return 会员
     */
    Member findByMemberName(String memberName);
}
