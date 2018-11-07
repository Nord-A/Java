package com.osorio;


import DB.DB;

public class LoginController {


    public boolean createUser(String usr, String pwd) {
        if (usr.length() > 0 && pwd.length() > 7) {
            return true;
        } else {
            return false;
        }

    }

    public boolean login(String usr, String pwd) {
        // 1. Kaldt på jeres database klasse, og find ud af om brugeren hedder "ole"
        // alle andre skal ikke komme ind
        // returnér herefter svaret
        // 2. Lav en unit test til login()
        DB db = new DB();
        if (db.navne().equals("ole")) {
            return true;
        } else {
            return false;
        }

    }
}


