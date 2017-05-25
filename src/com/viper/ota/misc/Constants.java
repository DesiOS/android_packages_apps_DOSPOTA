/*
 * Copyright (C) 2012 The CyanogenMod Project
 * Copyright (C) 2017 Henrique Silva (jhenrique09)
 * Copyright (C) 2017 The LineageOS Project
 *
 * * Licensed under the GNU GPLv2 license
 *
 * The text of the license can be found in the LICENSE file
 * or at https://www.gnu.org/licenses/gpl-2.0.txt
 */

package com.viper.ota.misc;

public class Constants {
    // Download related
    public static final String UPDATES_FOLDER = "ViperOTA";
    public static final String DOWNLOAD_ID = "download_id";
    public static final String DOWNLOAD_NAME = "download_name";
    public static final String DOWNLOAD_TMP_EXT = ".tmp";

    // Preferences
    public static final String ENABLE_PREF = "pref_enable_updates";
    public static final String UPDATE_CHECK_PREF = "pref_update_check_interval";
    public static final String LAST_UPDATE_CHECK_PREF = "pref_last_update_check";
    public static final String CHECK_MD5_PREF = "pref_check_md5";
    public static final String WIPE_CACHE_PREF = "pref_wipe_cache";
    public static final String WIPE_DALVIK_PREF = "pref_wipe_dalvik";
    public static final String WIPE_DATA_PREF = "pref_wipe_data";

    // Update Check items
    public static final String BOOT_CHECK_COMPLETED = "boot_check_completed";
    public static final int UPDATE_FREQ_NONE = -2;
    public static final int UPDATE_FREQ_DAILY = 86400;
    public static final int UPDATE_FREQ_WEEKLY = 604800;
    public static final int UPDATE_FREQ_BI_WEEKLY = 1209600;
    public static final int UPDATE_FREQ_MONTHLY = 2419200;

    // Build vars
    public static final String CURRENT_DEVICE_NAME = "ro.viper.device";
    public static final String CURRENT_VERSION = "ro.viper.version";

    // Expressions
    public static final String FILENAME_DATE_FORMAT = "yyyyMMdd";

    // Default wipe options
    public static final boolean WIPE_CACHE_BY_DEFAULT = false;
    public static final boolean WIPE_DALVIK_BY_DEFAULT = false;
    public static final boolean WIPE_DATA_BY_DEFAULT = false;
}
