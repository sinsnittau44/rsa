package rsa;

import java.math.BigInteger;

public class rsa {
    public static void main(String[] args) {
        // 给定的公钥 e 和 n
        BigInteger e = new BigInteger("31");
        BigInteger n = new BigInteger("3599");

        // 计算欧拉函数Φ(n)
        BigInteger p = new BigInteger("59");
        BigInteger q = new BigInteger("61");
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));

        // 使用扩展欧几里得算法求解私钥 d
        BigInteger d = e.modInverse(phi);

        System.out.println("Private key: " + d);
    }
}