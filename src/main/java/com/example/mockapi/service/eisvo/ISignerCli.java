package com.example.mockapi.service.eisvo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ISignerCli {
    private String cliPath;

    public ISignerCli(String cliPath) throws IOException {
        File f = new File(cliPath);

        if (f.exists() && !f.isDirectory()) {
            this.cliPath = cliPath;
        } else {
            throw new IOException("Cli executable file not exists: \"" + cliPath + "\"");
        }
    }

//    private static String _exec(String[] cmd) throws IOException, InterruptedException {
//        ProcessBuilder processBuilder = new ProcessBuilder(cmd);
//        processBuilder.redirectErrorStream(true); // Redirect error stream to merge with input stream
//        Process process = processBuilder.start();
//
//        process.waitFor();
//
//        String res = "";
//        try (BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
//            String line;
//            while ((line = input.readLine()) != null) {
//                res += line + "\n";
//            }
//        }
//
//        int exitCode = process.exitValue();
//        if (exitCode != 0) {
//            throw new RuntimeException("Command failed with exit code " + exitCode + "\nOutput:\n" + res);
//        }
//
//        return res.trim();
//    }

    private static String _exec(String[] cmd) throws IOException, InterruptedException {
        Process process = Runtime.getRuntime().exec(cmd);
        process.waitFor();
        String res = "";
        try (BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String temp;
            while ((temp = input.readLine()) != null) {
                res += temp + "\n";
            }
        }
        if (process.exitValue() != 0) {
            throw new RuntimeException(res);
        }
        return res.trim();
    }

    //  show information about library and license
    public String about() throws IOException, InterruptedException {
        String[] cmd = {cliPath, "-about"};
        return _exec(cmd);
    }

    //  show machine uid
    public String uid() throws IOException, InterruptedException {
        String[] cmd = {cliPath, "-uid"};
        return _exec(cmd);
    }

    //  generate machine token
    public String token() throws IOException, InterruptedException {
        String[] cmd = {cliPath, "-token"};
        return _exec(cmd);
    }

    //  calculate hash (digest) of text (alg: UZDST 1106:2009 II)
    public String digest(String text) throws IOException, InterruptedException {
        String[] cmd = {cliPath, "-digest", text};
        return _exec(cmd);
    }

    //  calculate hash (digest) of file (alg: UZDST 1106:2009 II) v1.0.3+
    public String digestFile(String path) throws IOException, InterruptedException {
        String[] cmd = {cliPath, "-digestfile", path};
        return _exec(cmd);
    }

    //  untokenize signature
    public String extractSignature(String esignAsBase64) throws IOException, InterruptedException {
        String[] cmd = {cliPath, "-extract", esignAsBase64};
        return _exec(cmd);
    }

    //  verify signature (alg: 1092:2009 I & II)
    public boolean verifySignature(String digestAsBase64, String certAsFilePathOrBase64, String extractedSignatureAsBase64) throws IOException, InterruptedException {
        String[] cmd = {cliPath, "-verify", digestAsBase64, certAsFilePathOrBase64, extractedSignatureAsBase64};
        return Boolean.parseBoolean(_exec(cmd));
    }

    //  parse X.509 certificate
    public String parseCertificate(String certAsFilePathOrBase64) throws IOException, InterruptedException {
        String[] cmd = {cliPath, "-cerparse", certAsFilePathOrBase64};
        return _exec(cmd);
    }

    //  generate signature (alg: 1092:2009 I & II) v1.0.2+
    public String generateSignature(String digestAsBase64, String pfxAsFilePathOrBase64, String pfxPassword, String token) throws IOException, InterruptedException {
        String[] cmd = {cliPath, "-sign", digestAsBase64, pfxAsFilePathOrBase64, pfxPassword, token};
        return _exec(cmd);
    }

    //  verify tokenized signature (alg: 1092:2009 I & II) v1.0.2+
    public boolean verifyUnextractedSignature(String digestAsBase64, String certAsFilePathOrBase64, String unextractedSignatureAsBase64) throws IOException, InterruptedException {
        String[] cmd = {cliPath, "-verifytokenized", digestAsBase64, certAsFilePathOrBase64, unextractedSignatureAsBase64};
        return Boolean.parseBoolean(_exec(cmd));
    }

    //  verify certificate signature v1.0.3+
    public boolean verifyCertificateSignature(String certAsFilePathOrBase64, String rootCertAsFilePathOrBase64) throws IOException, InterruptedException {
        String[] cmd = {cliPath, "-cerverify", certAsFilePathOrBase64, rootCertAsFilePathOrBase64};
        return Boolean.parseBoolean(_exec(cmd));
    }

    //  verify crl signature v1.0.3+
    public boolean verifyCrlSignature(String crlAsFilePathOrBase64, String rootCertAsFilePathOrBase64) throws IOException, InterruptedException {

        String[] cmd = {cliPath, "-crlverify", crlAsFilePathOrBase64, rootCertAsFilePathOrBase64};
        return Boolean.parseBoolean(_exec(cmd));
    }

    //  check if certificate revoked, i.e. is in revocation list (crl) v1.0.3+
    public boolean checkIfCertificateRevoked(String certAsFilePathOrBase64, String crlAsFilePathOrBase64) throws IOException, InterruptedException {
        String[] cmd = {cliPath, "-cerisrevoked", certAsFilePathOrBase64, crlAsFilePathOrBase64};
        return Boolean.parseBoolean(_exec(cmd));
    }
}
    