package cn.com.zhjnc.cloudmusicxposed;

/**
 * 云音乐各版本的类名与方法名
 */

public class CloudMusicVersion {
    private static final String PACKAGE = "com.netease.cloudmusic";

    public static String VERSION_NAME;
    public static String MALL_ENTRANCE_CLASS;
    public static String MALL_ENTRANCE_METHOD;
    public static String AD_CLASS;
    public static String AD_METHOD;
    public static String SHARE_LYRICS_CLASS;
    public static String SHARE_LYRICS_METHOD;
    public static String UPDATE_CLASS;
    public static String UPDATE_METHOD;
    public static String ABOUT_CLASS;
    public static String ABOUT_METHOD;
    public static String PICKER_CLASS;

    public CloudMusicVersion(String version) {
        VERSION_NAME = version;
        if (version.contains("4.2.0")) {
            set420();
        } else if (version.contains("4.2.3")) {
            set423();
        } else if (version.contains("4.3.4")) {
            set434();
        } else if (version.contains("4.3.5")) {
            set435();
        }
    }

    private void set420() {
        MALL_ENTRANCE_CLASS = PACKAGE + ".ui.j";
        MALL_ENTRANCE_METHOD = "w";
        AD_CLASS = PACKAGE + ".module.ad.c";
        AD_METHOD = "a";
        SHARE_LYRICS_CLASS = PACKAGE + ".module.o.b";
        SHARE_LYRICS_METHOD = "a";
        UPDATE_CLASS = PACKAGE + ".module.n.f";
        UPDATE_METHOD = "a";
        ABOUT_CLASS = PACKAGE + ".activity.AboutActivity";
        ABOUT_METHOD = "ab";
        PICKER_CLASS = PACKAGE + ".ui.a.a";
    }

    private void set423() {
        MALL_ENTRANCE_CLASS = PACKAGE + ".ui.j";
        MALL_ENTRANCE_METHOD = "w";
        AD_CLASS = PACKAGE + ".module.ad.c";
        AD_METHOD = "a";
        SHARE_LYRICS_CLASS = PACKAGE + ".module.o.c";
        SHARE_LYRICS_METHOD = "a";
        UPDATE_CLASS = PACKAGE + ".module.n.f";
        UPDATE_METHOD = "a";
        ABOUT_CLASS = PACKAGE + ".activity.AboutActivity";
        ABOUT_METHOD = "ab";
        PICKER_CLASS = PACKAGE + ".ui.a.a";
    }

    private void set434() {
        MALL_ENTRANCE_CLASS = PACKAGE + ".module.a.b";
        MALL_ENTRANCE_METHOD = "j";
        AD_CLASS = PACKAGE + ".module.ad.c";
        AD_METHOD = "a";
        SHARE_LYRICS_CLASS = PACKAGE + ".module.o.g";
        SHARE_LYRICS_METHOD = "a";
        UPDATE_CLASS = PACKAGE + ".module.n.f";
        UPDATE_METHOD = "a";
        ABOUT_CLASS = PACKAGE + ".activity.AboutActivity";
        ABOUT_METHOD = "ab";
        PICKER_CLASS = PACKAGE + ".ui.MaterialDiloagCommon.a";
    }

    private void set435() {
        MALL_ENTRANCE_CLASS = PACKAGE + ".module.a.b";
        MALL_ENTRANCE_METHOD = "j";
        AD_CLASS = PACKAGE + ".module.ad.c";
        AD_METHOD = "a";
        SHARE_LYRICS_CLASS = PACKAGE + ".module.o.h";
        SHARE_LYRICS_METHOD = "a";
        UPDATE_CLASS = PACKAGE + ".module.n.f";
        UPDATE_METHOD = "a";
        ABOUT_CLASS = PACKAGE + ".activity.AboutActivity";
        ABOUT_METHOD = "ab";
        PICKER_CLASS = PACKAGE + ".ui.MaterialDiloagCommon.a";
    }

}
