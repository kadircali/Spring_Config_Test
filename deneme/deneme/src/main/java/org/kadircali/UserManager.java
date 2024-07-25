package org.kadircali;

public class UserManager {

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    DataBase dataBase ;
    User user ;

    public void add(){
        //iş kodları burada olacak

        dataBase.add();
    }

}
