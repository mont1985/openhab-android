/*
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.openhab.habdroid.util

object PrefKeys {
    /**
     * Settings keys
     */
    const val DEMO_MODE = "default_openhab_demomode"
    const val LOCAL_URL = "default_openhab_url"
    const val LOCAL_USERNAME = "default_openhab_username"
    const val LOCAL_PASSWORD = "default_openhab_password"
    const val REMOTE_URL = "default_openhab_alturl"
    const val REMOTE_USERNAME = "default_openhab_remote_username"
    const val REMOTE_PASSWORD = "default_openhab_remote_password"
    const val SSL_CLIENT_CERT = "default_openhab_sslclientcert"

    const val SITEMAP_NAME = "default_openhab_sitemap"
    const val SITEMAP_LABEL = "default_openhab_sitemap_label"
    const val CLEAR_DEFAULT_SITEMAP = "default_openhab_clear_default_sitemap"
    const val SHOW_SITEMAPS_IN_DRAWER = "show_sitemaps"
    const val ICON_FORMAT = "iconFormatType"
    const val CLEAR_CACHE = "default_openhab_cleacache"
    const val CHART_SCALING = "chartScalingFactor"
    const val CHART_HQ = "default_openhab_chart_hq"

    const val THEME = "theme"
    const val ACCENT_COLOR = "theme_color"
    const val SCREEN_TIMER_OFF = "default_openhab_screentimeroff"
    const val FULLSCREEN = "default_openhab_fullscreen"

    const val SEND_DEVICE_INFO_PREFIX = "sendDeviceInfoPrefix"
    const val ALARM_CLOCK = "alarmClock"
    const val PHONE_STATE = "phoneState"

    const val SCREEN_LOCK = "screen_lock"
    const val TASKER_PLUGIN_ENABLED = "taskerPlugin"
    const val TONE = "default_openhab_alertringtone"
    const val NOTIFICATION_VIBRATION = "default_openhab_notification_vibration"
    const val NOTIFICATION_TONE_VIBRATION = "default_openhab_alertringtone_vibration"
    const val DEBUG_MESSAGES = "default_openhab_debug_messages"
    const val LOG = "default_openhab_log"

    /**
     * Application state flags
     */
    const val COMPARABLE_VERSION = "versionAsInt"
    const val FIRST_START = "firstStart"
    const val RECENTLY_RESTORED = "recentlyRestored"
    const val ALARM_CLOCK_LAST_VALUE_WAS_UNDEF = "alarmClockLastWasZero"
    const val PREV_SERVER_FLAGS = "prevServerFlags"

    /**
     * "Tooltip shown" flags
     */
    const val SWIPE_REFRESH_EXPLAINED = "swipToRefreshExplained"
    const val NFC_INFO_HINT_SHOWN = "nfcInfoHintShown"

    /**
     * PreferencesActivity subpages
     */
    const val SUBSCREEN_LOCAL_CONNECTION = "default_openhab_local_connection"
    const val SUBSCREEN_REMOTE_CONNECTION = "default_openhab_remote_connection"
}
