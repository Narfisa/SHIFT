package ftc.shift.sample.models;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class User {
    @ApiModelProperty(value = "Номер телефона пользователя = уникальный идентификатор", required = true)
    public String phone;

    @ApiModelProperty(value = "Имя пользователя", required = true)
    public String name;

    @ApiModelProperty(value = "Название изображения", required = true)
    public String image;

    public User() {
    }

    public User(String phone, String name, String image) {
        this.name = name;
        this.phone = phone;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String author) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
