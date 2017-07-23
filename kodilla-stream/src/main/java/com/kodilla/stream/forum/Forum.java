package com.kodilla.stream.forum;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1,"Dylan Murphy",'M',  1985, 6, 9, 1));
        userList.add(new ForumUser(2,"Kimmi Schmidt",'F',  1991, 8, 11, 5));
        userList.add(new ForumUser(3,"Laura Minelli",'F',  1990, 5, 29, 3));
        userList.add(new ForumUser(4,"Daria Moro",'F', 2001, 7, 18, 3));
        userList.add(new ForumUser(5,"Luciano Gonzaga",'M',2003, 1, 1, 0));
        userList.add(new ForumUser(6,"Tomas Thornton", 'M',1958, 2, 26, 34));
        userList.add(new ForumUser(7,"Gerry Dingdong", 'M',  1980, 5, 4, 5));
        userList.add(new ForumUser(8,"Percy McFly", 'M',  1996, 12, 12, 0));
        userList.add(new ForumUser(9,"Bob Barley", 'M', 1971, 3, 23, 0));
        userList.add(new ForumUser(10,"Arnold Marty", 'M',  1988, 7, 30, 21));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
