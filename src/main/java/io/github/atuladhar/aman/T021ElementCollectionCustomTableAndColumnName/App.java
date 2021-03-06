package io.github.atuladhar.aman.T021ElementCollectionCustomTableAndColumnName;

import static io.github.atuladhar.aman.HibernateUtil.execute;

import java.util.Arrays;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
class App {

    public static void main(String[] args) {
        execute(
            App.class.getPackage().getName(), session ->
            {
                final User
                    user = new User();
                user.setName("USER");
                user.setAddress(Arrays.asList("a1", "a2", "a3", "a4"));
                session.save(user);
            }, session -> {
                final User user = session.get(User.class, 1L);
                user.getAddress().remove("a1");
            }
        );
    }
}
