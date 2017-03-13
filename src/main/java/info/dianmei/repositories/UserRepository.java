package info.dianmei.repositories;

import info.dianmei.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lout on 2017/3/13.
 */
public interface UserRepository extends JpaRepository<User, Integer>{

    User findByLoginName(String loginName);
}
