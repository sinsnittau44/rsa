题目：

编程实现RSA基本算法。

计算 ：在一个RSA系统中，一个给定用户的公钥 e = 31, n = 3599.求这个用户的私有密钥。 

---

解题思路：

在 RSA 密码体制中，私钥是由两个数字组成的：一个大素数 p 和一个大素数 q。两个大素数 p 和 q 的乘积 n 就是公钥。私钥可以用来解密消息，而公钥可以用来加密消息。

对于给定的公钥 (e, n)，可以使用欧拉函数来求解私钥。欧拉函数 Φ(n) 表示小于 n 的正整数中与 n 互质的数的个数。在 RSA 密码体制中，Φ(n) 可以表示为 (p-1)(q-1)。

所以，可以使用欧拉函数来求解私钥 d，其中 d 满足以下条件：

d * e ≡ 1 (mod Φ(n))

可以使用扩展欧几里得算法来解决这个方程。