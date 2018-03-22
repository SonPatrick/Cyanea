package com.jaredrummler.cyanea

import android.annotation.SuppressLint
import android.app.Application
import android.content.SharedPreferences
import android.content.res.Resources
import android.support.annotation.ColorInt

class Cyanea private constructor(private val prefs: SharedPreferences) {

  @ColorInt var primary: Int
  @ColorInt var primaryLight: Int
  @ColorInt var primaryDark: Int

  @ColorInt var accent: Int
  @ColorInt var accentLight: Int
  @ColorInt var accentDark: Int

  @ColorInt var backgroundDark: Int
  @ColorInt var backgroundDarkDarker: Int
  @ColorInt var backgroundDarkLighter: Int

  @ColorInt var backgroundLight: Int
  @ColorInt var backgroundLightLighter: Int
  @ColorInt var backgroundLightDarker: Int

  init {
    primary = prefs.getInt(PREF_PRIMARY,
        res.getColor(R.color.color_primary_reference))
    primaryDark = prefs.getInt(PREF_PRIMARY_DARK,
        res.getColor(R.color.color_primary_dark_reference))
    primaryLight = prefs.getInt(PREF_PRIMARY_LIGHT,
        res.getColor(R.color.color_primary_light_reference))

    accent = prefs.getInt(PREF_ACCENT,
        res.getColor(R.color.color_accent_reference))
    accentDark = prefs.getInt(PREF_ACCENT_DARK,
        res.getColor(R.color.color_accent_dark_reference))
    accentLight = prefs.getInt(PREF_ACCENT_LIGHT,
        res.getColor(R.color.color_accent_light_reference))

    backgroundLight = prefs.getInt(PREF_BACKGROUND_LIGHT,
        res.getColor(R.color.color_background_light))
    backgroundLightDarker = prefs.getInt(PREF_BACKGROUND_LIGHT_DARKER,
        res.getColor(R.color.color_background_light_darker))
    backgroundLightLighter = prefs.getInt(PREF_BACKGROUND_LIGHT_LIGHTER,
        res.getColor(R.color.color_background_light_lighter))

    backgroundDark = prefs.getInt(PREF_BACKGROUND_DARK,
        res.getColor(R.color.color_background_dark))
    backgroundDarkDarker = prefs.getInt(PREF_BACKGROUND_DARK_DARKER,
        res.getColor(R.color.color_background_dark_darker))
    backgroundDarkLighter = prefs.getInt(PREF_BACKGROUND_DARK_LIGHTER,
        res.getColor(R.color.color_background_dark_lighter))
  }

  companion object {
    private val PREF_PRIMARY = "primary"
    private val PREF_PRIMARY_DARK = "primary_dark"
    private val PREF_PRIMARY_LIGHT = "primary_light"

    private val PREF_ACCENT = "accent"
    private val PREF_ACCENT_DARK = "accent_dark"
    private val PREF_ACCENT_LIGHT = "accent_light"

    private val PREF_BACKGROUND_LIGHT = "background_light"
    private val PREF_BACKGROUND_LIGHT_DARKER = "background_light_darker"
    private val PREF_BACKGROUND_LIGHT_LIGHTER = "background_light_lighter"

    private val PREF_BACKGROUND_DARK = "background_dark"
    private val PREF_BACKGROUND_DARK_DARKER = "background_dark_darker"
    private val PREF_BACKGROUND_DARK_LIGHTER = "background_dark_lighter"

    @SuppressLint("StaticFieldLeak") // application context is safe
    lateinit var app: Application
    lateinit var res: Resources

    fun init(app: Application, res: Resources) {
      this.app = app
      this.res = res
    }

  }

}