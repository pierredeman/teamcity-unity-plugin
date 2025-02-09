/*
 * Copyright 2000-2023 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jetbrains.buildServer.unity.fetchers

import jetbrains.buildServer.serverSide.DataItem
import jetbrains.buildServer.serverSide.ProjectDataFetcher
import jetbrains.buildServer.util.browser.Browser

class UnityBuildTargetFetcher : ProjectDataFetcher {

    override fun getType() = "UnityBuildTarget"

    override fun retrieveData(fsBrowser: Browser, projectFilePath: String) = players.map {
        DataItem(it, null)
    }.toMutableList()

    companion object {
        private val players = listOf(
                "Android",
                "EmbeddedLinux",
                "GameCoreXboxOne",
                "GameCoreXboxSeries",
                "iOS",
                "Linux64",
                "LinuxHeadlessSimulation",
                "OSXUniversal",
                "PS4",
                "PS5",
                "QNX",
                "Standalone",
                "StandaloneLinux64",
                "StandaloneOSX",
                "StandaloneWindows",
                "StandaloneWindows64",
                "Switch",
                "tvOS",
                "WebGL",
                "WindowsStoreApps",
                "XboxOne"
        )
    }
}