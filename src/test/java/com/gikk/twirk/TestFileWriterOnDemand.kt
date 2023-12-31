package com.gikk.twirk

import com.crazy.FileWriterV2
import com.crazy.models.FileWriterConfigV2
import org.junit.Test
import java.io.File

class TestFileWriterOnDemand {

    // TODO Crab: Change the message here
    private val message1 = """@badge-info=;badges=glhf-pledge/1;bits=1;color=#0000FF;display-name=WhosMontu;emotes=;first-msg=1;flags=;id=998b364d-b7ed-4b82-9d9e-a7046122b9f0;mod=0;returning-chatter=0;room-id=641972806;subscriber=0;tmi-sent-ts=1690439036917;turbo=0;user-id=464801243;user-type= :whosmontu!whosmontu@whosmontu.tmi.twitch.tv PRIVMSG #angel_steps :Cheer1 WootWoot"""

    private val messages = mutableListOf<String>()

    @Test
    fun fileWritingAndListening() {

        messages.add(message1)

        val fileWriter = FileWriterV2()
        fileWriter.initFiles(null, true)

        messages.forEach {
            fileWriter.listen(it)
        }


//        deleteTestFiles() // Comment out to see files

    }

    /*
            val message = "@badge-info=subscriber/11;badges=subscriber/9,no_video/1;color=#CC00BE;display-name=Necrothunder;emotes=emotesv2_fac9579a586f4b36a7c21e383be42e81:0-11/emotesv2_ab9b81ab9e604163b479752364d0bf84:13-24;flags=;" +
"id=444f92fd-d271-471d-8fbc-8007da894e8e;login=necrothunder;mod=0;msg-id=resub;msg-param-cumulative-months=11;msg-param-months=0;msg-param-multimonth-duration=0;msg-param-multimonth-tenure=0;msg-param-should-share-streak=1;" +
"msg-param-streak-months=11;msg-param-sub-plan-name=Channel\\sSubscription\\s(fefe_asmr);msg-param-sub-plan=1000;msg-param-was-gifted=false;room-id=806193178;subscriber=1;" +
"system-msg=Necrothunder\\ssubscribed\\sat\\sTier\\s1.\\sThey've\\ssubscribed\\sfor\\s11\\smonths,\\scurrently\\son\\sa\\s11\\smonth\\sstreak!;tmi-sent-ts=1690439510004;user-id=23749073;user-type= :tmi.twitch.tv USERNOTICE #fefe_asmr :fefeasmrCozy fefeasmrMelt"

     */


    private fun deleteTestFiles(config: FileWriterConfigV2) {
        config.fileDefinitions.forEach {
            File(it.fullFileName).delete()
        }
    }
    private fun setFileWriterConfig() {

    }
}