/**  
 * All rights Reserved, Designed By yong  
 * @Title:  YCEncrypt.java   
 * @Package onlinestore.util   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: yong     
 * @date:   2015年9月14日 上午11:18:52   
 * @version V1.0     
 */

import java.util.Random;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/**
 * @ClassName: YCEncrypt
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: yong
 * @date: 2015年9月14日 上午11:18:52
 * 
 */
public class YCEncrypt {

	private  byte[] salt;

	public YCEncrypt(byte clipb[]) {
		salt = clipb;
	}

	public YCEncrypt() {
		this(new byte[] { (byte) '玉', (byte) '成', (byte) '软', (byte) '件',
				(byte) '科', (byte) '技', (byte) '公', (byte) '司' });
	}

	// 加密字符串
	public  String encrypt(byte bytes[]) {
		byte[] b = encrypt(bytes, Cipher.ENCRYPT_MODE);
		if (b == null || b.length < 1)
			return null;
		StringBuffer buf = new StringBuffer(b.length * 2);
		Random r = new Random();
		char c;
		for (int i = 0; i < b.length; i++) {
			if (b[i] < -'`') {
				c = (char) (r.nextInt(20) + '!');
				b[i] = (byte) (b[i] + 192);
			} else if (b[i] < 0) {
				c = (char) (r.nextInt(20) + '6');
				b[i] = (byte) (b[i] + '~');
			} else if (b[i] < '$') {
				c = (char) (r.nextInt(20) + 'K');
				b[i] = (byte) (b[i] + '$');
			} else {
				c = (char) (r.nextInt(20) + '`');
			}
			buf.append(c).append((char) b[i]);
		}
		return buf.toString();
	}

	// 解密字符串
	public  byte[] decrypt(String s) {
		if (s.length() < 1)
			return null;
		byte b[] = new byte[s.length() / 2];
		StringBuffer buf = new StringBuffer(s);
		char c;
		int j = 0;
		for (int i = 0; i < b.length; i++) {
			c = buf.charAt(j);
			j++;
			if (c < '6') {
				b[i] = (byte) (buf.charAt(j) - 192);
			} else if (c < 'K') {
				b[i] = (byte) (buf.charAt(j) - '~');
			} else if (c < '`') {
				b[i] = (byte) (buf.charAt(j) - '$');
			} else {
				b[i] = (byte) (buf.charAt(j));
			}
			j++;
		}
		return encrypt(b, Cipher.DECRYPT_MODE);
	}

	private  byte[] encrypt(byte[] s, int mode) {
		DESKeySpec desKeySpec;
		SecretKeyFactory keyFac;
		byte[] ciphertext;

		try {
			keyFac = SecretKeyFactory.getInstance("DES");
			desKeySpec = new DESKeySpec(salt);
			SecretKey desKey = keyFac.generateSecret(desKeySpec);
			// Create DES Cipher
			Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

			// Initialize DES Cipher with key
			cipher.init(mode, desKey);
			// Encrypt the cleartext
			ciphertext = cipher.doFinal(s);
		} catch (Exception e) {
			e.printStackTrace();
			ciphertext = null;
		}
		return ciphertext;
	}
	
	public static void main(String[] args) throws Exception  {
		String s = "?s]97G`VS4aFF!=z]8FfHLTB2I;Af-Ee";
		
		YCEncrypt e = new YCEncrypt();
		String b = new String(e.decrypt(s), "utf-8");
		System.out.println(b);
		//String a = "0003&tongyi";
		
//		Encrypt cc = new Encrypt();
//		
//		
//		String c = cc.encrypt(("0003".concat("&").concat("tongyi")).getBytes("utf-8"));
//		
//		System.out.println(c);
	}
}
