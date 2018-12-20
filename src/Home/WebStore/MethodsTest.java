package Home.WebStore;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import Home.WebStore.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MethodsTest {

    @Test
    void TestUserCheck() {

        String login="login";
        String pass = "pass";
        String bDay = "2000-01-01";
        Map<Integer,User> userMap = new HashMap<>();
        Methods methods = new Methods();
        userMap.put(1,new User(login,pass.hashCode(),bDay));
        boolean expected = true;
        assertEquals(expected,methods.userCheck(login,pass,userMap));

    }

    @Test
    void TestLoginCheck() {
        Map<Integer,User> userMap = new HashMap<>();
        Methods methods = new Methods();
        String login="login";
        String newLogin = "newlogin";
        String pass = "pass";
        String bDay = "2000-01-01";
        boolean expected = true;
        userMap.put(1,new User(login,pass.hashCode(),bDay));
        assertEquals(expected,methods.loginCheck(newLogin,userMap));
    }

//    @Test
//    void orderListID() {
//        List<Integer> list = new LinkedList<>();
//        Methods methods = new Methods();
//        when(methods.orderListID()).thenReturn(new LinkedList<>());
//        assertEquals(list,methods.orderListID());
//    }

}