package expo.modules.settings

import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class ExpoSettingsModule : Module() {
    companion object {
        @JvmStatic
        external fun stringFromJNI(): String;

        init {
            System.loadLibrary("native-lib")
        }
    }

    override fun definition() = ModuleDefinition {
        Name("ExpoSettings")

        Function("getTheme") {
            stringFromJNI()
        }
    }

}