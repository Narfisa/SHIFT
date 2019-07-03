package ftc.shift.sample.repositories;

import ftc.shift.sample.models.User;

import java.util.List;

/**
 * Интерфейс для получения данных юзеров
 */
public interface UserRepository {

    User getOne(String phone);

    User update(String phone, String name, String image);

    void delete(String phone);

    User create(String phone, String name, String image);

    List<User> getAll();
}