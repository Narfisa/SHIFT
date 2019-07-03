package ftc.shift.sample.repositories;

import ftc.shift.sample.exception.NotFoundException;
import ftc.shift.sample.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализиция, хранящая все данные в памяти приложения
 */
@Repository
public class UserQueries implements UserRepository{

    private Integer count = -1;
    private List<User> Users = new ArrayList<>();

    @Autowired
    public UserQueries(){
        Users.add(++count, new User("89135895600", "Валя", "some url"));
        Users.add(++count, new User("89135895601", "Катя", "some url"));
        Users.add(++count, new User("89135895602", "Настя", "some url"));
    }

    @Override
    public List<User> getAll(){
        if (Users.isEmpty()){
            throw new NotFoundException();
        }
        return Users;
    }

    @Override
    public User getOne(String phone){
        for (User user : Users){
            if (user.phone.equals(phone))
                return user;
        }
        throw new NotFoundException();
    }

    @Override
    public User update(String oldPhone, String phone, String name, String image){
        for (User user : Users){
            if (user.phone.equals(oldPhone))
            {
                user.phone = phone;
                user.name = name;
                user.image = image;
                return user;
            }
        }
        throw new NotFoundException();
    }

    @Override
    public void delete(String phone){
        boolean key = false;
        for (User user : Users){
            if (user.phone.equals(phone))
            {
                key = true;
                Users.remove(user);
            }
        }
        if (!key)
            throw new NotFoundException();
    }

    @Override
    public User create(String phone, String name, String image){
        Users.add(++count, new User(phone, name, image));
        return Users.get(count);
    }
}