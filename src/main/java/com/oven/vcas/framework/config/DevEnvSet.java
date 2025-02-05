package com.oven.vcas.framework.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.maven.model.Model;
import org.apache.maven.model.Profile;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;

import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.List;
import java.util.Properties;

/**
 * 开发环境配置
 *
 * @author Oven
 */
@Slf4j
public class DevEnvSet {

    /**
     * Win
     */
    private static void configWithWin(Properties properties) {
        properties.put("log.home", "E:\\logs\\vcas\\");
        properties.put("license.path", "E:\\logs\\vcas\\license\\license.lic");
        properties.put("license.publicKeysStore.path", "E:\\logs\\vcas\\license\\publicCerts.keystore");

        properties.put("avatar.path", "E:\\logs\\vcas\\files\\avatar\\");
        properties.put("model.test.path", "E:\\logs\\vcas\\files\\model\\");
        properties.put("person_img_path", "E:\\logs\\vcas\\files\\person\\");
        properties.put("video_default_pic_path", "E:\\logs\\vcas\\files\\device\\");
        properties.put("analysis_image_path", "E:\\logs\\vcas\\files\\alarm\\image\\");
        properties.put("analysis_video_path", "E:\\logs\\vcas\\files\\alarm\\video\\");
        properties.put("capture_video_path", "E:\\logs\\vcas\\files\\capture\\");
    }

    /**
     * Mac
     */
    private static void configWithMac(Properties properties) {
        properties.put("log.home", "/Users/oven/logs/vcas/logs/");
        properties.put("license.path", "/Users/oven/logs/license/license.lic");
        properties.put("license.publicKeysStore.path", "/Users/oven/logs/license/publicCerts.keystore");

        properties.put("avatar.path", "/Users/oven/logs/vcas/files/avatar/");
        properties.put("model.test.path", "/Users/oven/logs/vcas/files/model/");
        properties.put("person_img_path", "/Users/oven/logs/vcas/files/person/");
        properties.put("video_default_pic_path", "/Users/oven/logs/vcas/files/device/");
        properties.put("analysis_image_path", "/Users/oven/logs/vcas/files/alarm/image/");
        properties.put("analysis_video_path", "/Users/oven/logs/vcas/files/alarm/video/");
        properties.put("capture_video_path", "/Users/oven/logs/vcas/files/capture/");
    }

    /**
     * 开发环境根据自己操作系统和相关文件路径修改一下配置
     */
    public static void config(Properties properties) {
        try {
            String profile = String.valueOf(properties.get("vcas.profile"));
            if (PropertyConfig.PRO_PROFILE.equals(profile)) {
                return;
            }
            // 校验githook
            if (!checkGitHook()) {
                log.info("\n\n\n" + String.format("\033[%d;%dm%s\033[0m", 33, 1, "=========================== 请先执行 ") +
                        String.format("\033[%d;%dm%s\033[0m", 31, 1, "mvn compile clean") +
                        String.format("\033[%d;%dm%s\033[0m", 33, 1, " 命令 ===========================\n\n"));
                System.exit(-1);
            }
            log.info("=========================== >>> 开始初始化开发环境配置");
            properties.put("logging.config", "classpath:logback-dev.xml");

            MavenXpp3Reader reader = new MavenXpp3Reader();
            String path = System.getProperty("user.dir") + File.separator + "pom.xml";
            Model model = reader.read(new FileReader(path));
            List<Profile> profiles = model.getProfiles();
            for (Profile platform : profiles) {
                if (!platform.getActivation().isActiveByDefault()) {
                    continue;
                }
                // Mac
                if (platform.getProperties().get("platform").toString().startsWith("m")) {
                    configWithMac(properties);
                }
                // Win
                if (platform.getProperties().get("platform").toString().startsWith("w")) {
                    configWithWin(properties);
                }
            }
            log.info("=========================== >>> 初始化开发环境配置完成");
        } catch (Exception e) {
            log.error("=========================== >>> 初始化开发环境配置异常：", e);
        }
    }

    /**
     * 校验githook
     */
    private static boolean checkGitHook() {
        URL url = DevEnvSet.class.getResource("/");
        if (url == null) {
            return false;
        }
        String filePath = url.getPath().replace("target/classes/", "") + ".git" + File.separator + "hooks" + File.separator + "pre-commit";
        File preCommitFile = new File(filePath);
        return preCommitFile.exists();
    }

}
