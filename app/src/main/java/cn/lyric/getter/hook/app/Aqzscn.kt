package cn.lyric.getter.hook.app

import cn.lyric.getter.hook.BaseHook
import cn.lyric.getter.tool.HookTools

object Aqzscn : BaseHook() {
    override fun init() {
        super.init()
        HookTools.MockFlyme().mock().notificationLyric()
    }
}