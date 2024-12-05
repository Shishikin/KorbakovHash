package org.example;



import com.google.common.collect.Lists;
import com.google.common.hash.Hashing;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        List<String>  passwords = Lists.newArrayList("08122988399",
                "nampoly2537",
                "lasabre97",
                "as534031",
                "Victor_",
                "16MSTF68AYSL",
                "hhrule",
                "cpt704242",
                "gracemac",
                "rayas123123"
        );
        List<String>  md5 = Lists.newArrayList();
        List<String>  sha256 = Lists.newArrayList();
        List<String>  bcrypt = Lists.newArrayList();
        for (String password : passwords)
        {
            md5.add(Hashing.md5().hashString(password, StandardCharsets.UTF_8).toString());
            sha256.add(Hashing.sha256().hashString(password, StandardCharsets.UTF_8).toString());
            bcrypt.add(BCrypt.hashpw(password, "$2b$15$NSVH/I.9u1l/WoYUd/sSI."));

        }
        System.out.println(md5);
        System.out.println(sha256);
        System.out.println(bcrypt);
    }
}

