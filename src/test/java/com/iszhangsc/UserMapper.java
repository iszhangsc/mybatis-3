package com.iszhangsc;

import java.util.List;

/**
 * <p>
 * mapper
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2020/10/12 10:06 上午
 */
public interface UserMapper {

  /**
   * 用户列表
   *
   * @param id id
   * @return 用户列表
   */
  List<User> userList(Integer id);

}
