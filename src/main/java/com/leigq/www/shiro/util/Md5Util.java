package com.leigq.www.shiro.util;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.junit.jupiter.api.Test;

/**
 * @author lijy
 * @descriptin
 * @since
 */
public class Md5Util {
    @Test
    public void md5Test() {
        String hashAlgorithName = "MD5";
        String password = "root";
        int hashIterations = 2;
        ByteSource byteSource = ByteSource.Util.bytes("wujiesalt");
        //第一个参数代表加密使用的算法 第二个参数要加密的字符串 第三个参数 加入的盐的值 第四个参数 hash迭代的次2以后再保存用户的密码应该使用加密算法加密
        Object obj = new SimpleHash(hashAlgorithName, password, byteSource, hashIterations);
        System.out.println("加密之后的密码" + obj);
    }
}
