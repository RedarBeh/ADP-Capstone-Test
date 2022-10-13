package za.ac.cput.Group19CarWash.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import za.ac.cput.Group19CarWash.repository.user.IUserRepository;
import za.ac.cput.Group19CarWash.domain.User;
import za.ac.cput.Group19CarWash.user.MyUserDetail;

public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = iUserRepository.getUserByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("Could not find user");
        }

        return new MyUserDetail(user);
    }
}
