package DataObject.Railway;

import Common.Constant.Constant;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Account {
    String email;
    String password;
    String confirmpassword;
    String passport;

    public Account(){
        this.email = Constant.REGISTER_EMAIL;
        this.password = Constant.REGISTER_PASSWORD;
        this.confirmpassword = Constant.REGISTER_PASSWORD;
        this.passport = Constant.REGISTER_PASSPORT;
    }
}
