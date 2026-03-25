package com.cg.repo;

import com.cg.bean.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBeanRepo extends JpaRepository<UserBean, String> {

}
