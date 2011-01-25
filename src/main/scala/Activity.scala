package com.example.androidtest

import _root_.android.app.TabActivity
import _root_.android.content.Intent
import _root_.android.os.Bundle


class TabLayoutWidget extends TabActivity {
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)

    val res     = getResources()
    val tabHost = getTabHost()

    val intent = new Intent().setClass(this, classOf[ArtistsActivity])
    val spec   = tabHost.newTabSpec("artists").setIndicator(
      "Artists",
      res.getDrawable(R.drawable.ic_tab_artists)
    ).setContent(intent)
    tabHost.addTab(spec)

    val intent2 = new Intent().setClass(this, classOf[SongsActivity])
    val spec2   = tabHost.newTabSpec("songs").setIndicator(
      "Songs",
      res.getDrawable(R.drawable.ic_tab_artists)
    ).setContent(intent2)
    tabHost.addTab(spec2)

    val intent3 = new Intent().setClass(this, classOf[AlbumsActivity])
    val spec3   = tabHost.newTabSpec("albums").setIndicator(
      "Albums",
      res.getDrawable(R.drawable.ic_tab_artists)
    ).setContent(intent3)
    tabHost.addTab(spec3)

    tabHost.setCurrentTab(2)
  }
}
