package cart.md5;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
import sun.misc.BASE64Encoder;
/*
 * This is the encryption class of password.
 *
 * @author From internet
 * created on Dec 10, 2018
 */
public class MD5 {
   /**
    * This method used to calculate hash value of password.
    * @param str
    * @return
    * @throws NoSuchAlgorithmException
    * @throws UnsupportedEncodingException
    */
  public String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException{
    //确定计算方法
    MessageDigest md5=MessageDigest.getInstance("MD5");
    BASE64Encoder base64en = new BASE64Encoder();
    //加密后的字符串
    String newstr=base64en.encode(md5.digest(str.getBytes("utf-8")));
    return newstr;
  }
   
/**
 * Judged the password whether correct
 * @param newpasswd
 * @param oldpasswd
 * @return
 * @throws NoSuchAlgorithmException
 * @throws UnsupportedEncodingException
 */
  public boolean checkpassword(String newpasswd,String oldpasswd) throws NoSuchAlgorithmException, UnsupportedEncodingException{
    if(EncoderByMd5(newpasswd).equals(oldpasswd))
      return true;
    else
      return false;
  }
}
