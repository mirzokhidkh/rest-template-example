//package com.example.mockapi.service.eisvo;
//
//import com.example.mockapi.model.payload.SignResult;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import java.nio.charset.StandardCharsets;
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//import java.util.Base64;
//
//@Service
//public class SignService {
//    private static final Logger logger =
//            LoggerFactory.getLogger(SignService.class);
//    @Value("${cert.number}")
//    private String serialNumber;
//    @Value("${cli.url}")
//    private String cliUrl;
//    @Value("${pfx.url}")
//    private String pfxUrl;
//    @Value("${pfx.password}")
//    private String pfxPassword;
//    @Value("${token}")
//    private String token;
//
//    public SignResult signData(String data) throws Exception {
////        logger.info("DATA: "+data);
//        SignResult signResult;
//
//        signResult = new SignResult();
//
//        long timeStamp = System.currentTimeMillis();
//        signResult.setTimeStamp(timeStamp);
//        signResult.setSerialNumber(serialNumber);
////        logger.info("timeStamp: "+timeStamp);
////        logger.info("serialNumber: "+serialNumber);
//        // ----
//        ISignerCli signer = new ISignerCli(cliUrl);
//        String digestAsBase64 = Base64
//                .getEncoder().encodeToString(getMD5((String.valueOf(timeStamp) + ":" + String.valueOf(serialNumber) + ":" + data).getBytes(StandardCharsets.UTF_8))
//                        .getBytes());
//        // --------
//
//        String signature = signer.generateSignature(digestAsBase64, pfxUrl, pfxPassword, token);
//        signResult.setSignature(signature);
//
//        return signResult;
//    }
//
//
//    /**
//     * MD5 generation link https://stackoverflow.com/questions/415953/how-can-i-generate-an-md5-hash
//     * When working with strings and the crypto classes be sure to always specify the encoding you want the byte representation in.
//     * If you just use string.getBytes() it will use the platform default. (Not all platforms use the same defaults)
//     */
//    private String getMD5(byte[] inbytes) throws NoSuchAlgorithmException {
//        if (inbytes == null)
//            return "";
//        StringBuilder md5 = new StringBuilder();
//        MessageDigest algorithm = MessageDigest.getInstance("MD5");
//        algorithm.reset();
//        byte bytes[] = algorithm.digest(inbytes);
//        String hexStr;
//        for (int i = 0; i < bytes.length; i++) {
//            hexStr = Integer.toHexString(0xFF & bytes[i]);
//            if (hexStr.length() == 1)
//                md5.append('0');
//            md5.append(hexStr);
//        }
//
////        logger.info("MD5: "+md5.toString());
//        return md5.toString();
//    }
//}
