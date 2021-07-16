package com.minhien.musicappasm.utils;

import android.content.Context;
import android.os.Debug;

import com.minhien.musicappasm.R;

public class LibUtility {

    public static int MODE_MULTIPLY = 1;
    public static int MODE_NONE = -1;
    public static int MODE_OVERLAY = 2;
    public static int MODE_SCREEN = 3;

//    public static int[] borderRes = new int[]{-1, R.drawable.frame_01, R.drawable.frame_02, R.drawable.frame_03, R.drawable.frame_04, R.drawable.frame_05, R.drawable.frame_06, R.drawable.frame_07, R.drawable.frame_08, R.drawable.frame_09, R.drawable.frame_10,
//            R.drawable.frame_11, R.drawable.frame_12, R.drawable.frame_13, R.drawable.frame_14, R.drawable.frame_15, R.drawable.frame_16, R.drawable.frame_17, R.drawable.frame_18, R.drawable.frame_19, R.drawable.frame_20};
//    public static int[] borderResThumb = new int[]{R.drawable.effect_0_thumb, R.drawable.frame_thumb_01, R.drawable.frame_thumb_02, R.drawable.frame_thumb_03, R.drawable.frame_thumb_04, R.drawable.frame_thumb_05, R.drawable.frame_thumb_06, R.drawable.frame_thumb_07, R.drawable.frame_thumb_08, R.drawable.frame_thumb_09, R.drawable.frame_thumb_10,
//            R.drawable.frame_thumb_11, R.drawable.frame_thumb_12, R.drawable.frame_thumb_13, R.drawable.frame_thumb_14, R.drawable.frame_thumb_15, R.drawable.frame_thumb_16, R.drawable.frame_thumb_17, R.drawable.frame_thumb_18, R.drawable.frame_thumb_19, R.drawable.frame_thumb_20};

//    public static boolean isAppPro = false;
//
//    public static int[] overlayDrawableList = new int[]{R.drawable.transparency500, R.drawable.overlay_01, R.drawable.overlay_02, R.drawable.overlay_03, R.drawable.overlay_04, R.drawable.overlay_05, R.drawable.overlay_06, R.drawable.overlay_07, R.drawable.overlay_08, R.drawable.overlay_09, R.drawable.overlay_10, R.drawable.overlay_11, R.drawable.overlay_12, R.drawable.overlay_13, R.drawable.overlay_14, R.drawable.overlay_15, R.drawable.overlay_16, R.drawable.overlay_17, R.drawable.overlay_18, R.drawable.overlay_19, R.drawable.overlay_20, R.drawable.overlay_21, R.drawable.overlay_22, R.drawable.overlay_23, R.drawable.overlay_24, R.drawable.overlay_26, R.drawable.overlay_27, R.drawable.overlay_28};
////    public static int[] overlayResThumb = new int[]{R.drawable.no_pattern, R.drawable.overlay_0_thumb, R.drawable.overlay_1_thumb, R.drawable.overlay_2_thumb, R.drawable.overlay_3_thumb, R.drawable.overlay_4_thumb, R.drawable.overlay_5_thumb, R.drawable.overlay_6_thumb, R.drawable.overlay_7_thumb, R.drawable.overlay_8_thumb, R.drawable.overlay_9_thumb, R.drawable.overlay_10_thumb, R.drawable.overlay_11_thumb, R.drawable.overlay_12_thumb, R.drawable.overlay_13_thumb, R.drawable.overlay_14_thumb, R.drawable.overlay_15_thumb, R.drawable.overlay_16_thumb, R.drawable.overlay_17_thumb, R.drawable.overlay_18_thumb, R.drawable.overlay_19_thumb, R.drawable.overlay_20_thumb, R.drawable.overlay_21_thumb, R.drawable.overlay_22_thumb, R.drawable.overlay_23_thumb, R.drawable.overlay_24_thumb, R.drawable.overlay_25_thumb, R.drawable.overlay_26_thumb};
//
//    public static int[] textureModes = new int[]{MODE_NONE, MODE_OVERLAY, MODE_SCREEN, MODE_OVERLAY, MODE_OVERLAY, MODE_SCREEN, MODE_SCREEN, MODE_OVERLAY, MODE_OVERLAY, MODE_OVERLAY, MODE_OVERLAY, MODE_OVERLAY, MODE_SCREEN, MODE_SCREEN, MODE_SCREEN, MODE_OVERLAY, MODE_SCREEN, MODE_SCREEN, MODE_SCREEN, MODE_OVERLAY, MODE_MULTIPLY, MODE_MULTIPLY, MODE_SCREEN, MODE_OVERLAY};
//    public static int[] textureRes = new int[]{R.drawable.transparency500, R.drawable.texture_01,
//            R.drawable.texture_03,
//            R.drawable.texture_04,
//            R.drawable.texture_22,
//            R.drawable.texture_05,
//            R.drawable.texture_06,
//            R.drawable.texture_07,
//            R.drawable.texture_08,
//            R.drawable.texture_09,
//            R.drawable.texture_10,
//            R.drawable.texture_26,
//            R.drawable.texture_11,
//            R.drawable.texture_12,
//            R.drawable.texture_13,
//            R.drawable.texture_23,
//            R.drawable.texture_14,
//            R.drawable.texture_15,
//            R.drawable.texture_16,
//            R.drawable.texture_18,
//            R.drawable.texture_19,
//            R.drawable.texture_21,
//            R.drawable.texture_02,
//            R.drawable.texture_24};
//
//    public static int[] colorGradientRes = new int[]{R.drawable.transparency500,
//        R.drawable.color_01,
//        R.drawable.color_02,
//        R.drawable.color_03,
//        R.drawable.color_04,
////        R.drawable.color_05,
//        R.drawable.color_06,
////        R.drawable.color_07,
////        R.drawable.color_08,
//        R.drawable.color_09,
//        R.drawable.color_010,
////        R.drawable.color_011,
////        R.drawable.color_012,
//        R.drawable.color_013,
//        R.drawable.color_014,
//        R.drawable.color_015,
//        R.drawable.color_016,
//        R.drawable.color_017,
//        R.drawable.color_018,
////        R.drawable.color_019,
//        R.drawable.color_020,
//};

    public static int[] sliderImage = new int[]{R.drawable.bai_3107, R.drawable.bai_3107_2, R.drawable.bai_anh_biet};

//    public static int[] textureResThumb = new int[]{R.drawable.no_pattern, R.drawable.texture_0_thumb,
//            R.drawable.texture_1_thumb,
//            R.drawable.texture_2_thumb,
//            R.drawable.texture_3_thumb,
//            R.drawable.texture_4_thumb,
//            R.drawable.texture_5_thumb,
//            R.drawable.texture_6_thumb,
//            R.drawable.texture_7_thumb,
//            R.drawable.texture_8_thumb,
//            R.drawable.texture_9_thumb,
//            R.drawable.texture_10_thumb,
//            R.drawable.texture_11_thumb,
//            R.drawable.texture_12_thumb,
//            R.drawable.texture_13_thumb,
//            R.drawable.texture_14_thumb,
//            R.drawable.texture_15_thumb,
//            R.drawable.texture_16_thumb,
//            R.drawable.texture_17_thumb,
//            R.drawable.texture_18_thumb,
//            R.drawable.texture_19_thumb,
//            R.drawable.texture_20_thumb,
//            R.drawable.texture_21_thumb,
//            R.drawable.texture_22_thumb};

    public interface BuyProVersion {
        void proVersionCalled();
    }

    public interface ExcludeTabListener {
        void exclude();
    }

    public interface FooterVisibilityListener {
        void setVisibility();
    }

//    public static boolean shouldShowAds(Context context) {
//        return !isAppPro;
//    }

    public static double getLeftSizeOfMemory() {
        double totalSize = Double.valueOf((double) Runtime.getRuntime().maxMemory()).doubleValue();
        double heapAllocated = Double.valueOf((double) Runtime.getRuntime().totalMemory()).doubleValue();
        return (totalSize - (heapAllocated - Double.valueOf((double) Runtime.getRuntime().freeMemory()).doubleValue())) - Double.valueOf((double) Debug.getNativeHeapAllocatedSize()).doubleValue();
    }

    public static void initNativeLib(Context context) {
//        try {
//            com.photo.collage.musically.grid.collage.Log.v("load so file retry");
//            System.loadLibrary("filter");
//        } catch (UnsatisfiedLinkError er) {
//            com.photo.collage.musically.grid.collage.Log.v("FAIL load so file retry");
//            Log.e(TAG, er.toString());
//            ApplicationInfo appInfo = context.getApplicationInfo();
//            String libName = "libfilter.so";
//            String destPath = context.getFilesDir().toString();
//            String soName;
//            try {
//                soName = destPath + File.separator + libName;
//                new File(soName).delete();
//                UnzipUtil.extractFile(appInfo.sourceDir, "lib/" + Build.CPU_ABI + "/" + libName, destPath);
//                System.load(soName);
//            } catch (IOException e) {
//                com.photo.collage.musically.grid.collage.Log.v("FAIL UNZIP load so file retry");
//
//                destPath = context.getExternalCacheDir().toString();
//                soName = destPath + File.separator + libName;
//                new File(soName).delete();
//                try {
//                    UnzipUtil.extractFile(appInfo.sourceDir, "lib/" + Build.CPU_ABI + "/" + libName, destPath);
//                    System.load(soName);
//                } catch (IOException e2) {
//                    com.photo.collage.musically.grid.collage.Log.v("FAIL RETRY 3 load so file retry");
//                    Log.e(TAG, "Exception in InstallInfo.init()" + e.toString());
//                    e.printStackTrace();
//                }
//            }
//        }
    }
}
