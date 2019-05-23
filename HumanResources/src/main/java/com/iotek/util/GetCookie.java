package com.iotek.util;

import javax.servlet.http.Cookie;

public class GetCookie {
    public static Cookie getCookie(Cookie[] cookies, String key) {
        for (Cookie cookie : cookies) {
            if (key.equals(cookie.getName())) {
                return cookie;
            }
        }
        return null;
    }
}