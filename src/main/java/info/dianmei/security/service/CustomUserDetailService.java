package info.dianmei.security.service;

import info.dianmei.entity.Role;
import info.dianmei.entity.User;
import info.dianmei.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.security.RolesAllowed;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by lout on 2017/3/13.
 */
@Service
public class CustomUserDetailService implements UserDetailsService{

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String loginName) throws UsernameNotFoundException {
        User user = userRepository.findByLoginName(loginName);
        if(user == null) throw new UsernameNotFoundException("User not find");
        return new org.springframework.security.core.userdetails.User(
                user.getLoginName(),
                user.getPassword(),
                getAuthorities(user));
    }


    private Collection<? extends GrantedAuthority> getAuthorities(User user){
        Set<String> userRoles = new HashSet<>();
        List<Role> roles = user.getRoles();
        for(Role role : roles){
            userRoles.add(role.getName());
        }
        String[] roleNames = new String[userRoles.size()];
        Collection<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(userRoles.toArray(roleNames));
        return authorities;
    }
}
